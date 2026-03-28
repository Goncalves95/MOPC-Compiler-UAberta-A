import sys
import os
from antlr4 import *

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
    
    if not os.path.exists(input_file):
        print(f"[ERRO] Ficheiro não encontrado: {input_file}")
        return

    input_stream = FileStream(input_file, encoding='utf-8')
    lexer = MOCPLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MOCPParser(stream)
    
    try:
        tree = parser.program()
        if parser.getNumberOfSyntaxErrors() > 0:
            print(f"\n[FALHA] Foram detetados erros sintáticos.")
        else:
            print("\n[SUCESSO] Código MOCP validado com sucesso!")
    except Exception as e:
        print(f"Erro na análise: {e}")

if __name__ == "__main__":
    main()