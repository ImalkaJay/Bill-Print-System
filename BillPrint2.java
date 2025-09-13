import java.util.Scanner;

public class BillPrint2 {
    public static void main(String[] args) {

        System.out.println("=====================================================================================");
        System.out.println();
        System.out.println("__            __  _                            _           _ __  __            _     ");
        System.out.println("\\ \\    /\\    / / | |                          | |         (_)  \\/  |          | |     ");
        System.out.println(" \\ \\  /  \\  / /__| | ___ ___  _ ___ __   ___  | |_ ___     _| \\  / | __ _ _ __| |_    ");
        System.out.println("  \\ \\/ /\\ \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\   | | |\\/| |/ _` | '__| __|   ");
        System.out.println("   \\  /  \\  /  __/ | (_| (_) | | | | | |  __/ | || (_) |  | | |  | | (_| | |  | |_    ");
        System.out.println("    \\/    \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/   |_|_|  |_|\\__,_|_|   \\__|  ");
        System.out.println();
        System.out.println("=====================================================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter Customer Phone Number: ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.println();
        System.out.println("=====================================================================================");

        double priceBasmathi = 250;
        double priceDhal = 180;
        double priceSugar = 150;
        double priceHighland = 1200;
        double priceYoghurt = 50;
        double priceFlour = 120;
        double priceSoap = 160;

        System.out.println();
        System.out.print("Basmathi Qty(Kg) :" );
        int qtyBasmathi = scanner.nextInt();
        double totalBasmathi = qtyBasmathi * priceBasmathi;

        System.out.println();
        System.out.print("Dhal Qty(Kg) :" );
        int qtyDhal = scanner.nextInt();
        double totalDhal = qtyDhal * priceDhal;

        System.out.println();
        System.out.print("Sugar Qty(Kg) :" );
        int qtySugar = scanner.nextInt();
        double totalSugar = qtySugar * priceSugar;

        System.out.println();
        System.out.print("Highland Qty :" );
        int qtyHighland = scanner.nextInt();
        double totalHighland = qtyHighland * priceHighland;

        System.out.println();
        System.out.print("Yoghurt Qty :" );
        int qtyYoghurt = scanner.nextInt();
        double totalYoghurt = qtyYoghurt * priceYoghurt;

        System.out.println();
        System.out.print("Flour Qty(Kg) :" );
        int qtyFlour = scanner.nextInt();
        double totalFlour = qtyFlour * priceFlour;

        System.out.println();
        System.out.print("Soap Qty :" );
        int qtySoap = scanner.nextInt();
        double totalSoap = qtySoap * priceSoap;

        System.out.println();
        double fullTot = totalBasmathi + totalDhal + totalSugar + totalHighland + totalYoghurt + totalFlour + totalSoap;
        double discount = (fullTot * 10) / 100;
        double netPrice = fullTot - discount;

        System.out.println("+---------------------------------------------------------------+");
        System.out.println("|               _   __  __          ______ _______              |");
        System.out.println("|              (_) |  \\/  |   /\\   |  __  \\__   __|             |");
        System.out.println("|               _  | \\  / |  /  \\  | |__) |  | |                |");
        System.out.println("|              | | | |\\/| | / /\\ \\ | |_  /   | |                |");
        System.out.println("|              | | | |  | |/ ____ \\| | \\ \\   | |                |");
        System.out.println("|              |_| |_|  |_/_/    \\_\\_|  \\_\\  |_|                |");
        System.out.println("|                   225,Galle Road,Panadura.                    |");
        System.out.println("|                                                               |");
        System.out.println("+---------------------------------------------------------------+");
        System.out.printf("|                      # Tel   : %-30s |\n", phoneNumber); 
        System.out.printf("|                      # Name  : %-30s |\n", customerName);
        System.out.println("+----------------+-------------+---------------+----------------+");
        System.out.println("|                |    Qty      |   unit price  |     Price      |");
        System.out.println("+----------------+-------------+---------------+----------------+");
        System.out.printf("| #Basmathi      | %9d   | %13.1f | %14.1f |\n", qtyBasmathi, priceBasmathi, totalBasmathi);
        System.out.println("|                |             |               |                |");
        System.out.printf("| #Dhal          | %9d   | %13.1f | %14.1f |\n", qtyDhal, priceDhal, totalDhal);
        System.out.println("|                |             |               |                |");
        System.out.printf("| #Sugar         | %9d   | %13.1f | %14.1f |\n", qtySugar, priceSugar, totalSugar);
        System.out.println("|                |             |               |                |");
        System.out.printf("| #Highland      | %9d   | %13.1f | %14.1f |\n", qtyHighland, priceHighland, totalHighland);
        System.out.println("|                |             |               |                |");
        System.out.printf("| #Yoghurt       | %9d   | %13.1f | %14.1f |\n", qtyYoghurt, priceYoghurt, totalYoghurt);
        System.out.println("|                |             |               |                |");
        System.out.printf("| #Flour         | %9d   | %13.1f | %14.1f |\n", qtyFlour, priceFlour, totalFlour);
        System.out.println("|                |             |               |                |");
        System.out.printf("| #Soap          | %9d   | %13.1f | %14.1f |\n", qtySoap, priceSoap, totalSoap);
        System.out.println("|                |             |               |                |");
        System.out.println("+----------------+-------------+---------------+----------------+");
        System.out.printf("|                              |  Total        | %14.1f |\n", fullTot);
        System.out.println("|                              +---------------+----------------+");
        System.out.printf("|                              |  discount(10%%)| %14.1f |\n", discount);
        System.out.println("|                              +---------------+----------------+");
        System.out.printf("|                              |  Net Price    | %14.1f |\n", netPrice);
        System.out.println("+------------------------------+---------------+----------------+");

        System.out.print("Enter Customer given amount - ");
        double givenAmount = scanner.nextDouble();
        double changeAmount = (givenAmount - netPrice);
        System.out.println();

        System.out.println("+-----------------------+------------------------+");
        System.out.printf("|     Net Amount        |  \t%.1f           |\n", netPrice);
        System.out.println("+-----------------------+------------------------+");
        System.out.printf("|     Cash              |  \t%.1f          |\n", givenAmount);
        System.out.println("+-----------------------+------------------------+");
        System.out.printf("|     Change            |  \t%.1f           |\n", changeAmount);
        System.out.println("+-----------------------+------------------------+");

        System.out.println();

   
        int fiveTNotes = (int)changeAmount/5000;
        changeAmount = (int)changeAmount%5000;

        int twoTNotes = (int)changeAmount/2000;
        changeAmount = (int)changeAmount%2000;

        int oneTNotes = (int)changeAmount/1000;
        changeAmount = (int)changeAmount%1000;

        int fiveHNotes = (int)changeAmount/500;
        changeAmount = (int)changeAmount%500;

        int oneHNotes = (int)changeAmount/100;
        changeAmount = (int)changeAmount%100;

        int fiftyNotes = (int)changeAmount/50;
        changeAmount = (int)changeAmount%50;

        int twentyNotes = (int)changeAmount/20;
        changeAmount = (int)changeAmount%20;

        int tenCoin = (int)changeAmount/10;
        changeAmount = (int)changeAmount%10;

        int fiveCoin = (int)changeAmount/5;
        changeAmount = (int)changeAmount%5;

        int twoCoin = (int)changeAmount/2;
        changeAmount = (int)changeAmount%2;

        int oneCoin = (int)changeAmount/1;
        changeAmount = (int)changeAmount%1;

        int noOfNotes = (fiveTNotes+twoTNotes+oneTNotes+fiveHNotes+oneHNotes+fiftyNotes+twentyNotes);
        int noOfCoins = (tenCoin+fiveCoin+twoCoin+oneCoin);

        System.out.println("+-----------------+-------------------+");
        System.out.println("|     Value       |         No        |");
        System.out.println("+-----------------+-------------------+");
        System.out.printf("|    Rs.5000      |\t    %d         |\n", fiveTNotes);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("|    Rs.2000      |\t    %d         |\n", twoTNotes);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("|    Rs.1000      |\t    %d         |\n", oneTNotes);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("|    Rs.500       |\t    %d         |\n", fiveHNotes);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("|    Rs.100       |\t    %d         |\n", oneHNotes);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("|     Rs.50       |\t    %d         |\n", fiftyNotes);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("|     Rs.20       |\t    %d         |\n", twentyNotes);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("|     Rs.10       |\t    %d         |\n", tenCoin);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("|      Rs.5       |\t    %d         |\n", fiveCoin);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("|      Rs.2       |\t    %d         |\n", twoCoin);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("|      Rs.1       |\t    %d         |\n", oneCoin);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("| No of Notes     |\t    %d         |\n", noOfNotes);
        System.out.println("|-----------------|-------------------|");
        System.out.printf("| No of Coins     |\t    %d         |\n", noOfCoins);
        System.out.println("+-----------------+-------------------+");

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("\t    THANK YOU FOR SHOPPING WITH US");
        System.out.println("-------------------------------------------------------");

        scanner.close();
    }
}
