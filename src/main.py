import sys
import os
from antlr4 import *
from antlr4.tree.Trees import Trees

current_dir = os.path.dirname(os.path.abspath(__file__))
sys.path.append(current_dir)

try:
    from MOCPLexer import MOCPLexer
    from MOCPParser import MOCPParser
except ImportError as e:
    print(f"[ERRO CRÍTICO] Não foi possível importar os ficheiros: {e}")
    sys.exit(1)

def main():
    if len(sys.argv) < 2:
        print("Uso: python3 src/main.py examples/teste.mocp")
        return

    input_file = sys.argv[1]
    input_stream = FileStream(input_file, encoding='utf-8')
    lexer = MOCPLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MOCPParser(stream)
    
    try:
        print("[DEBUG] A iniciar o parser...")
        tree = parser.program()
        if parser.getNumberOfSyntaxErrors() > 0:
            print(f"\n[FALHA] Erros sintáticos detetados.")
        else:
            print("\n[SUCESSO] Código MOCP válido!")
            
            # --- GERA O FICHEIRO PARA A ÁRVORE VISUAL ---
            from antlr4.tree.Trees import Trees
            dot_content = tree_to_dot(tree, parser)
            with open("tree.dot", "w") as f:
                f.write(dot_content)
            print("[INFO] Ficheiro 'tree.dot' gerado. Usa um visualizador de Graphviz para ver a AST.")
            
    except Exception as e:
        print(f"Erro na análise: {e}")

def tree_to_dot(tree, parser):
    """Gera uma string no formato DOT para visualização da árvore."""
    res = ["digraph G {"]
    def _visit(node):
        node_id = id(node)
        # Pegamos no texto do nó
        name = Trees.getNodeText(node, parser.ruleNames)
        
        # LIMPEZA: Remove aspas duplas para não quebrar o ficheiro .dot
        clean_name = name.replace('"', '')
        
        res.append(f'  {node_id} [label="{clean_name}"];')
        if hasattr(node, 'children') and node.children:
            for child in node.children:
                res.append(f'  {node_id} -> {id(child)};')
                _visit(child)
    _visit(tree)
    res.append("}")
    return "\n".join(res)

if __name__ == "__main__":
    main()