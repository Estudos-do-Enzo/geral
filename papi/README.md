# Geral

Uma observação sobre arquivos Java.

Um ou mais arquivos Java pode ter pacotes (package lista1|lista2|lista3;). Neste caso, **deste diretório**, gere o arquivo .class assim (supondo o JDK já estar instalado):

```bash
javac lista2/Exercicio1.java
```

O caminho do arquivo acima é um exemplo.

E o execute assim por exemplo, **estando neste diretório**:

```bash
java lista2.Exercicio1
```