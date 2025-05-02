# Mint Programming Language

**Team Name**: SER502-Group25  
**Language Name**: Mint  
**Course**: SER 502 — Language and Programming Paradigms  
**Semester**: Spring 2025
**Members**: Kiran Venkatachalam, Monisha Krishnamurthy, Rahul Ravindra Reddy, Vishnu Kumar Adhilakshmi Kalidas
---

## About Mint

Mint is a simple, beginner-friendly programming language being developed as part of our course project. It uses more readable and modern keywords.

In this milestone, we’ve set up the project, defined our team structure, and started writing the grammar using ANTLR.
Updated:
We have finished writing the Evaluator for Mint. Our interpreter parses and executes .mint programs using ANTLR and a custom-built MintEvaluator that handles type checking, loops, conditionals, and arithmetic operations. The language is designed to be readable, minimal, and extensible.
---

## Checkpoint 1:

- Created private GitHub repo for the group  
- Finalized the language name (`Mint`)  
- Added `Mint.g4` grammar file with initial Lexer Rules.
- Added few sample `.mint` programs.  
- Set up project structure  
- Successfully generated lexer and viewed the parse tree using ANTLR’s TestRig GUI

---

## Checkpoint 2:

- Implemented the MintEvaluator class to traverse and evaluate the parse tree using the visitor pattern.
- Handled expression evaluation for arithmetic, logical, comparison, equality, ternary, and primary expressions with strict type checking.
- Added support for variable declarations, assignments, and type validation (mint_int, mint_float, mint_bool, mint_string).
- Implemented control flow constructs: mint_if, mint_else, mint_while, and mint_for, including mint_break and mint_continue logic.
- Built an end-to-end interpreter that executes .mint files and displays both console output and parse tree successfully.

---

## Tools We’re Using

- **ANTLR 4.13.2** — for lexer and parser generation  
- **Java** — for running the language  
- **VS Code** — as our development IDE  
- **ANTLR GUI (TestRig)** — to view the parse tree  
- **GitHub** — for version control and team collaboration

---

## Platforms We Plan to Support

- macOS  
- Windows  
- Linux

Since the language runs on Java and ANTLR, it should be platform-independent.

---

## Project Structure (Milestone 1)
.
├── Mint.g4
├── README.md
├── antlr-4.13.2-complete.jar
├── build
│   ├── gen
│   │   ├── MintBaseListener.class
│   │   ├── MintBaseVisitor.class
│   │   ├── .....
│   └── runtime
│       └── MintMain.class
├── data
│   ├── sample1.mint
│   ├── sample2.mint
│   ├── sample3.mint
│   └── sample4.mint
├── doc
│   ├── Milestone-2.pdf
│   └── contribution.txt
└── src
    ├── gen
    │   ├── Mint.interp
    │   ├── Mint.tokens
    │   ├── MintBaseListener.java
    │   ├── MintBaseVisitor.java
    │   ├── MintLexer.interp
    │   ├── MintLexer.java
    │   ├── MintLexer.tokens
    │   ├── MintListener.java
    │   ├── MintParser.java
    │   └── MintVisitor.java
    └── runtime
        └── MintMain.java
        └── MintEvaluator.java

## Instructions to build, compile and execute Mint.

# Navigate to your project folder
cd /path/to/ser502-group25/

# Generate lexer and parser files
antlr4 -Dlanguage=Java -visitor -o src/gen Mint.g4

# Compile everything (clears build folder too)
rm -rf build
mkdir build
javac -cp "antlr-4.13.2-complete.jar" -d build src/gen/*.java src/runtime/*.java

1. View Tokens
java -cp "build:antlr-4.13.2-complete.jar" org.antlr.v4.gui.TestRig gen.Mint program -tokens data/sample1.mint

2. View Output (Parse Tree as Text)
java -cp "build:antlr-4.13.2-complete.jar" org.antlr.v4.gui.TestRig gen.Mint program -tree data/sample1.mint

3. View Visual Parse Tree (GUI)
java -cp "build:antlr-4.13.2-complete.jar" org.antlr.v4.gui.TestRig gen.Mint program -gui data/sample1.mint

4. How to execute the sample programs?
    javac -cp "antlr-4.13.2-complete.jar" -d build src/gen/*.java src/runtime/*.java (to build class files - already existing)
    java -cp "build:antlr-4.13.2-complete.jar" runtime.MintMain data/sample3.mint (to execute the program and get output)
    Example:
    java -cp "build:antlr-4.13.2-complete.jar" runtime.MintMain data/sample1.mint
    java -cp "build:antlr-4.13.2-complete.jar" runtime.MintMain data/sample2.mint
    java -cp "build:antlr-4.13.2-complete.jar" runtime.MintMain data/sample3.mint
    java -cp "build:antlr-4.13.2-complete.jar" runtime.MintMain data/sample4.mint