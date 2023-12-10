package src.chapter5.programmingChallenges;

import java.util.Random;
import java.util.Scanner;

public class solution {
    /**
     * Write a method named showChar. The method should accept two arguments: a reference to
     * a String object and an integer. The integer argument is a character position within the
     * String, with the first character being at position 0. When the method executes, it should
     * display the character at that character position. Here is an example of a call to the method:
     * showChar("New York", 2);
     * In this call, the method will display the character w because it is in position 2. Demonstrate
     * the method in a complete program.
     *
     * @param word     is the word entered by the user
     * @param position is the character position user entered.
     */
    public static void solutionNo1(String word, int position) {
        if (position < word.length()) {
            System.out.println(word.charAt(position));
        } else {
            System.out.println("Please enter correct position and try again");
        }
    }

    /**
     * Write a program that asks the user to enter an item’s wholesale cost and its markup percentage.
     * It should then display the item’s retail price. For example:
     * • If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent, then the
     * item’s retail price is 10.00.
     * • If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent, then the
     * item’s retail price is 7.50.
     * The program should have a method named calculateRetail that receives the wholesale
     * cost and the markup percentage as arguments, and returns the retail price of the item.
     *
     * @param wholeSalePrice   is the whole sale price of the product that user entered
     * @param markUpPercentage is the percentage of mark up user wants to take
     * @return is the final price
     */
    public static double solutionNo2(double wholeSalePrice, double markUpPercentage) {
        markUpPercentage = markUpPercentage / 100;
        double retailPrice = wholeSalePrice + (wholeSalePrice * markUpPercentage);
        return retailPrice;

    }

    /**
     * If you have downloaded the book’s source code from www.pearsonhighered.com/gaddis,
     * you will find a partially written program named AreaRectangle.java in this chapter’s
     * source code folder. Your job is to complete the program. When it is complete, the program
     * will ask the user to enter the width and length of a rectangle, and then display the rectangle’s
     * area. The program calls the following methods, which have not been written:
     * • getLength—This method should ask the user to enter the rectangle’s length, and then
     * return that value as a double.
     * • getWidth—This method should ask the user to enter the rectangle’s width, and then
     * return that value as a double.
     * • getArea—This method should accept the rectangle’s length and width as arguments, and
     * return the rectangle’s area. The area is calculated by multiplying the length by the width.
     * • displayData—This method should accept the rectangle’s length, width, and area as
     * arguments, and display them in an appropriate message on the screen.
     *
     * @param length is the length of the triangle/
     * @param width  is the width of the triangle.
     */
    public static void solutionNo3(double length, double width) {
        double area = length * width;
        System.out.println("The length of the triangle is " + length);
        System.out.println("The width of the triangle is " + width);
        System.out.println("The total area of the triangle is " + area);
    }

    /**
     * A painting company has determined that for every 115 square feet of wall space, one gallon
     * of paint and eight hours of labor will be required. The company charges $18.00 per hour
     * for labor. Write a program that allows the user to enter the number of rooms to be painted
     * and the price of the paint per gallon. It should also ask for the square feet of wall space in
     * each room. The program should have methods that return the following data:
     * • The number of gallons of paint required
     * • The hours of labor required
     * • The cost of the paint
     * • The labor charges
     * • The total cost of the paint job
     * Then it should display the data on the screen.
     */
    public static void solutionNo4() {
        Scanner scanner = new Scanner(System.in);
        int labourCostPerHour = 18;
        int labourWorkRatePerHour = 115 / 8;
        System.out.println("Please enter the no of rooms");
        int rooms = scanner.nextInt();
        System.out.println("Please enter the price of paint");
        int price = scanner.nextInt();
        int totalSquareFeet = 0;
        for (int i = 1; i <= rooms; i++) {
            System.out.println("Enter the square feet of wall space in room " + i);
            int squareFeet = scanner.nextInt();
            totalSquareFeet = totalSquareFeet + squareFeet;
        }
        int totalNoOfGallons = totalSquareFeet / 115;
        int totalHoursOfLabour = totalSquareFeet / labourWorkRatePerHour;
        int totalCostOfPaint = totalNoOfGallons * price;
        int totalCostOfLabour = totalHoursOfLabour * labourCostPerHour;
        int grandTotal = totalCostOfLabour + totalCostOfPaint;
        System.out.println("The no of gallons of paint required is " + totalNoOfGallons);
        System.out.println("The hours of labour required is " + totalHoursOfLabour);
        System.out.println("The cost of paint will be " + totalCostOfPaint);
        System.out.println("The cost of labour will be " + totalCostOfLabour);
        System.out.println("The total cost of paint job will be " + grandTotal);
    }

    /**
     * When an object is falling because of gravity, the following formula can be used to determine
     * the distance the object falls in a specific time period:
     * d 5 ½ gt2
     * The variables in the formula are as follows: d is the distance in meters, g is 9.8, and t is the
     * amount of time, in seconds, that the object has been falling.
     * Write a method named fallingDistance that accepts an object’s falling time (in seconds) as
     * an argument. The method should return the distance, in meters, that the object has fallen
     * during that time interval. Demonstrate the method by calling it in a loop that passes the
     * values 1 through 10 as arguments, and displays the return value.
     *
     * @param timeInSeconds is the no of seconds.
     * @return is the distance in meters.
     */
    public static double solutionNo5(int timeInSeconds) {

        double distanceInMeters = -1;
        final double gravity = 9.80665;
        if (timeInSeconds >= 0) {
            distanceInMeters = 0.5 * gravity * timeInSeconds * timeInSeconds;
        }
        return distanceInMeters;
    }

    /**
     * The formula for converting a temperature from Fahrenheit to Celsius is
     * C 5 5
     * 9
     * (F 2 32)
     * where F is the Fahrenheit temperature and C is the Celsius temperature. Write a method
     * named celsius that accepts a Fahrenheit temperature as an argument. The method
     * should return the temperature, converted to Celsius. Demonstrate the method by calling
     * it in a loop that displays a table of the Fahrenheit temperatures 0 through 20 and their
     * Celsius equivalents.
     */
    public static void solutionNo6() {
        for (int i = 1; i <= 20; i++) {
            int fahrenheit = i;
            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
            System.out.println(i + " Fahrenheit = " + celsius + " Celsius");
        }
    }

    /**
     * Write a program that asks the user to enter five test scores. The program should display
     * a letter grade for each score and the average test score. Write the following methods in
     * the program:
     * • calcAverage—This method should accept five test scores as arguments and return the
     * average of the scores.
     * • determineGrade—This method should accept a test score as an argument and return a
     * letter grade for the score, based on the following grading scale:
     * Score Letter         Grade
     * 90–100                 A
     * 80–89                  B
     * 70–79                  C
     * 60–69                  D
     * Below 60               F
     */
    public static double calcAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static char grades(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void solutionNo7() {
        Scanner input = new Scanner(System.in);
        double[] testScores = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            testScores[i] = input.nextDouble();
        }

        double average = calcAverage(testScores);
        System.out.println("Average Test Score: " + average);

        System.out.println("Letter Grades for the Test Scores:");
        for (int i = 0; i < 5; i++) {
            char grade = grades(testScores[i]);
            System.out.println("Test Score " + (i + 1) + ": " + testScores[i] + " - Grade: " + grade);
        }
    }

    /**
     * Write a program that asks the user to enter a distance in meters. The program will then present
     * the following menu of selections:
     * 1. Convert to kilometers
     * 2. Convert to inches
     * 3. Convert to feet
     * 4. Quit the program
     * The program will convert the distance to kilometers, inches, or feet, depending on the user’s
     * selection. Here are the specific requirements:
     * • Write a void method named showKilometers, which accepts the number of meters as
     * an argument. The method should display the argument converted to kilometers. Convert
     * the meters to kilometers using the following formula:
     * kilometers = meters * 0.001
     * • Write a void method named showInches, which accepts the number of meters as an
     * argument. The method should display the argument converted to inches. Convert the
     * meters to inches using the following formula:
     * inches = meters * 39.37
     * • Write a void method named showFeet, which accepts the number of meters as an
     * argument. The method should display the argument converted to feet. Convert the
     * meters to feet using the following formula:
     * feet = meters * 3.281
     * • Write a void method named menu that displays the menu of selections. This method
     * should not accept any arguments.
     * • The program should continue to display the menu until the user enters 4 to quit the
     * program.
     * • The program should not accept negative numbers for the distance in meters.
     * • If the user selects an invalid choice from the menu, the program should display an
     * error message.
     * Here is an example session with the program, using console input. The user’s input is shown
     * in bold.
     * Enter a distance in meters: 500 [Enter]
     * 1. Convert to kilometers
     * 2. Convert to inches
     * 3. Convert to feet
     * 4. Quit the program
     * Enter your choice: 1 [Enter]
     * 500 meters is 0.5 kilometers.
     * 1. Convert to kilometers
     * 2. Convert to inches
     * 3. Convert to feet
     * 4. Quit the program
     * Enter your choice: 3 [Enter]
     * 500 meters is 1640.5 feet.
     * 1. Convert to kilometers
     * 2. Convert to inches
     * 3. Convert to feet
     * 4. Quit the program
     * Enter your choice: 4 [Enter]
     * Bye!
     */
    public static void showKilometers(double meters) {

        double kilometer = meters * 0.001;
        System.out.println(kilometer);
    }

    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.println(inches);
    }

    public static void showFeet(double meters) {
        double feet = meters * 3.281;
    }

    public static void menu() {
        System.out.println("1.Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }

    public static void solutionNo8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the distance in meters");
        double meters = scanner.nextDouble();
        while (meters <= 0) {
            System.out.println("Please enter a valid value");
            System.out.println("Please enter the distance in meters");
            meters = scanner.nextDouble();
        }
        menu();
        System.out.println("Please enter your choice");
        int choice = scanner.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Please enter a valid choice");
            System.out.println("Please enter your choice");
            choice = scanner.nextInt();
        }
        while (choice != 4) {
            if (choice == 1) {
                showKilometers(meters);
                break;
            } else if (choice == 2) {
                showInches(meters);
                break;
            } else if (choice == 3) {
                showFeet(meters);
                break;
            }
        }

        if (choice == 4) {
            System.out.println("Bye");
        } else {
            solutionNo8();
        }
    }

    /**
     * The distance a vehicle travels can be calculated as follows:
     * Distance 5 Speed * Time
     * Write a method named distance that accepts a vehicle’s speed and time as arguments, and
     * returns the distance the vehicle has traveled. Modify the “Distance Traveled” program you
     * wrote in Chapter 4 (Programming Challenge 2) to use the method.
     */

    public static double solutionNo9(double speed, double timeInHours) {

        double distance = 0;
        if (speed > 0 && timeInHours > 0) {
            distance = speed * timeInHours;
        }

        return distance;
    }

    /**
     * The profit from the sale of a stock can be calculated as follows:
     * Profit 5 ((NS 3 SP) 2 SC) 2 ((NS 3 PP) 1 PC)
     * where NS is the number of shares, PP is the purchase price per share, PC is the purchase
     * commission paid, SP is the sale price per share, and SC is the sale commission paid. If the
     * calculation yields a positive value, then the sale of the stock resulted in a profit. If the calculation
     * yields a negative number, then the sale resulted in a loss.
     * Write a method that accepts as arguments the number of shares, the purchase price per
     * share, the purchase commission paid, the sale price per share, and the sale commission
     * paid. The method should return the profit (or loss) from the sale of stock. Demonstrate the
     * method in a program that asks the user to enter the necessary data and displays the amount
     * of the profit or loss.
     */
    public static void solutionNo10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no of shares");
        int noOfShares = scanner.nextInt();
        System.out.println("Please enter the rate of the shares");
        double rate = scanner.nextDouble();
        double shares = noOfShares * rate;
        System.out.println("Please enter the commission percentage");
        double buyCommissionRate = scanner.nextDouble() * 0.01;
        double commission = shares * buyCommissionRate;
        double grandTotal = shares + commission;
        System.out.println("Please enter the no of shares sold");
        int noOfSharesSold = scanner.nextInt();
        System.out.println("Please enter the selling rate of the shares");
        double saleRate = scanner.nextDouble();
        double sharesSellingPrice = noOfSharesSold * saleRate;
        System.out.println("Please enter the selling commission percentage");
        double saleCommissionRate = scanner.nextDouble() * 0.01;
        double sellingCommission = sharesSellingPrice * saleCommissionRate;
        double saleGrandTotal = sharesSellingPrice + saleCommissionRate;
        System.out.println("The no of shares bought are " + noOfShares);
        System.out.println("The price each share is bought at is " + rate);
        System.out.println("The commission rate that they have to give to the broker is " + buyCommissionRate);
        System.out.println("The total price of the shares is " + shares);
        System.out.println("Total commission paid is " + commission);
        System.out.println("The grand total is " + grandTotal);

        System.out.println("The no of shares sold are " + noOfSharesSold);
        System.out.println("The price each share is sold at is " + saleRate);
        System.out.println("The selling commission rate that they have to give to the broker is " + saleCommissionRate);
        System.out.println("The total price of the shares sold is " + sharesSellingPrice);
        System.out.println("Total selling commission paid is " + sellingCommission);
        System.out.println("The selling grand total is " + saleGrandTotal);

        System.out.println("Total profit is " + (saleGrandTotal - grandTotal));
    }

    /**
     * In physics, an object that is in motion is said to have kinetic energy. The following formula
     * can be used to determine a moving object’s kinetic energy:
     * KE 5 ½ mv2
     * The variables in the formula are as follows: KE is the kinetic energy, m is the object’s mass
     * in kilograms, and v is the object’s velocity, in meters per second.
     * Write a method named kineticEnergy that accepts an object’s mass (in kilograms) and
     * velocity (in meters per second) as arguments. The method should return the amount of
     * kinetic energy that the object has. Demonstrate the method by calling it in a program that
     * asks the user to enter values for mass and velocity.
     */
    public static void solutionNO12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Kinetic Energy Calculator");
        System.out.println("Please enter the mass of the object in kilograms");
        double mass = scanner.nextDouble();
        System.out.println("Please enter the velocity of the object in meter per second");
        double velocity = scanner.nextDouble();

        double kineticEnergy = (0.5 * mass * (velocity * velocity));
        System.out.println("The kinetic energy of the object is " + kineticEnergy);
    }

    /**
     * A prime number is a number that is evenly divisible only by itself and 1. For example, the
     * number 5 is prime because it can be evenly divided only by 1 and 5. The number 6, however,
     * is not prime because it can be divided evenly by 1, 2, 3, and 6.
     * Write a method named isPrime, which takes an integer as an argument and returns true if
     * the argument is a prime number, or false otherwise. Demonstrate the method in a complete
     * program.
     */
    public static boolean isPrime(int value) {
        if (value == 2 || value == 3)
            return true;

        int count = 2;
        boolean result = true;
        while (count < value / 2) {
            if (value % count == 0) {
                result = false;
                break;
            }
            count++;
        }
        return result;
    }

    public static void solutionNo13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value to know if it's prime or not");
        int value = scanner.nextInt();

        System.out.println(isPrime(value));
    }

    /**
     * You can use the following logic to determine whether a number is even or odd:
     * if ((number % 2) == 0)
     * {
     * // The number is even.
     * }
     * else
     * {
     * // The number is odd.
     * }
     * Write a program with a method named isEven that accepts an int argument. The method
     * should return true if the argument is even, or false otherwise. The program’s main method
     * should use a loop to generate 100 random integers. It should use the isEven method to
     * determine whether each random number is even, or odd. When the loop is finished, the
     * program should display the number of even numbers that were generated, and the number
     * of odd numbers.
     */
    public static String isEven(int value) {


        return value % 2 == 0 ? "Even" : "Odd";


    }

    public static void solutionNo15() {

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " " + isEven(i));
        }

    }

    /**
     * Suppose you want to deposit a certain amount of money into a savings account, and then
     * leave it alone to draw interest for the next 10 years. At the end of 10 years, you would like
     * to have $10,000 in the account. How much do you need to deposit today to make that
     * happen?
     * You can use the following formula, which is known as the present value formula,
     * to find out:
     * P = F/(1 + r)n
     * The terms in the formula are as follows:
     * • P is the present value, or the amount that you need to deposit today.
     * • F is the future value that you want in the account. (In this case, F is $10,000.)
     * • r is the annual interest rate.
     * • n is the number of years that you plan to let the money sit in the account.
     * Write a method named presentValue that performs this calculation. The method should
     * accept the future value, annual interest rate, and number of years as arguments. It should
     * return the present value, which is the amount that you need to deposit today. Demonstrate
     * the method in a program that lets the user experiment with different values for the formula’s
     * terms.
     */
    public static void solutionNo16() {
        double futureValue = 10000;
        double interestRate = 0.40;
        double noOfYears = 10;
        double presentValue = futureValue / Math.pow((1 + interestRate), noOfYears);
        System.out.println(presentValue);
    }

    /**
     * Write a program that lets the user play the game of Rock, Paper, Scissors against the computer.
     * The program should work as follows.
     * 1. When the program begins, a random number in the range of 1 through 3 is generated. If
     * the number is 1, then the computer has chosen rock. If the number is 2, then the computer
     * has chosen paper. If the number is 3, then the computer has chosen scissors. (Don’t
     * display the computer’s choice yet.)
     * 2. The user enters his or her choice of “rock”, “paper”, or “scissors” at the keyboard. (You
     * can use a menu if you prefer.)
     * 3. The computer’s choice is displayed.
     * 4. A winner is selected according to the following rules:
     * • If one player chooses rock and the other player chooses scissors, then rock wins. (The
     * rock smashes the scissors.)
     * • If one player chooses scissors and the other player chooses paper, then scissors wins.
     * (Scissors cuts paper.)
     * • If one player chooses paper and the other player chooses rock, then paper wins. (Paper
     * wraps rock.)
     * • If both players make the same choice, the game must be played again to determine
     * the winner.
     * Be sure to divide the program into methods that perform each major task.
     */
    public static int generateComputerChoice() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public static String getUserChoice(Scanner input) {
        System.out.println("Enter your choice: ");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");

        int choice = input.nextInt();
        return getChoiceName(choice);
    }

    public static String getChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid Choice";
        }
    }

    public static void determineWinner(int computerChoice, String userChoice) {
        if (computerChoice == 1 && userChoice.equals("Scissors") ||
                computerChoice == 2 && userChoice.equals("Rock") ||
                computerChoice == 3 && userChoice.equals("Paper")) {
            System.out.println("Computer wins!");
        } else if (userChoice.equals("Rock") && computerChoice == 3 ||
                userChoice.equals("Paper") && computerChoice == 1 ||
                userChoice.equals("Scissors") && computerChoice == 2) {
            System.out.println("You win!");
        } else {
            System.out.println("It's a tie! Play again.");
        }
    }

    public static void solutionNo17() {
        Scanner input = new Scanner(System.in);

        int computerChoice = generateComputerChoice();
        String userChoice = getUserChoice(input);

        String computerChoiceStr = getChoiceName(computerChoice);

        System.out.println("Computer's choice: " + computerChoiceStr);
        System.out.println("Your choice: " + userChoice);

        determineWinner(computerChoice, userChoice);
    }

    /**
     * Write a program that tests your ESP (extrasensory perception). The program should randomly
     * select the name of a color from the following list of words:
     * Red, Green, Blue, Orange, Yellow
     * To select a word, the program can generate a random number. For example, if the number
     * is 0, the selected word is Red; if the number is 1, the selected word is Green; and so forth.
     * Next, the program should ask the user to enter the color that the computer has selected.
     * After the user has entered his or her guess, the program should display the name of the randomly
     * selected color. The program should repeat this 10 times and then display the number
     * of times the user correctly guessed the selected color. Be sure to modularize the program
     * into methods that perform each major task.
     */

    public static String getRandomColor() {
        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        Random rand = new Random();
        int randomIndex = rand.nextInt(colors.length);
        return colors[randomIndex];
    }

    public static String getUserGuess(Scanner input) {
        System.out.print("Enter your guess (Red, Green, Blue, Orange, Yellow): ");
        return input.nextLine();
    }

    public static void solutionNo18() {
        Scanner input = new Scanner(System.in);
        int numberOfGuesses = 10;
        int correctGuesses = 0;

        for (int i = 0; i < numberOfGuesses; i++) {
            String selectedColor = getRandomColor();
            String userGuess = getUserGuess(input);
            System.out.println("Selected color: " + selectedColor);

            if (selectedColor.equalsIgnoreCase(userGuess)) {
                System.out.println("Correct guess!");
                correctGuesses++;
            } else {
                System.out.println("Wrong guess!");
            }

            System.out.println();
        }

        System.out.println("You correctly guessed the color " + correctGuesses + " out of " + numberOfGuesses + "times.");
    }

    public static void main(String[] args) {
        solutionNo18();
    }

    // CH 5
    // Unit tests
    // Doc for each method


}
