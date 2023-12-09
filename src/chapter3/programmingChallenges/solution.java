package src.chapter3.programmingChallenges;

import java.util.Objects;
import java.util.Scanner;

public class solution {

    /**
     * Write a program that prompts the user to enter a number within the range of 1 through 10.
     * The program should display the Roman numeral version of that number. If the number is
     * outside the range of 1 through 10, the program should display an error message.
     */

    public static void solutionNo1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int input = scanner.nextInt();
        if (input >= 1 && input <= 10) {
            if (input == 1) {
                System.out.println("I");
            } else if (input == 2) {
                System.out.println("II");
            } else if (input == 3) {
                System.out.println("III");
            } else if (input == 4) {
                System.out.println("IV");
            } else if (input == 5) {
                System.out.println("V");
            } else if (input == 6) {
                System.out.println("VI");
            } else if (input == 7) {
                System.out.println("VII");
            } else if (input == 8) {
                System.out.println("VIII");
            } else if (input == 9) {
                System.out.println("IX");
            } else if (input == 10) {
                System.out.println("X");
            }
        } else {
            System.out.println("Value out of range.");
        }

    }

    /**
     * The date June 10, 1960, is special because when we write it in the following format, the
     * month times the day equals the year:
     * 6/10/60
     * Write a program that asks the user to enter a month (in numeric form), a day, and a twodigit
     * year. The program should then determine whether the month times the day is equal
     * to the year. If so, it should display a message saying the date is magic. Otherwise, it should
     * display a message saying the date is not magic.
     */
    public static void solutionNo2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a date");
        int date = scanner.nextInt();
        System.out.println("Please enter a month in numbers");
        int month = scanner.nextInt();
        System.out.println("Please enter a years last two digits");
        int year = scanner.nextInt();

        if (date * month == year) {
            System.out.println("The date is magical");
        } else {
            System.out.println("The date is not magical");
        }
    }

    /**
     * Write a program that calculates and displays a person’s body mass index (BMI). The BMI is
     * often used to determine whether a person with a sedentary lifestyle is overweight or underweight
     * for his or her height. A person’s BMI is calculated with the following formula:
     * BMI 5 Weight 3 703 / Height2
     * where weight is measured in pounds and height is measured in inches. The program should
     * display a message indicating whether the person has optimal weight, is underweight, or is
     * overweight. A sedentary person’s weight is considered optimal if his or her BMI is between
     * 18.5 and 25. If the BMI is less than 18.5, the person is considered underweight. If the BMI
     * value is greater than 25, the person is considered overweight.
     */
    public static void solutionNo3() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight in pounds.");
        double weight = scanner.nextDouble();
        System.out.println("Please enter your height in inches");
        double height = scanner.nextByte();
        double BMI = weight * 707 / (height * height);
        System.out.println("Your BMI is " + BMI);
        if (BMI < 18.5) {
            System.out.println("You are underweight");
        } else if (BMI <= 25) {
            System.out.println("Your weight is optimal");
        } else {
            System.out.println("You are overweight");
        }
    }

    /**
     * Write a program that has variables to hold three test scores. The program should ask the
     * user to enter three test scores and then assign the values entered to the variables. The program
     * should display the average of the test scores and the letter grade that is assigned for
     * the test score average. Use the grading scheme in the following table:
     * Test Score Average       Letter Grade
     * 90–100                       A
     * 80–89                        B
     * 70–79                        C
     * 60–69                        D
     * Below 60                     F
     */
    public static void solutionNo4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 test scores out of 100");
        double testNo1 = scanner.nextDouble();
        double testNo2 = scanner.nextDouble();
        double testNo3 = scanner.nextDouble();
        double average = (testNo1 + testNo2 + testNo3) / 300 * 100;
        System.out.println("Your average score is " + average);
        if (average >= 90) {
            System.out.println("Your grade is A");
        } else if (average >= 80 && average <= 89) {
            System.out.println("Your grade is B");
        } else if (average >= 70 && average <= 79) {
            System.out.println("Your grade is C");
        } else if (average >= 60 && average <= 69) {
            System.out.println("Your grade is D");
        } else if (average < 60) {
            System.out.println("Your grade is F");
        }
    }

    /**
     * Scientists measure an object’s mass in kilograms and its weight in Newtons. If you know the
     * amount of mass that an object has, you can calculate its weight, in Newtons, with the following
     * formula:
     * Weight 5 Mass 3 9.8
     * Write a program that asks the user to enter an object’s mass, and then calculate its weight.
     * If the object weighs more than 1,000 Newtons, display a message indicating that it is too
     * heavy. If the object weighs less than 10 Newtons, display a message indicating that the
     * object is too light.
     */
    public static void solutionNo5() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the mass in KGs");
        double mass = scanner.nextDouble();
        double weight = mass * 9.8;
        System.out.println("The weight of the object is " + weight + " Newtons.");
        if (weight < 10) {
            System.out.println("The object is too light");
        } else if (weight > 1000) {
            System.out.println("The object is too heavy");
        }
    }

    /**
     * Write a program that asks the user to enter a number of seconds.
     * • There are 60 seconds in a minute. If the number of seconds entered by the user is
     * greater than or equal to 60, the program should display the number of minutes in that
     * many seconds.
     * • There are 3,600 seconds in an hour. If the number of seconds entered by the user is
     * greater than or equal to 3,600, the program should display the number of hours in
     * that many seconds.
     * • There are 86,400 seconds in a day. If the number of seconds entered by the user is
     * greater than or equal to 86,400, the program should display the number of days in
     * that many seconds.
     */
    public static void solutionNo6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the time in seconds");
        int time = scanner.nextInt();
        int minutes = (time / 60) % 60;
        int hours = (time / 3600) % 24;
        int days = (time / 86400);

        if (time < 60) {
            System.out.println("The time is " + time + " seconds");
        } else if (time >= 60 && time < 3600) {
            System.out.println("The time is " + minutes + " minutes");
        } else if (time >= 3600 && time < 86400) {
            System.out.println("The time is " + hours + " hours and " + minutes + " minutes");
        } else if (time >= 86400) {
            System.out.println("The time is " + days + " days " + hours + " hours and " + minutes + " minutes");
        }
    }

    /**
     * Write a program that asks the user to enter three names, and then displays the names sorted
     * in ascending order. For example, if the user entered “Charlie”, “Leslie”, and “Andy”, the
     * program would display:
     * Andy
     * Charlie
     * Leslie
     */
    public static void solutionNo7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three names");
        String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();
        String first = "";
        String second = "";
        String third = "";
        System.out.println("The names in ascending order are :");
        if (name1.charAt(0) < name2.charAt(0)) {
            first = name1;
            second = name2;
        } else {
            first = name2;
            second = name1;
        }

        if (name3.charAt(0) < first.charAt(0)) {
            first = name3;
            third = name1;
        } else if (third.charAt(0) < second.charAt(0)) {
            String temp = second;
            second = third;
            third = temp;
        } else {
            third = name3;
        }
        System.out.println(first + "\n" + second + "\n" + third);
    }

    /**
     * A software company sells a package that retails for $99. Quantity discounts are given
     * according to the following table:
     * Quantity         Discount
     * 10–19                20%
     * 20–49                30%
     * 50–99                40%
     * 100 or more          50%
     * Write a program that asks the user to enter the number of packages purchased. The program
     * should then display the amount of the discount (if any) and the total amount of the
     * purchase after the discount.
     */
    public static void solutionNo8() {
        Scanner scanner = new Scanner(System.in);
        double packagePrice = 99;
        System.out.println("PLease enter the number of packages purchased");
        int numberOfPackages = scanner.nextInt();
        double discountedAmount = 0;
        double totalPrice = numberOfPackages * packagePrice;
        if (numberOfPackages >= 10 && numberOfPackages <= 19) {
            System.out.println("Price before discount = " + totalPrice);
            System.out.println("Discount percentage = 20%");
            discountedAmount = totalPrice * 0.20;
            System.out.println("Amount of discount =" + discountedAmount);
            System.out.println("Total Price after discount = " + (totalPrice - discountedAmount));
        } else if (numberOfPackages >= 20 && numberOfPackages <= 49) {
            System.out.println("Price before discount = " + totalPrice);
            System.out.println("Discount percentage = 20%");
            discountedAmount = totalPrice * 0.30;
            System.out.println("Amount of discount =" + discountedAmount);
            System.out.println("Total Price after discount = " + (totalPrice - discountedAmount));
        } else if (numberOfPackages >= 50 && numberOfPackages <= 99) {
            System.out.println("Price before discount = " + totalPrice);
            System.out.println("Discount percentage = 20%");
            discountedAmount = totalPrice * 0.40;
            System.out.println("Amount of discount =" + discountedAmount);
            System.out.println("Total Price after discount = " + (totalPrice - discountedAmount));
        } else if (numberOfPackages >= 100) {
            System.out.println("Price before discount = " + totalPrice);
            System.out.println("Discount percentage = 20%");
            discountedAmount = totalPrice * 0.50;
            System.out.println("Amount of discount =" + discountedAmount);
            System.out.println("Total Price after discount = " + (totalPrice - discountedAmount));
        } else {
            System.out.println("Total Amount = " + totalPrice);
        }
    }

    /**
     * The Fast Freight Shipping Company charges the following rates:
     * Weight of Package                        Rate per 500 Miles Shipped
     * 2 pounds or less                                 $1.10
     * Over 2 pounds but not more than 6 pounds         $2.20
     * Over 6 pounds but not more than 10 pounds        $3.70
     * Over 10 pounds                                   $3.80
     * The shipping charges per 500 miles are not prorated. For example, if a 2-pound package is
     * shipped 550 miles, the charges would be $2.20. Write a program that asks the user to enter
     * the weight of a package and then displays the shipping charges.
     */
    public static void solutionNo9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the weight of the package in pounds");
        double weight = scanner.nextDouble();
        if (weight <= 2) {
            System.out.println("Your shipping charges are 1.10$");
        } else if (weight > 2 && weight <= 6) {
            System.out.println("Your shipping charges are 2.20$");
        } else if (weight > 6 && weight <= 10) {
            System.out.println("Your shipping charges are 3.70$");
        } else if (weight > 10) {
            System.out.println("Your shipping charges are 3.80$");
        }
    }

    /**
     * Write a program that asks the user to enter the number of calories and fat grams in a food
     * item. The program should display the percentage of the calories that come from fat. One
     * gram of fat has 9 calories; therefore:
     * Calories from fat 5 Fat grams * 9
     * The percentage of calories from fat can be calculated as follows:
     * Calories from fat 4 Total calories
     * If the calories from fat are less than 30 percent of the total calories of the food, it should
     * also display a message indicating the food is low in fat.
     */
    public static void solutionNo10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no of calories in the food");
        double calories = scanner.nextDouble();
        System.out.println("Please enter the no of fat grams in the food");
        double fatGrams = scanner.nextDouble();
        double caloriesFromFat = fatGrams * 9;
        double caloriesPercentage = caloriesFromFat / calories;
        if (caloriesFromFat > calories) {
            System.out.println("Please enter valid input");
        } else if (caloriesPercentage < 30) {
            System.out.println("The calories percentage in your food is " + caloriesPercentage + "%");
            System.out.println("The food is low in fat");
        }

    }

    /**
     * Write a program that asks for the names of three runners and the time, in minutes, it took
     * each of them to finish a race. The program should display the names of the runners in the
     * order that they finished.
     */
    public static void solutionNo11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of 1st runner");
        String name1 = scanner.next();
        System.out.println("Please enter the finishing time in minutes");
        int time1 = scanner.nextInt();
        System.out.println("Please enter the name of 2nd runner");
        String name2 = scanner.next();
        System.out.println("Please enter the finishing time in minutes");
        int time2 = scanner.nextInt();
        System.out.println("Please enter the name of 3rd runner");
        String name3 = scanner.next();
        System.out.println("Please enter the finishing time in minutes");
        int time3 = scanner.nextInt();
        String first = "";
        String second = "";
        String third = "";
        if (time1 < time2) {
            first = name1;
            second = name2;
        } else {
            first = name2;
            second = name1;
        }
        if (time3 < time1) {
            String temp = first;
            first = name3;
            third = temp;
        } else if (time3 < time2) {
            String temp = second;
            second = third;
            third = temp;
        } else {
            third = name3;
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    /**
     * The following table shows the approximate speed of sound in air, water, and steel:
     * Medium Speed
     * Air 1,100 feet per second
     * Water 4,900 feet per second
     * Steel 16,400 feet per second
     * Write a program that asks the user to enter “air”, “water”, or “steel”, and the distance that
     * a sound wave will travel in the medium. The program should then display the amount of
     * time it will take. You can calculate the amount of time it takes sound to travel in air with
     * the following formula:
     * Time 5 Distance / 1,100
     * You can calculate the amount of time it takes sound to travel in water with the following
     * formula:
     * Time 5 Distance / 4,900
     * You can calculate the amount of time it takes sound to travel in steel with the following
     * formula:
     * Time 5 Distance / 16,400
     */
    public static void solutionNo12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the medium you want to know the speed of light in air, water or steel");
        String medium = scanner.next();
        System.out.println("Please enter the distance");
        double distance = scanner.nextDouble();
        double time = 0;
        String medium1 = "air";
        String medium2 = "water";
        String medium3 = "steel";

        if (Objects.equals(medium, medium1)) {
            time = distance / 1100;
            System.out.println("The time taken = " + time + "seconds");
        } else if (Objects.equals(medium, medium2)) {
            time = distance / 4900;
            System.out.println("The time taken = " + time + "seconds");
        } else if (Objects.equals(medium, medium3)) {
            time = distance / 16400;
            System.out.println("The time taken = " + time + "seconds");
        }
    }

    /**
     * An Internet service provider has three different subscription packages for its customers:
     * Package A: For $9.95 per month 10 hours of access are provided. Additional hours
     * are $2.00 per hour.
     * Package B: For $13.95 per month 20 hours of access are provided. Additional hours
     * are $1.00 per hour.
     * Package C: For $19.95 per month unlimited access is provided.
     * Write a program that calculates a customer’s monthly bill. It should ask the user to enter
     * the letter of the package the customer has purchased (A, B, or C) and the number of hours
     * that were used. It should then display the total charges.
     */
    public static void solutionNo13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the package you have purchased A, B or C");
        String internetPackage = scanner.next();
        System.out.println("Please enter the no of hours used");
        double hours = scanner.nextDouble();
        double packageACharges = 9.95;
        double packageBCharges = 13.95;
        double packageCCharges = 19.95;
        double additionalHours = 0;
        double packageAAdditionalCharges = 2;
        double packageBAdditionalCharges = 1;
        double totalBill = 0;
        String package1 = "A";
        String package2 = "B";
        String package3 = "C";
        if (Objects.equals(internetPackage, package1)) {
            if (hours > 10) {
                additionalHours = hours - 10;
                totalBill = packageACharges + (additionalHours * packageAAdditionalCharges);
                System.out.println("Total Charges = " + totalBill + "$");
            } else {
                System.out.println("Total Charges = " + packageACharges + "$");
            }

        } else if (Objects.equals(internetPackage, package2)) {
            if (hours > 20) {
                additionalHours = hours - 20;
                totalBill = packageBCharges + (additionalHours * packageBAdditionalCharges);
                System.out.println("Total Charges = " + totalBill + "$");
            } else {
                System.out.println("Total Charges = " + packageBCharges + "$");
            }

        } else if (Objects.equals(internetPackage, package3)) {
            System.out.println("Total Charges = " + packageCCharges + "$");
        }
    }

    /**
     * A bank charges a base fee of $10 per month, plus the following check fees for a commercial
     * checking account:
     * $.10 each for less than 20 checks
     * $.08 each for 20–39 checks
     * $.06 each for 40–59 checks
     * $.04 each for 60 or more checks
     * Write a program that asks for the number of checks written for the month. The program
     * should then calculate and display the bank’s service fees for the month.
     */
    public static void solutionNo14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no of checks written this month");
        int noOfChecks = scanner.nextInt();
        double totalCharges = 10;
        if (noOfChecks < 20) {
            totalCharges = totalCharges + (.10 * noOfChecks);
            System.out.println("Total Service Fees = " + totalCharges + "$");
        } else if (noOfChecks >= 20 && noOfChecks < 40) {
            totalCharges = totalCharges + (.08 * noOfChecks);
            System.out.println("Total Service Fees = " + totalCharges + "$");
        } else if (noOfChecks >= 40 && noOfChecks < 60) {
            totalCharges = totalCharges + (.06 * noOfChecks);
            System.out.println("Total Service Fees = " + totalCharges + "$");
        } else {
            totalCharges = totalCharges + (.04 * noOfChecks);
            System.out.println("Total Service Fees = " + totalCharges + "$");
        }
    }

    /**
     * Serendipity Booksellers has a book club that awards points to its customers based on the
     * number of books purchased each month. The points are awarded as follows:
     * • If a customer purchases 0 books, he or she earns 0 points.
     * • If a customer purchases 1 book, he or she earns 5 points.
     * • If a customer purchases 2 books, he or she earns 15 points.
     * • If a customer purchases 3 books, he or she earns 30 points.
     * • If a customer purchases 4 or more books, he or she earns 60 points.
     * Write a program that asks the user to enter the number of books that he or she has purchased
     * this month and then displays the number of points awarded.
     */
    public static void solutionNo15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no of books purchased this month");
        int noOfBooks = scanner.nextInt();
        if (noOfBooks == 0) {
            System.out.println("You have earned 0 points");
        } else if (noOfBooks == 1) {
            System.out.println("You have earned 5 points");
        } else if (noOfBooks == 2) {
            System.out.println("You have earned 15 points");
        } else if (noOfBooks == 3) {
            System.out.println("You have earned 30 points");
        } else {
            System.out.println("You have earned 60 points ");
        }
    }


    public static void main(String[] args) {

        solutionNo15();


    }
}
