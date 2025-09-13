# Supermarket Billing System

## Overview
BillPrint2 is a simple console-based Java application designed to simulate a supermarket billing system. It allows users to input customer details, item quantities, and payment amounts, then generates a formatted bill with totals, a 10% discount, change calculation, and a breakdown of change into notes and coins. This project is ideal for beginners learning Java input handling, calculations, and formatted output.

Built with basic Java features, it's a great example of procedural programming for educational purposes or small-scale point-of-sale simulations.

## Features
- **Customer Input**: Collects phone number and name.
- **Item Management**: Supports fixed items like Basmathi rice, Dhal, Sugar, Highland (likely milk), Yoghurt, Flour, and Soap with predefined prices.
- **Calculations**:
  - Computes subtotal for each item.
  - Applies a flat 10% discount on the total.
  - Calculates net price and change based on payment.
  - Breaks down change into Sri Lankan Rupee denominations (notes: 5000, 2000, 1000, 500, 100, 50, 20; coins: 10, 5, 2, 1).
- **Formatted Output**: Prints an ASCII art header, bill details in a table format, and a thank-you message.
- **Location-Specific**: Tailored for a fictional supermarket at 225, Galle Road, Panadura (Sri Lanka-inspired).

## Requirements
- Java Development Kit (JDK) 8 or higher.
- A Java compiler and runtime environment (e.g., via command line or an IDE like IntelliJ IDEA or Eclipse).

No external libraries are required—this is pure Java.

## Installation
1. Clone the repository:
   ```
   git clone https://github.com/yourusername/BillPrint2.git
   ```
2. Navigate to the project directory:
   ```
   cd BillPrint2
   ```

## Usage
1. Compile the Java file:
   ```
   javac BillPrint2.java
   ```
2. Run the application:
   ```
   java BillPrint2
   ```
3. Follow the prompts:
   - Enter the customer's phone number and name.
   - Input quantities for each item (enter 0 if not purchasing).
   - Provide the payment amount to calculate change.

The program will display the bill and change breakdown automatically.

## Example Output
After entering details, the output resembles a printed receipt:

```
=====================================================================================

__ __ _ _ _ __ __ _ 
\ \ /\ / / | | | | (_) \/ | | | 
 \ \ / \ / /__| | ___ ___ _ ___ __ ___ | |_ ___ _| \ / | __ _ _ __| |_ 
  \ \/ /\ \/ / _ \ |/ __/ _ \| '_ ` _ \ / _ \ | __/ _ \ | | |\/| |/ _` | '__| __| 
   \  /  \  / __/ | (_| (_) | | | | | |  __/ | || (_) | | |  | | | (_| |  | | |_ 
    \/    \/ \___|_|\___\___/|_| |_| |_|\___|  \__\___/  |_|  |_| \__,_|_|  \__| 

=====================================================================================

Enter Customer Phone Number: 123456789

Enter Customer Name: John Doe

=====================================================================================

Basmathi Qty(Kg) : 2

Dhal Qty(Kg) : 1

Sugar Qty(Kg) : 3

Highland Qty : 1

Yoghurt Qty : 4

Flour Qty(Kg) : 2

Soap Qty : 1

+---------------------------------------------------------------+
| _ __ __ ______ _______ |
| (_) | \/ |   /\   | __ \__   __| |
|  _  | \  / |  /  \  | |__) | | | |
| | | | |\/| | / /\ \ | |_) |  | | |
| | | | |  | |/ ____ \|  _ <   | | |
| |_| |_|  |_/_/    \_\_|  \_\ |_| |
| 225,Galle Road,Panadura.                                     |
|                                                               |
+---------------------------------------------------------------+
| # Tel : 123456789                                             |
| # Name : John Doe                                             |
+----------------+-------------+---------------+----------------+
|                | Qty         | unit price    | Price          |
+----------------+-------------+---------------+----------------+
| #Basmathi      |         2   |         250.0 |          500.0 |
|                |             |               |                |
| #Dhal          |         1   |         180.0 |          180.0 |
|                |             |               |                |
| #Sugar         |         3   |         150.0 |          450.0 |
|                |             |               |                |
| #Highland      |         1   |        1200.0 |         1200.0 |
|                |             |               |                |
| #Yoghurt       |         4   |          50.0 |          200.0 |
|                |             |               |                |
| #Flour         |         2   |         120.0 |          240.0 |
|                |             |               |                |
| #Soap          |         1   |         160.0 |          160.0 |
|                |             |               |                |
+----------------+-------------+---------------+----------------+
|                | Total                       |         2930.0 |
|                +---------------+----------------+
|                | discount(10%)|          293.0 |
|                +---------------+----------------+
|                | Net Price    |         2637.0 |
+----------------+---------------+----------------+
Enter Customer given amount - 3000

+-----------------------+------------------------+
| Net Amount            | 	2637.0         |
+-----------------------+------------------------+
| Cash                  | 	3000.0         |
+-----------------------+------------------------+
| Change                | 	363.0          |
+-----------------------+------------------------+

+-----------------+-------------------+
| Value           | No                |
+-----------------+-------------------+
| Rs.5000         |	 0         |
|-----------------|-------------------|
| Rs.2000         |	 0         |
|-----------------|-------------------|
| Rs.1000         |	 0         |
|-----------------|-------------------|
| Rs.500          |	 0         |
|-----------------|-------------------|
| Rs.100          |	 3         |
|-----------------|-------------------|
| Rs.50           |	 1         |
|-----------------|-------------------|
| Rs.20           |	 0         |
|-----------------|-------------------|
| Rs.10           |	 1         |
|-----------------|-------------------|
| Rs.5            |	 0         |
|-----------------|-------------------|
| Rs.2            |	 1         |
|-----------------|-------------------|
| Rs.1            |	 1         |
|-----------------|-------------------|
| No of Notes     |	 5         |
|-----------------|-------------------|
| No of Coins     |	 3         |
+-----------------+-------------------+

-------------------------------------------------------
	 THANK YOU FOR SHOPPING WITH US
-------------------------------------------------------
```

## Contributing
Feel free to fork this repository and submit pull requests for improvements, such as adding more items, dynamic pricing, or error handling. Contributions are welcome!

## Author
Developed by Imalka Jayantha – A full-stack developer trainee passionate about clean, maintainable code in Java and beyond. Let's connect on LinkedIn or collaborate on projects!

Citations:
[1] [BillPrint2.java](https://ppl-ai-file-upload.s3.amazonaws.com/web/direct-files/attachments/81709208/0fcb5dca-bf8b-4a91-a55e-7c3e589bbe59/BillPrint2.java)
