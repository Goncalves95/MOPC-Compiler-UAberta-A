# MOPC Compiler - Grupo "It Compiles on My Machine" 🚀

[cite_start]Projeto desenvolvido para a UC de Compilação (21018) da Universidade Aberta. [cite: 2, 4]
[cite_start]Este compilador processa a linguagem **MOCP** (My Own C in Português). [cite: 52]

## 🛠️ Pré-requisitos
* **Python 3.10+**
* [cite_start]**Java Runtime Environment (JRE)** (necessário para correr o gerador ANTLR). [cite: 26, 30]
* **ANTLR 4.13.x** (ficheiro `.jar` incluído ou via sistema).

## 📦 Instalação
Instale o runtime do ANTLR para Python:
```bash
pip install antlr4-python3-runtime
```

## Como Gerar o Parser

```bash
antlr4 -Dlanguage=Python3 -visitor -no-listener grammar/MOCP.g4 -o src/
```


## Como Executar

```bash
python3 src/main.py <caminho_para_ficheiro.mopc>
```

