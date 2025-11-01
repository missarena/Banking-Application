# 🏦 Console Bank Application (Java)

A simple **console-based banking system** built using **core Java concepts** such as OOP (Encapsulation, Inheritance, Polymorphism), Collections, and Exception Handling.  
This project simulates basic banking operations like opening accounts, depositing, withdrawing, transferring funds, and viewing account statements — all via a command-line interface.

---

## 🚀 Features

✅ **Open New Account** – Create a new Savings or Current account  
✅ **Deposit Money** – Add funds to your existing account  
✅ **Withdraw Money** – Withdraw funds with balance validation  
✅ **Transfer Funds** – Transfer money between two accounts  
✅ **Account Statement** – View all past transactions for an account  
✅ **List All Accounts** – Display all existing accounts with balance details  
✅ **Search by Customer Name** – Find accounts belonging to a specific customer  
✅ **Exit Option** – Graceful shutdown of the application  

---

## 💻 Sample Console Output

Welcome to Console Bank
1) Open Account
2) Deposit
3) Withdraw
4) Transfer
5) Account Statement
6) List Accounts
7) Search Accounts by Customer Name
0) Exit

CHOOSE: 1
Customer name:
sadiya
Customer email:
sadiya@gmail.com

Account Type (SAVINGS/CURRENT):
savings
Initial deposit (optional, blank for 0):
500
Account opened: AC000001

CHOOSE: 6
AC000001 | savings | 500.0

CHOOSE: 2
Account number:
AC000001
Amount:
1000
Deposited

CHOOSE: 6
AC000001 | savings | 1500.0


---

## 🧠 Concepts Used

- **Object-Oriented Programming (OOP)**
  - Encapsulation, Inheritance, Polymorphism, Abstraction  
- **Java Collections Framework**
  - `ArrayList`, `HashMap`
- **Exception Handling**
  - Custom exceptions for validation
- **Input/Output Handling**
  - Scanner for console input
- **Layered Design**
  - Domain, Service, and Utility classes

---

## 🗂️ Project Structure



src/
├── domain/
│ ├── Account.java
│ ├── Transaction.java
│ └── Type.java
├── service/
│ └── BankService.java
├── utils/
│ └── InputValidator.java
└── Main.java


---

## 🏃‍♂️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/missarena/Banking-Application.git
   cd console-bank


Compile and run the program:

javac src/**/*.java
java src/Main


Follow the on-screen instructions to interact with the system.

🧩 Future Enhancements
Add persistent storage (e.g., file or database)
Include interest calculation for savings accounts
Implement user authentication and login
Add admin dashboard for account management

