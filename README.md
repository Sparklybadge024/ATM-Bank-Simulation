# 🏦 ATM Bank Simulation

This is a simple **Java console program** that simulates basic ATM bank operations.  
It demonstrates the use of different **data types**, **conditional statements**, and **basic banking logic** such as deposits, withdrawals, transaction counting, and account activity status.

---

## 📌 Features
- Tracks the **number of ATMs** available.
- Stores and displays the **account holder’s name**.
- Maintains an **account balance** and updates it with deposits and withdrawals.
- Checks for **insufficient balance** before withdrawal.
- Keeps a **transaction counter**.
- Determines whether the **account is active** based on balance.
- Outputs a **summary** of account information at the end.

---

## 📂 Code Structure
- **Main Class:** `ATMBankSimulation`
- **Variables Used:**
  - `byte ATMs` → Number of ATMs
  - `String accountHolder` → Name of the account holder
  - `double balance` → Account balance
  - `long withdraw` → Amount to withdraw
  - `long deposit` → Amount to deposit
  - `short transaction` → Transaction counter
  - `boolean isActive` → Account activity status

---

## ▶️ How It Works
1. Starts with a predefined **balance** and **account holder name**.
2. Simulates:
   - Adding an ATM (if below max limit).
   - Making deposits.
   - Withdrawing money (only if sufficient balance).
   - Counting transactions.
3. Determines if the account is active (`balance > 0`).
4. Prints a final account summary:
   - Name  
   - Balance  
   - Activity Status  
   - Number of ATMs  
   - Number of Transactions  

---

## 🖥️ Example Output
34
Bill Downey
5000000.623717
5001000.623717
4901000.623717
2
14901000.623717
Account is Active: true
name: Bill Downey
balance: 14901000.623717
Active: true
Number of ATMs: 34
Transactions: 3


---

## 🚀 How to Run
1. Save the file as `ATMBankSimulation.java`.
2. Compile the program:
   ```bash
   javac ATMBankSimulation.java
Run the program:

java ATMBankSimulation

📖 Learning Highlights

- Usage of primitive data types (byte, short, long, double, boolean).

- Simple banking logic for deposits and withdrawals.

- Use of increment operators and conditionals.

- Demonstrates object-oriented structure with a main method.


✅ Future Improvements

- Add user input for deposits/withdrawals instead of hardcoded values.

- Implement PIN authentication.

- Support multiple account holders.

- Store transaction history logs.

  Author: Rishabh Sundli a.k.a. Sparklybadge024
