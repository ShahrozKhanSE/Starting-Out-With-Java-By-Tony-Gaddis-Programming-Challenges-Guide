package src.chapter2.programmingChallanges;

import java.util.Scanner;

public class solution {

    /**
     * Write a program that declares the following:
     * • a String variable named name
     * • an int variable named age
     * • a double variable named annualPay
     * Store your age, name, and desired annual income as literals in these variables. The program
     * should display these values on the screen in a manner similar to the following:
     * My name is Joe Mahoney, my age is 26 and
     * I hope to earn $100000.0 per year.
     */

    public static void solutionNo1() {
        String name = "Shahroz Khan";
        int age = 21;
        double annualPay = 1000000;
        System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn " + annualPay + " per year.");
    }

    /**
     * Write a program that has the following String variables: firstName, middleName, and
     * lastName. Initialize these with your first, middle, and last names. The program should also
     * have the following char variables: firstInitial, middleInitial, and lastInitial. Store
     * your first, middle, and last initials in these variables. The program should display the contents
     * of these variables on the screen.
     */
    public static void solutionNo2() {
        String firstName = "Muhammad";
        String middleName = "Shahroz";
        String lastName = "Khan";
        char firstInitial = 'M';
        char middleInitial = 'S';
        char lastInitial = 'K';

        System.out.println(firstName + " " + middleName + " " + lastName);
        System.out.println(firstInitial + " " + middleInitial + " " + lastInitial);
    }

    /**
     * Write a program that displays the following information, each on a separate line:
     * • Your name
     * • Your address, with city, state, and ZIP
     * • Your telephone number
     * • Your college major
     * Although these items should be displayed on separate output lines, use only a single println
     * statement in your program.
     */
    public static void solutionNo3() {
        String name = "Muhammad Shahroz Khan";
        String address = "9415 Remington Springs,Atlanta city,Maryland,28381";
        String telephoneNo = "2734863794";
        String collegeMajor = "Computer Science";
        System.out.println(name + "\n" + address + "\n" + telephoneNo + " \n" + collegeMajor);
    }

    /**
     * Write a program that displays the following pattern:
     * *
     * ***
     * *****
     * *******
     * *****
     * ***
     * *
     */
    public static void solutionNo4() {

        System.out.println("      *" + "\n" + "    * * *" + "\n" + "  * * * * *" + "\n" + "* * * * * * *" + "\n"
                + "  * * * * *" + "\n" + "    * * *" + "\n" + "      *");
    }

    /**
     * The East Coast sales division of a company generates 62 percent of total sales. Based on
     * that percentage, write a program that will predict how much the East Coast division will
     * generate if the company has $4.6 million in sales this year. Hint: Use the value 0.62 to
     * represent
     * 62 percent.
     */

    public static void solutionNo5() {
        float sale = 4.6f;
        float percentage = 0.62f;

        System.out.println("If the company produces $" + sale + " million in sales this year then");
        System.out.println("$" + (sale * percentage) + " Million will be produced by the East cost division respectively");
    }

    /**
     * One acre of land is equivalent to 43,560 square feet. Write a program that calculates the
     * number of acres in a tract of land with 389,767 square feet. Hint: Divide the size of the
     * tract of land by the size of an acre to get the number of acres.
     */

    public static void solutionNo6() {
        Scanner scanner = new Scanner(System.in);

        int calories = 75;

        System.out.println("Please enter the amount of cookies you have eaten ");
        int amount = scanner.nextInt();
        System.out.println("The amount of calories you have consumer are " + (calories * amount));
    }

    /**
     * Write a program that will ask the user to enter the amount of a purchase. The program
     * should then compute the state and county sales tax. Assume the state sales tax is 4 percent
     * and the county sales tax is 2 percent. The program should display the amount of the purchase,
     * the state sales tax, the county sales tax, the total sales tax, and the total of the sale
     * (which is the sum of the amount of purchase plus the total sales tax). Hint: Use the value
     * 0.02 to represent 2 percent, and 0.04 to represent 4 percent.
     */
    public static void solutionNo7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of the purchase ");
        double amount = scanner.nextDouble();
        double stateTax = 0.04;
        double countyTax = 0.02;
        System.out.println("The purchase amount is $" + amount);
        double tax1 = amount * stateTax;
        double tax2 = amount * countyTax;
        System.out.println("The state tax is $" + tax1);
        System.out.println("The county tax is $" + tax2);
        System.out.println("Total tax is $" + (tax1 + tax2));
        System.out.println("Total amount is $" + (amount + tax1 + tax2));
    }

    /**
     * A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are
     * 10 servings in the bag and that a serving equals 300 calories. Write a program that lets the
     * user enter the number of cookies he or she actually ate and then reports the number of total
     * calories consumed.
     */
    public static void solutionNo8() {
        Scanner scanner = new Scanner(System.in);

        int calories = 75;

        System.out.println("Please enter the amount of cookies you have eaten ");
        int amount = scanner.nextInt();
        System.out.println("The amount of calories you have consumer are " + (calories * amount));
    }

    /**
     * A car’s miles-per-gallon (MPG) can be calculated with the following formula:
     * MPG = Miles driven / Gallons of gas used
     * Write a program that asks the user for the number of miles driven and the gallons of gas
     * used. It should calculate the car’s miles-per-gallon and display the result on the screen.
     */
    public static void solutionNo9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have traveled ");
        double miles = scanner.nextDouble();
        System.out.println("Please enter the gallons of petrol/diesel used ");
        double gallons = scanner.nextDouble();
        System.out.println("The MPG of your car is " + (miles / gallons));
    }

    /**
     * Write a program that asks the user to enter three test scores. The program should display
     * each test score, as well as the average of the scores.
     */
    public static void solutionNo10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter 1st test score.");
        double test1 = scanner.nextDouble();
        System.out.println("PLease enter 2nd test score.");
        double test2 = scanner.nextDouble();
        System.out.println("PLease enter 3rd test score.");
        double test3 = scanner.nextDouble();
        System.out.println("Marks of test 1 = " + test1);
        System.out.println("Marks of test 2 = " + test2);
        System.out.println("Marks of test 3 = " + test3);
        System.out.println("Average marks = " + (test1 + test2 + test3) / 3);
    }

    /**
     * An electronics company sells circuit boards at a 40 percent profit. If you know the retail
     * price of a circuit board, you can calculate its profit with the following formula:
     * Profit = Retail price × 0.4
     * Write a program that asks the user for the retail price of a circuit board, calculates the
     * amount of profit earned for that product, and displays the results on the screen.
     */
    public static void solutionNo11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the price of circuit board.");
        double circuitPrice = scanner.nextDouble();
        double profit = 0.4;
        System.out.println("The amount of profit is " + circuitPrice * profit + "$");
    }

    /**
     * Write a program that asks the user to enter the name of his or her favorite city. Use a String
     * variable to store the input. The program should display the following:
     * • The number of characters in the city name
     * • The name of the city in all uppercase letters
     * • The name of the city in all lowercase letters
     * • The first character in the name of the city
     */
    public static void solutionNo12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of your favourite city");
        String city = scanner.next();
        System.out.println("The no of characters in the name of the city is " + city.length());
        System.out.println("The name of the city in upper case letters is " + city.toUpperCase());
        System.out.println("The name of the cty in lower case letters is " + city.toLowerCase());
        System.out.println("The first character of the name of the city is " + city.charAt(0));
    }

    /**
     * Write a program that computes the tax and tip on a restaurant bill. The program should ask
     * the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge.
     * The tip should be 20 percent of the total after adding the tax. Display the meal charge, tax
     * amount, tip amount, and total bill on the screen.
     */
    public static void solutionNo13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the charge for the meal ");
        double meal = scanner.nextDouble();
        double tax = meal * 0.0675;
        double total = meal + tax;
        double tip = total * 0.2;
        double grandTotal = meal + tax + tip;
        System.out.println("The charge for the meal is " + meal);
        System.out.println("The tax on the meal is " + tax);
        System.out.println("The tip for the meal is " + tip);
        System.out.println("The grand total is " + grandTotal);
    }

    /**
     * Write a program that asks the user for the number of males and the number of females registered
     * in a class. The program should display the percentage of males and females in the class.
     * Hint: Suppose there are 8 males and 12 females in a class. There are 20 students in the class.
     * The percentage of males can be calculated as 8 4 20 5 0.4, or 40%. The percentage of
     * females can be calculated as 12 4 20 5 0.6, or 60%.
     */
    public static void solutionNo14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleasr enter the amount of male students ");
        int maleStudents = scanner.nextInt();
        System.out.println("Please enter the amount of female students ");
        double femaleStudents = scanner.nextInt();
        double totalStudents = maleStudents + femaleStudents;
        double maleStudentsPercentage = (maleStudents / totalStudents) * 100;
        double femaleStudensPercentage = (femaleStudents / totalStudents) * 100;
        System.out.println("The percentage of Male students is " + maleStudentsPercentage + "%");
        System.out.println("The percentage of Female students is " + femaleStudensPercentage + "%");
    }

    /**
     * Kathryn bought 600 shares of stock at a price of $21.77 per share. She must pay her stockbroker
     * a 2 percent commission for the transaction. Write a program that calculates and
     * displays the following:
     * • The amount paid for the stock alone (without the commission)
     * • The amount of the commission
     * • The total amount paid (for the stock plus the commission)
     */
    public static void solutionNo15() {
        int totalNoOfStocks = 600;
        double pricePerStock = 21.77;
        double commissionPercentage = 0.02;
        double totalAmountOfStocks = totalNoOfStocks * pricePerStock;
        double amountOfCommission = totalAmountOfStocks * commissionPercentage;
        double grandTotal = totalAmountOfStocks + amountOfCommission;
        System.out.println("The amount paid for only stocks is " + totalAmountOfStocks + "$");
        System.out.println("The amount of commission is " + amountOfCommission + "$");
        System.out.println("The grand total is " + grandTotal + "$");
    }

    /**
     * A soft drink company recently surveyed 12,467 of its customers and found that approximately
     * 14 percent of those surveyed purchase one or more energy drinks per week. Of those
     * customers who purchase energy drinks, approximately 64 percent of them prefer citrus flavored
     * energy drinks. Write a program that displays the following:
     * • The approximate number of customers in the survey who purchase one or more
     * energy drinks per week
     * • The approximate number of customers in the survey who prefer citrus-flavored
     * energy drinks
     */
    public static void solutionNo16() {
        double noOfPeople = 12467;
        int peopleWhoPurchasedOneOrMore = (int) (noOfPeople * 0.14);
        int citrusFlavouredDrink = (int) (peopleWhoPurchasedOneOrMore * 0.64);
        System.out.println("The amount of people that buy energy drink are " + peopleWhoPurchasedOneOrMore);
        System.out.println("The amount of people that buz citrus flavoured drinks are " + citrusFlavouredDrink);
    }

    /**
     * A cookie recipe calls for the following ingredients:
     * • 1.5 cups of sugar
     * • 1 cup of butter
     * • 2.75 cups of flour
     * The recipe produces 48 cookies with these amounts of the ingredients. Write a program
     * that asks the user how many cookies he or she wants to make, and then displays the number
     * of cups of each ingredient needed for the specified number of cookies.
     */
    public static void solutionNo17() {
        Scanner scanner = new Scanner(System.in);
        double sugarAmount = 1.5;
        double butterAmount = 1;
        double flourAmount = 2.75;
        double cookiesAmount = 48;
        double sugarForOne = sugarAmount / cookiesAmount;
        double butterForOne = butterAmount / cookiesAmount;
        double flourForOne = flourAmount / cookiesAmount;
        System.out.println("Please enter the desired amount of cookies");
        double desiredAmountOfCookies = scanner.nextDouble();
        double requiredSugar = desiredAmountOfCookies * sugarForOne;
        double requiredButter = desiredAmountOfCookies * butterForOne;
        double requiredFlour = desiredAmountOfCookies * flourForOne;
        System.out.println(requiredSugar + " cups of sugar");
        System.out.println(requiredButter + " cups of butter");
        System.out.println(requiredFlour + " cups of flour");
    }

    /**
     * Write a program that plays a word game with the user. The program should ask the user to
     * enter the following:
     * • His or her name
     * • His or her age
     * • The name of a city
     * • The name of a college
     * • A profession
     * • A type of animal
     * • A pet’s name
     * After the user has entered these items, the program should display the following story,
     * inserting the user’s input into the appropriate locations:
     * There once was a person named NAME who lived in CITY. At the age of AGE,
     * NAME went to college at COLLEGE. NAME graduated and went to work as a
     * PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived
     * happily ever after!
     */
    public static void solutionNo18() {
        System.out.println("output");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name ");
        String name = scanner.next();
        System.out.println("Please enter your age ");
        int age = scanner.nextInt();
        System.out.println("Please enter your city name ");
        String cityName = scanner.next();
        System.out.println("Please enter the name of your college ");
        String collegeName = scanner.next();
        System.out.println("Please enter your profession");
        String profession = scanner.next();
        System.out.println("Please enter the type of animal you have as a pet");
        String animalType = scanner.next();
        System.out.println("Please enter the name of your pet");
        String petName = scanner.next();
        System.out.println("There once was a person named " + name + " who lived in " + cityName + ". At the age of " + age + ",\n" +
                name + " went to college at " + collegeName + ". " + name + " graduated and went to work as a\n" +
                profession + ". Then, " + name + " adopted a(n) " + animalType + " named " + petName + ". They both lived\n" +
                "happily ever after!");
    }

    /**
     * Last month Joe purchased some stock in Acme Software, Inc. Here are the details of
     * the purchase:
     * • The number of shares that Joe purchased was 1,000.
     * • When Joe purchased the stock, he paid $32.87 per share.
     * • Joe paid his stockbroker a commission that amounted to 2% of the amount he paid
     * for the stock.
     * Two weeks later Joe sold the stock. Here are the details of the sale:
     * • The number of shares that Joe sold was 1,000.
     * • He sold the stock for $33.92 per share.
     * • He paid his stockbroker another commission that amounted to 2% of the amount he
     * received for the stock.
     * Write a program that displays the following information:
     * • The amount of money Joe paid for the stock.
     * • The amount of commission Joe paid his broker when he bought the stock.
     * • The amount that Joe sold the stock for.
     * • The amount of commission Joe paid his broker when he sold the stock.
     * • Display the amount of profit that Joe made after selling his stock and paying the two
     * commissions to his broker. (If the amount of profit that your program displays is a
     * negative number, then Joe lost money on the transaction.)
     */
    public static void solutionNo19() {

        double noOfShares = 1000;
        double purchasePrice = 32.87;
        double commissionPercentage = 0.02;
        double sellingPrice = 33.92;
        double totalPurchaseAmount = noOfShares * purchasePrice;
        double purchaseCommission = totalPurchaseAmount * commissionPercentage;
        double totalSellingAmount = noOfShares * sellingPrice;
        double sellingCommission = totalSellingAmount * commissionPercentage;
        System.out.println("Joe paid " + totalPurchaseAmount + "$ for the stocks.");
        System.out.println("The amount of commission that Joe paid his broker at the time of purchase is " + purchaseCommission + "$");
        System.out.println("Joe sold the stocks for " + totalSellingAmount + "$.");
        System.out.println("The amount of commission that Joe paid his broker at the time of selling is " + sellingCommission + "$.");
        System.out.println("The amount of profit that Joe made after selling his stock and paying the two commission to his broker is " + (totalSellingAmount - sellingCommission - purchaseCommission - totalPurchaseAmount) + "$");
    }

    public static void main(String[] args) {

        //solutionNo1();
        //solutionNo2();
        //solutionNo3();
        solutionNo17();

    }
}
