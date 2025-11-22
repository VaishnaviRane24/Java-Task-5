# Bank Account Simulation

A simple Java-based bank account simulation demonstrating Object-Oriented Programming (OOP) concepts.


## Overview

This program simulates basic banking operations including:
- Account creation with initial balance
- Deposit transactions
- Withdrawal transactions
- Transaction history tracking
- Balance inquiries


## Features

- **Account Management**: Create accounts with account number, holder name, and initial balance
- **Transaction Processing**: Secure deposit and withdrawal operations with validation
- **History Tracking**: Maintains complete transaction history for each account
- **Balance Management**: Real-time balance updates and checks


## OOP Concepts Demonstrated

- **Encapsulation**: Private fields with public methods
- **Constructors**: Object initialization
- **Method Implementation**: Deposit, withdraw, and transaction history methods
- **Collections**: Using ArrayList to store transaction history


## Code Structure

### Account Class
- `accountNumber`: Unique identifier for the account
- `accountHolder`: Name of the account holder
- `balance`: Current account balance
- `transactions`: List of all transaction records


### Key Methods
- `deposit(amount)`: Adds funds to account with validation
- `withdraw(amount)`: Removes funds from account with sufficient balance check
- `getBalance()`: Returns current balance
- `printTransactionHistory()`: Displays all transactions


## Usage Example

```java
Account acc1 = new Account("12345", "Alen", 1000);
acc1.deposit(500);
acc1.withdraw(200);
acc1.printTransactionHistory();
```


## Sample Output
```
Final Balance: 1300.0

Transaction History for Alen:
Account created with initial balance: 1000.0
Deposited: 500.0 | Balance: 1500.0
Withdrew: 200.0 | Balance: 1300.0
```


## How to Run

1. Compile the Java file:
   ```bash
   javac BankSimulation.java
   ```

2. Run the program:
   ```bash
   java BankSimulation
   ```
