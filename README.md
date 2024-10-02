# Vending Machine GUI
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)
## Description
This Java program simulates a vending machine with a graphical user interface (GUI). It allows users to choose between customer and vendor roles, purchase drinks, and restock inventory using JOptionPane for dialog prompts. The program demonstrates the use of object-oriented programming principles and exception handling.

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux. 

- Clone or download the repository: 
```Java 
- git clone https://github.com/EMK2473/VendingMachineGUI.git 
```

- Navigate to the project directory: 
```Java
- cd VendingMachineGUI 
```
- Compile the VendingMachineGUI.java file: 
```Java
- javac VendingMachineGUI.java 
```
- Run the program: 
```Java
- java VendingMachineGUI
```

## Application Usage
Once the program is running, users will see a dialog prompting them to select whether they are a customer or a vendor. The Vending Machine's inventory contains 20 bottles by default. Depending on the selection, users can perform the following actions:  

- Customer 

Enter the number of bottles they wish to purchase. The program will confirm if the purchase was successful or if there are insufficient bottles. 

- Vendor 

Enter the number of bottles they wish to restock. The program will confirm the restock and display the updated inventory. Exit Users can choose to exit the program, with a confirmation dialog to prevent accidental exits. 

Example: 

- Customer: "How many bottles would you like to purchase?" → Input: 3 

- Output: "Thank you for your purchase! Bottles left: 17" 


- Vendor: "How many bottles would you like to restock?" → Input: 5 

- Output: "Inventory restocked! Bottles in inventory: 22"

## Contributions
Eric Keeton

## Test Commands
Test the program by simulating both customer and vendor roles. Attempt to purchase more bottles than are available to verify error handling.

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)