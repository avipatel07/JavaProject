# Practical 02 – Customer and Account Management

## Objective

To implement Customer and Account classes using encapsulation, constructors, static members, and methods for basic banking operations.

## Classes Implemented

### 1. Customer.java
- Stores customer name, email, and mobile number.
- Uses a private final customer ID.
- Generates unique customer IDs using a static counter.
- Provides public getter methods.

### 2. Account.java
- Stores account number, owner name, balance, and account status.
- Generates unique account numbers.
- Implements constructor overloading and constructor chaining.
- Provides deposit and withdrawal methods.
- Protects account balance using encapsulation.

### 3. MiniBank.java
- Creates three Customer objects.
- Creates three Account objects using an Account array.
- Demonstrates deposit and withdrawal operations.
- Displays customer and account details.
- Retains the initial MiniBank menu.

## Java Concepts Used

- Classes and Objects
- Encapsulation
- Private and Public Access Modifiers
- Static Variables and Methods
- Final Variables
- Constructor Overloading
- Constructor Chaining
- Arrays of Objects
- Getters
- Exception Handling

## Compilation and Execution

Open the terminal inside the Practical-02 folder.

Compile:

```bash
javac *.java
```

Run:

```bash
java MiniBank
```

## Student Details

Name: Avi Patel

Student ID: 25IT061

Subject: CEUE203 – Object Oriented Programming

Practical: 02

Project: MiniBank