# Introduction

## What is a compiler?
On a high level a compiler takes your raw source code and turns it into an exacutable that your system can run.
For example some compilers you may have used before:
- `gcc` The Gnu Compiler Collection - allows for compilation of C / C++ / Fortran and many more
- `javac` The compiler to compile java source code - you have used this if you reading this probably

## How does a compiler work
On a very high level the compiler works similarly to how we process speech.
1. Lexical analisis - lexing - Taking in the raw source ("Words") and turning them into a set of tokens that we can more easily track
2. Parsing - syntax analisis - have you ever had a syntax error, well that most likely came from this sections (or lexing if it isn't a token) this checks tokens that we generated in lexing and can output a wide range of things depending on how you set it.
3. Semantic Analysis - This makes sure that the source code / tokens accually mean something, while parsing makes sure that they all exist this makes sure that can be in that order, for something like `6 i ; = int` might pass parsing but won't pass this stage. This also includes type checking, where the progrma makes sure that all of the data types can exist properly
4. AST gen - Abstract syntax tree - this generated a tree (you know like the data structure) of all of the tokens in a way that makes it easier to output into an IR
5. Codegen - This can either be some sort of IR (intermediate representation) that gets optimized later or it could also be what is directly outputed (eg. raw assembly)
