# Mint Programming Language

**Team Name**: SER502-Group25  
**Language Name**: Mint  
**Milestone**: 1 — Kickoff  
**Course**: SER 502 — Language and Programming Paradigms  
**Semester**: Spring 2025

---

## 🧠 About Mint

Mint is a simple, beginner-friendly programming language being developed as part of our course project. It uses more readable and modern keywords.

In this milestone, we’ve set up the project, defined our team structure, and started writing the grammar using ANTLR.

---

## Checkpoint 1:

- Created private GitHub repo for the group  
- Finalized the language name (`Mint`)  
- Added `Mint.g4` grammar file with initial Lexer Rules.
- Added a sample `.mint` program  
- Set up project structure  
- Successfully generated lexer and viewed the parse tree using ANTLR’s TestRig GUI

---

## Tools We’re Using

- **ANTLR 4.13.2** — for lexer and parser generation  
- **Java** — for running the language  
- **VS Code** — as our development IDE  
- **ANTLR GUI (TestRig)** — to view the parse tree  
- **GitHub** — for version control and team collaboration

---

## 💻 Platforms We Plan to Support

- macOS  
- Windows  
- Linux

Since the language runs on Java and ANTLR, it should be platform-independent.

---

## 📁 Project Structure (Milestone 1)
ser502-group25/ 
├── antlr-4.13.2-complete.jar # ANTLR jar 
├── Mint.g4 # Grammar file (lexer rules only for now) 
├── src/ 
│ └── runtime/ 
│ └── MintMain.java # Runtime entry point (basic) 
├── data/ 
│ └── sample1.mint # Sample test program 
├── README.md # 