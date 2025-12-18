# Library Management System (LMS) — Java OOP Project

A **console-based Library Management System** built in **Java 8** to practice and strengthen **Object-Oriented Programming (OOP)** concepts, clean code principles, and basic system design.

This project is **actively in progress** and is being developed incrementally with a focus on writing readable, maintainable, and extensible code.

---

## Project Objectives

- Practice **core OOP principles**: encapsulation, inheritance, polymorphism, and abstraction  
- Apply **interface-based design** to decouple responsibilities  
- Write **clean, readable, and maintainable Java code**  
- Build a strong foundation for extending the system into a **backend service** in the future  

---

## Features (Current)

- Manage users with different roles:
  - **Student** (limited borrowing capacity)
  - **Teacher** (higher borrowing capacity)
- Manage library items (currently books)
- Borrow and return items with:
  - Role-based constraints
  - Availability checks
- Centralized `Library` class to coordinate users and items
- Console-based demo flow using a `Main` class

---

## Design Overview

### Core Concepts Used

- **Inheritance**
  - `Student` and `Teacher` extend the base `User` class
- **Polymorphism**
  - Different borrowing rules based on user type
- **Interfaces**
  - `Borrowable` interface to abstract borrowing behavior
- **Encapsulation**
  - Controlled access to fields using getters/setters
- **Separation of Responsibilities**
  - `Library` handles coordination
  - `User` handles borrowing logic
  - `Book` handles availability state

---

## Project Structure

```
src/main/java
├── Book.java // Represents a book and implements Borrowable
├── Borrowable.java // Interface for borrowable items
├── User.java // Base user class
├── Student.java // Student user with borrow limits
├── Teacher.java // Teacher user with higher borrow limits
├── Library.java // Central manager for users and items
└── Main.java // Console demo and execution entry point
```
---

## How to Run

1. Clone the repository:
   ```
   git clone https://github.com/sahilkumar-sk/LMS.git
   ```
2. Open the project in any Java IDE (IntelliJ / Eclipse / VS Code)
3. Run Main.java
4. Observe borrowing and returning behavior in the console

---

## Technologies Used

- Java 8  
- Object-Oriented Programming (OOP)  
- Maven (project structure)

---

## Planned Improvements (In Progress)

- Add **JUnit tests** for core logic  
- Improve **validation and error handling**  
- Refactor towards stronger **SOLID compliance**  
- Introduce **Spring Boot** and expose **REST APIs**  
- Add **persistence** (database integration)  
- Support additional item types (e.g., magazines, digital resources)

---

## Learning Focus

This project is intentionally built incrementally to:

- Strengthen **Java fundamentals**  
- Develop **clean coding habits**  
- Prepare for **backend system development** using modern frameworks
