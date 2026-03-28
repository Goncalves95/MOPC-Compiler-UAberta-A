# MOPC Compiler - Grupo "It Compiles on My Machine" 🚀

[cite_start]Projeto desenvolvido para a UC de Compilação (21018) da Universidade Aberta.
[cite_start]Este compilador processa a linguagem **MOCP** (My Own C in Português).

## 🛠️ Pré-requisitos
* **Python 3.10+**
* [cite_start]**Java Runtime Environment (JRE)** (necessário para correr o gerador ANTLR).
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

Source for ANTLR: https://github.com/antlr/antlr4/blob/master/doc/python-target.md