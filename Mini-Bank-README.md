# OOP CEUE203 – MiniBank Project (Part B)

## Object Oriented Programming – Practical Project

**Student Name:** Avi Patel  
**Student ID:** 25IT061  
**Subject Code:** CEUE203  
**Project Name:** MiniBank  
**Programming Language:** Java  
**JDK Version:** JDK 17 or later

---

## Project Overview

MiniBank is a Java-based banking application developed as part of the Object Oriented Programming (CEUE203) practical work.

The project is developed incrementally across 14 practicals. It starts with basic Java classes and objects and gradually introduces advanced concepts such as inheritance, interfaces, annotations, reflection, exception handling, multithreading, synchronization, file handling, collections, generics and software architecture.

The final application integrates these concepts into a banking system that supports account management, deposits, withdrawals, fund transfers, transaction processing, data persistence and reporting.

## Project Objectives

- Understand and implement core Object Oriented Programming concepts.
- Develop a structured and reusable Java application.
- Implement secure and reliable banking operations.
- Understand exception handling and input validation.
- Work with multithreading and concurrent transactions.
- Store and retrieve account information using files.
- Apply Java Collections and Generics.
- Build, test and package a runnable Java application.

---

## Practical List – Part B

| Practical | Title | Main Concepts |
|---|---|---|
| 01 | MiniBank Basics | Classes, Objects, Records, Enums, Switch |
| 02 | Classes and Encapsulation | Constructors, Static Members, Getters, Setters |
| 03 | Object Relationships | `toString()`, `equals()`, `hashCode()`, Cloning, Nested Classes |
| 04 | Input Validation and Command Processing | Regex, Records, StringBuilder |
| 05 | Abstract Classes and Polymorphism | Abstraction, Inheritance, Method Overriding |
| 06 | Interfaces and Packages | Interfaces, Lambda Expressions, Default Methods, Runnable JAR |
| 07 | Custom Annotations and Reflection | `@Id`, `@Positive`, `@MaxLength`, Reflection |
| 08 | Custom Exception Handling | Checked Exceptions, Exception Hierarchy, Try-with-Resources |
| 09 | Multithreading and Synchronization | Runnable, Threads, Race Conditions, Synchronization |
| 10 | Transaction Processing | ExecutorService, Producer-Consumer, wait/notify, Deadlock Prevention |
| 11 | File Persistence and Reporting | Serialization, Object Streams, Java NIO, Transaction Logs |
| 12 | Collections Framework | HashMap, ArrayList, Comparator, Comparable, ConcurrentHashMap |
| 13 | Generic Repository Pattern | Generics, Bounded Types, Reflection, `@SafeVarargs` |
| 14 | Final MiniBank Integration | BankService, JUnit, Persistence, Reporting, Runnable JAR |

---

## Technologies and Concepts Used

- **Language:** Java
- **JDK:** Java 17 or later
- **IDE:** Visual Studio Code
- **Collections:** HashMap, ArrayList, ConcurrentHashMap
- **Concurrency:** Thread, Runnable, ExecutorService
- **File Handling:** Java I/O and NIO
- **Reflection:** Java Reflection API
- **Testing:** JUnit 5
- **Build:** Java Compiler and Runnable JAR

## Project Structure

```text
oop-minibank-25IT061/
│
├── Part-A/
│   └── Practical 1–14
│
├── MiniBank_PartB_14_Practicals/
│   ├── Practical-01/
│   ├── Practical-02/
│   ├── Practical-03/
│   ├── Practical-04/
│   ├── Practical-05/
│   ├── Practical-06/
│   ├── Practical-07/
│   ├── Practical-08/
│   ├── Practical-09/
│   ├── Practical-10/
│   ├── Practical-11/
│   ├── Practical-12/
│   ├── Practical-13/
│   └── Practical-14/
│
└── README.md
```

**Note:** Part A and Part B are maintained separately. Each Part B practical represents an independently runnable checkpoint, while later practicals extend the MiniBank application developed in earlier practicals.

## Final Application Features

The completed MiniBank application is designed to support:

1. Opening and managing bank accounts.
2. Depositing and withdrawing money.
3. Transferring money between accounts.
4. Validating account information using custom annotations.
5. Handling banking errors using custom exceptions.
6. Processing transactions using multiple threads.
7. Preventing race conditions and deadlocks.
8. Saving and loading account information.
9. Maintaining transaction logs.
10. Generating end-of-day transaction reports.
11. Managing accounts through collections and a generic repository.
12. Running automated tests using JUnit.

## Compile and Run

For individual practicals, open the respective practical folder and follow its instructions.

For the final integrated application, after building the runnable JAR, execute:

```bash
java -jar MiniBank.jar
```

## Learning Outcomes

Through these 14 practicals, the project demonstrates the implementation of basic and advanced Java programming concepts in a single banking application. It provides practical experience in object-oriented design, data management, concurrency, exception handling, persistence, testing and application packaging.

---

**Project:** MiniBank  
**Subject:** Object Oriented Programming (CEUE203)  
**Academic Year:** 2026–2027  
**Student:** Avi Patel  
**Student ID:** 25IT061
