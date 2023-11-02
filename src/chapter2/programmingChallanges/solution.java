package src.chapter2.programmingChallanges;

import java.sql.SQLOutput;
import java.util.Scanner;

public class solution {

public static void solutionNo1(){
    String name = "Shahroz Khan";
    int age = 21;
    double annualPay = 1000000;
    System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn " + annualPay + " per year.");
}

public static void solutionNo2(){
    String firstName = "Muhammad";
    String middleName = "Shahroz";
    String lastName = "Khan";
    char firstInitial = 'M';
    char middleInitial = 'S';
    char lastInitial = 'K';

    System.out.println( firstName + " " + middleName + " " + lastName);
    System.out.println(firstInitial + " " + middleInitial + " " + lastInitial);
}

public static void solutionNo3(){
    String name = "Muhammad Shahroz Khan";
    String address = "9415 Remington Springs,Atlanta city,Maryland,28381";
    String telephoneNo = "2734863794";
    String collegeMajor = "Computer Science";
    System.out.println(name + "\n" + address + "\n" + telephoneNo + " \n" +collegeMajor);
}
public static void solutionNo4(){

    System.out.println("      *" + "\n" + "    * * *" + "\n" + "  * * * * *" + "\n" + "* * * * * * *" + "\n"
            + "  * * * * *" + "\n" + "    * * *" + "\n" + "      *" );
}
public static void solutionNo5(){
    float sale = 4.6f;
    float percentage = 0.62f;

    System.out.println("If the company produces $" +sale + " million in sales this year then");
    System.out.println( "$"+(sale*percentage)+" Million will be produced by the East cost division respectively");
}

public static void solutionNo6(){
    Scanner scanner = new Scanner(System.in);

    int calories = 75;

    System.out.println("Please enter the amount of cookies you have eaten ");
    int amount = scanner.nextInt();
    System.out.println("The amount of calories you have consumer are "+(calories*amount));
}

public static void solutionNo7(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the amount of the purchase ");
    double amount = scanner.nextDouble();
    double stateTax = 0.04;
    double countyTax = 0.02;
    System.out.println("The purchase amount is $"+amount);
    double tax1 = amount*stateTax;
    double tax2 = amount*countyTax;
    System.out.println("The state tax is $"+tax1);
    System.out.println("The county tax is $"+tax2);
    System.out.println("Total tax is $"+(tax1+tax2));
    System.out.println("Total amount is $"+(amount+tax1+tax2));
}
public static void solutionNo8(){
    Scanner scanner = new Scanner(System.in);

    int calories = 75;

    System.out.println("Please enter the amount of cookies you have eaten ");
    int amount = scanner.nextInt();
    System.out.println("The amount of calories you have consumer are "+(calories*amount));
}

public static void solutionNo9(){
    Scanner scanner =new Scanner(System.in);
    System.out.println("Please enter the number of miles you have traveled ");
    double miles =scanner.nextDouble();
    System.out.println("Please enter the gallons of petrol/diesel used ");
    double gallons = scanner.nextDouble();
    System.out.println("The MPG of your car is "+(miles/gallons));
}
public static void solutionNo10(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("PLease enter 1st test score.");
    double test1 =scanner.nextDouble();
    System.out.println("PLease enter 2nd test score.");
    double test2 =scanner.nextDouble();
    System.out.println("PLease enter 3rd test score.");
    double test3 =scanner.nextDouble();
    System.out.println("Marks of test 1 = " + test1);
    System.out.println("Marks of test 2 = " + test2);
    System.out.println("Marks of test 3 = " + test3);
    System.out.println("Average marks = " +(test1+test2+test3)/3);
}

public static void solutionNo11(){
Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the price of circuit board.");
    double circuitPrice = scanner.nextDouble();
    double profit = 0.4;
    System.out.println("The amount of profit is "+ circuitPrice * profit + "$");
}
public static void solutionNo12(){
    Scanner scanner =new Scanner(System.in);
    System.out.println("Please enter the name of your favourite city");
    String city = scanner.next();
    System.out.println("The no of characters in the name of the city is "+city.length());
    System.out.println("The name of the city in upper case letters is "+city.toUpperCase());
    System.out.println("The name of the cty in lower case letters is "+city.toLowerCase());
    System.out.println("The first character of the name of the city is "+city.charAt(0));
}
public static void solutionNo13(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the charge for the meal ");
    double meal =scanner.nextDouble();
    double tax =meal*0.0675;
    double total =meal+tax;
    double tip = total*0.2;
    double grandTotal = meal+tax+tip;
    System.out.println("The charge for the meal is "+meal);
    System.out.println("The tax on the meal is "+tax);
    System.out.println("The tip for the meal is "+tip);
    System.out.println("The grand total is "+grandTotal);
}
public static void solutionNo14(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Pleasr enter the amount of male students ");
    int maleStudents = scanner.nextInt();
    System.out.println("Please enter the amount of female students ");
    double femaleStudents = scanner.nextInt();
    double totalStudents = maleStudents + femaleStudents;
    double maleStudentsPercentage = (maleStudents/totalStudents) * 100;
    double femaleStudensPercentage = (femaleStudents/totalStudents) * 100;
    System.out.println("The percentage of Male students is " + maleStudentsPercentage + "%");
    System.out.println("The percentage of Female students is " + femaleStudensPercentage + "%");
}

public static void solutionNo15(){
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

public static void solutionNo16(){
    double noOfPeople = 12467;
    int peopleWhoPurchasedOneOrMore = (int) (noOfPeople * 0.14);
    int citrusFlavouredDrink = (int) (peopleWhoPurchasedOneOrMore * 0.64);
    System.out.println("The amount of people that buy energy drink are " + peopleWhoPurchasedOneOrMore);
    System.out.println("The amount of people that buz citrus flavoured drinks are " + citrusFlavouredDrink);
}

//A cookie recipe calls for the following ingredients:
//• 1.5 cups of sugar
//• 1 cup of butter
//• 2.75 cups of flour
//The recipe produces 48 cookies with these amounts of the ingredients. Write a program
//that asks the user how many cookies he or she wants to make, and then displays the number
//of cups of each ingredient needed for the specified number of cookies.
public static void solutionNo17(){
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

public static void solutionNo18(){
    System.out.println("output");
    Scanner scanner =new Scanner(System.in);
    System.out.println("Please enter your name ");
    String name =scanner.next();
    System.out.println("Please enter your age ");
    int age =scanner.nextInt();
    System.out.println("Please enter your city name ");
    String cityName =scanner.next();
    System.out.println("Please enter the name of your college ");
    String collegeName = scanner.next();
    System.out.println("Please enter your profession");
    String profession = scanner.next();
    System.out.println("Please enter the type of animal you have as a pet");
    String animalType = scanner.next();
    System.out.println("Please enter the name of your pet");
    String petName = scanner.next();
    System.out.println("There once was a person named " + name + " who lived in " + cityName + ". At the age of " + age + ",\n" +
            name +" went to college at " + collegeName +". " + name +" graduated and went to work as a\n" +
            profession + ". Then, "+ name +" adopted a(n) "+ animalType+ " named " + petName+ ". They both lived\n" +
            "happily ever after!");
}
public static void solutionNo19(){

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
    System.out.println("The amount of profit that Joe made after selling his stock and paying the two commission to his broker is "+(totalSellingAmount - sellingCommission - purchaseCommission -totalPurchaseAmount) + "$");
}

    public static void main(String[] args) {

        //solutionNo1();
        //solutionNo2();
        //solutionNo3();
        solutionNo17();

    }
}
