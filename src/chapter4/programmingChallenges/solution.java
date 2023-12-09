package src.chapter4.programmingChallenges;

import java.util.Scanner;

public class solution {
    /**
     * Write a program that asks the user for a positive nonzero integer value. The program should
     * use a loop to get the sum of all the integers from 1 up to the number entered. For example,
     * if the user enters 50, the loop will find the sum of 1, 2, 3, 4, . . . 50.
     */
    public static void solutionNo1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int givenNo = scanner.nextInt();
        int sum = 0;
        int adder = 0;
        while (adder <= givenNo) {
            sum = sum + adder;
            adder++;
        }
        System.out.println(sum);
    }

    /**
     * The distance a vehicle travels can be calculated as follows:
     * Distance 5 Speed * Time
     * For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is
     * 120 miles. Write a program that asks for the speed of a vehicle (in miles-per-hour) and the
     * number of hours it has traveled. It should use a loop to display the distance a vehicle has
     * traveled for each hour of a time period specified by the user. For example, if a vehicle is
     * traveling at 40 mph for a three-hour time period, it should display a report similar to the
     * one that follows:
     * Input Validation: Do not accept a negative number for speed and do not accept any value
     * less than 1 for time traveled.
     */
    public static void solutionNo2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the time in hours");
        int time = scanner.nextInt();
        System.out.println("Please enter the speed of the vehicle");
        int speed = scanner.nextInt();
        int distance = 0;
        while (time < 1 || speed < 0) {
            System.out.println("Please enter valid inputs");
            System.out.println("Please enter the time in hours");
            time = scanner.nextInt();
            System.out.println("Please enter the speed of the vehicle");
            speed = scanner.nextInt();
        }
        distance = speed * time;
        int distanceInAnHour = distance / time;
        System.out.println("Hour                 \t        Distance Traveled");
        for (int i = 1; i <= time; i++) {
            System.out.println(i + "                      " + distanceInAnHour * i);
        }
    }

    /**
     * Modify the program you wrote for Programming Challenge 2 (Distance Traveled) so it
     * writes the report to a file instead of the screen. Open the file in Notepad or another text
     * editor to confirm the output.
     */

    public static void solutionNo3() {

    }

    /**
     * Write a program that calculates the amount a person would earn over a period of time if his
     * or her salary is one penny the first day, two pennies the second day, and continues to double
     * each day. The program should display a table showing the salary for each day, and then
     * show the total pay at the end of the period. The output should be displayed in a dollar
     * amount, not the number of pennies.
     * Input Validation: Do not accept a number less than 1 for the number of days worked.
     */
    public static void solutionNo4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no of days");
        int noOfDays = scanner.nextInt();
        double salary = 1;
        for (int i = 1; i <= noOfDays; i++) {
            System.out.println("Day " + i + " salary = " + salary / 100 + "$");
            salary = salary * 2;
        }
    }

    /**
     * Write a program that asks the user to enter a string, and then asks the user to enter a character.
     * The program should count and display the number of times that the specified character
     * appears in the string.
     */
    public static void solutionNo5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String string = scanner.nextLine();
        System.out.println("Please enter a character");
        char character = scanner.next().charAt(0);
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                j++;
            }
        }
        System.out.println(character + " has appeared " + j + " times in the string");
    }

    /**
     * Write a program that asks the user to enter the name of a file, and then asks the user to
     * enter a character. The program should count and display the number of times that the
     * specified character appears in the file. Use Notepad or another text editor to create a simple
     * file that can be used to test the program.
     */
    public static void solutionNo6() {

    }

    /**
     * A hotel’s occupancy rate is calculated as follows:
     * Occupancy rate 5 Number of rooms occupied 4 Total number of rooms
     * Write a program that calculates the occupancy rate for each floor of a hotel. The program
     * should start by asking for the number of floors in the hotel. A loop should then iterate once
     * for each floor. During each iteration, the loop should ask the user for the number of rooms
     * on the floor and the number of them that are occupied. After all the iterations, the program
     * should display the number of rooms the hotel has, the number of them that are occupied,
     * the number that are vacant, and the occupancy rate for the hotel.
     * Input Validation: Do not accept a value less than 1 for the number of floors. Do not accept
     * a number less than 10 for the number of rooms on a floor.
     */

    public static void solutionNo7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no of floors in the hotel");
        int floors = scanner.nextInt();
        while (floors < 1) {
            System.out.println("Please enter a valid amount");
            System.out.println("Please enter the no of floors in the hotel");
            floors = scanner.nextInt();
        }
        double totalNoOfRooms = 0;
        double totalNoOfOccupiedRooms = 0;
        for (int i = 0; i <= floors; i++) {
            System.out.println("Please enter the no of rooms on floor " + i);
            int rooms = scanner.nextInt();
            while (rooms < 10) {
                System.out.println("Please enter a valid amount");
                System.out.println("Please enter the no of rooms on floor " + i);
                rooms = scanner.nextInt();
            }
            System.out.println("Please enter the no of occupied rooms");
            int occupied = scanner.nextInt();
            while (occupied > rooms) {
                System.out.println("Please enter valid no of occupied rooms");
                System.out.println("Please enter the no of occupied rooms");
                occupied = scanner.nextInt();
            }
            totalNoOfRooms = totalNoOfRooms + rooms;
            totalNoOfOccupiedRooms = totalNoOfOccupiedRooms + occupied;
        }
        System.out.println("Total no of rooms = " + totalNoOfRooms);
        System.out.println("Total no of occupied rooms = " + totalNoOfOccupiedRooms);
        System.out.println("Total no of vacant rooms = " + (totalNoOfRooms - totalNoOfOccupiedRooms));
        System.out.println("Occupancy rate = " + totalNoOfOccupiedRooms / totalNoOfRooms);
    }

    /**
     * Write a program that uses nested loops to collect data and calculate the average rainfall
     * over a period of years. First the program should ask for the number of years. The outer loop
     * will iterate once for each year. The inner loop will iterate 12 times, once for each month.
     * Each iteration of the inner loop will ask the user for the inches of rainfall for that month.
     * After all iterations, the program should display the number of months, the total inches of
     * rainfall, and the average rainfall per month for the entire period.
     * Input Validation: Do not accept a number less than 1 for the number of years. Do not
     * accept negative numbers for the monthly rainfall.
     */
    public static void solutionNo8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of years");
        int years = scanner.nextInt();
        int months = 12;
        int totalRainfall = 0;
        while (years < 1) {
            System.out.println("Please enter valid number of years");
            System.out.println("Please enter the number of years");
            years = scanner.nextInt();
        }
        for (int i = 1; i <= years; i++) {

            for (int j = 0; j < months; j++) {
                System.out.println("Please enter the inches of rainfall this month");
                int rainfall = scanner.nextInt();
                while (rainfall < 0) {
                    System.out.println("Please enter a valid value");
                    System.out.println("Please enter the inches of rainfall this month");
                    rainfall = scanner.nextInt();
                }
                totalRainfall = totalRainfall + rainfall;
            }
        }
        System.out.println("Total no of months are " + months * years);
        System.out.println("Total inches of rainfall is " + totalRainfall);
        System.out.println("Average inches of rainfall per month is " + totalRainfall / (months * years));
    }

    /**
     * Write a program that will predict the size of a population of organisms. The program
     * should ask for the starting number of organisms, their average daily population increase
     * (as a percentage), and the number of days they will multiply. For example, a population
     * might begin with two organisms, have an average daily increase of 50 percent, and will be
     * allowed to multiply for seven days. The program should use a loop to display the size of
     * the population for each day.
     * Input Validation: Do not accept a number less than 2 for the starting size of the population.
     * Do not accept a negative number for average daily population increase. Do not accept a
     * number less than 1 for the number of days they will multiply.
     */
    public static void solutionNo9() {
        Scanner scanner = new Scanner(System.in);
        double population = 0;
        System.out.println("Please enter the starting no of the organisms");
        double organisms = scanner.nextDouble();
        while (organisms < 2) {
            System.out.println("PLease enter a minimum of 2 starting organisms");
            System.out.println("Please enter the starting no of the organisms");
            organisms = scanner.nextDouble();
        }
        System.out.println("Please enter the daily percentage of population Increase");
        double dailyPopulationIncrease = scanner.nextDouble();
        while (dailyPopulationIncrease < 0) {
            System.out.println("Please enter a valid value");
            System.out.println("Please enter the daily percentage of population Increase");
            dailyPopulationIncrease = scanner.nextDouble();
        }
        System.out.println("Please enter the number of days they will multiply");
        int days = scanner.nextInt();
        while (days < 1) {
            System.out.println("Please enter valid no of days");
            System.out.println("Please enter the number of days they will multiply");
            days = scanner.nextInt();
        }
        for (int i = 1; i <= days; i++) {
            population = organisms * (i * dailyPopulationIncrease / 100);
            System.out.println("The size of population on day " + i + " is " + population);
        }
    }

    /**
     * Write a program with a loop that lets the user enter a series of integers. The user should
     * enter −99 to signal the end of the series. After all the numbers have been entered, the program
     * should display the largest and smallest numbers entered.
     */
    public static void solutionNo10() {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        int smallest = 0;
        int value = 0;
        while (value != -99) {

            System.out.println("Please enter a number. Enter -99 to end");
            value = scanner.nextInt();
            if (value == -99) {
                break;
            } else if (value > largest) {
                largest = value;
            } else if (value < smallest) {
                smallest = value;
            }
        }
        System.out.println("The largest value is " + largest);
        System.out.println("The smallest value is " + smallest);
    }

    /**
     * Write a program that displays a table of the Celsius temperatures 0 through 20 and
     * their Fahrenheit equivalents. The formula for converting a temperature from Celsius to
     * Fahrenheit is
     * F=9/5 C + 32
     * where F is the Fahrenheit temperature and C is the Celsius temperature. Your program must
     * use a loop to display the table.
     */

    public static void solutionNo11() {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + " Degree = " + ((9 / 5) * i + 32) + " Fahrenheit");
        }
    }

    /**
     * Write a program that asks the user to enter today’s sales for five stores. The program should
     * display a bar chart comparing each store’s sales. Create each bar in the bar chart by displaying
     * a row of asterisks. Each asterisk should represent $100 of sales. Here is an example of
     * the program’s output:
     * Enter today's sales for store 1: 1000 [Enter]
     * Enter today's sales for store 2: 1200 [Enter]
     * Enter today's sales for store 3: 1800 [Enter]
     * Enter today's sales for store 4: 800 [Enter]
     * Enter today's sales for store 5: 1900 [Enter]
     * SALES BAR CHART
     * Store 1: **********
     * Store 2: ************
     * Store 3: ******************
     * Store 4: ********
     * Store 5: *******************
     */
    public static void solutionNo12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today's sales for store 1");
        int store1 = scanner.nextInt();
        System.out.println("Enter today's sales for store 2");
        int store2 = scanner.nextInt();
        System.out.println("Enter today's sales for store 3");
        int store3 = scanner.nextInt();
        System.out.println("Enter today's sales for store 4");
        int store4 = scanner.nextInt();
        System.out.println("Enter today's sales for store 5");
        int store5 = scanner.nextInt();


        System.out.print("Store 1 : ");
        for (int j = 0; j < store1 / 100; j++) {
            System.out.print("*");
        }
        System.out.println();


        System.out.print("Store 2 : ");

        for (int j = 0; j < store2 / 100; j++) {
            System.out.print("*");
        }
        System.out.println();


        System.out.println("Store 3 : ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < store3 / 100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Store 4 : ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < store4 / 100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Store 5 : ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < store5 / 100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Write a program that asks the user to enter the amount that he or she has budgeted for
     * a month. A loop should then prompt the user to enter each of his or her expenses for the
     * month, and keep a running total. When the loop finishes, the program should display the
     * amount that the user is over or under budget.
     */
    public static void solutionNo16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your budget for this month");
        double budget = scanner.nextDouble();
        double total = 0;
        System.out.println("Please enter total no of expenses");
        int expense = scanner.nextInt();
        for (int i = 1; i <= expense; i++) {
            System.out.println("Please enter the amount of expense # " + i);
            total = total + scanner.nextDouble();
        }
        System.out.println("Your total expense is " + total);
        if (total < budget) {
            System.out.println("You are under budget");
        } else if (total > budget) {
            System.out.println("You are over budget");
        }
    }

    /**
     * Write a program that generates a random number and asks the user to guess what the
     * number is. If the user’s guess is higher than the random number, the program should display
     * “Too high, try again.” If the user’s guess is lower than the random number, the program
     * should display “Too low, try again.” The program should use a loop that repeats until the
     * user correctly guesses the random number.
     */
    public static void solutionNo17() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game.\n The computer has randomly selected a number between 1 and 100");
        System.out.println("Take a guess until you succeed");
        int input = scanner.nextInt();
        int random = (int) (Math.random() * (100 - 1) + 1);

        while (input != random) {


            if (input < random) {
                System.out.println("Too low try again");
            } else {
                System.out.println("Too high try again");
            }

            System.out.println("Take a guess until you succeed");
            input = scanner.nextInt();

        }


        System.out.println("Congratulations you got it");


    }

    /**
     * Enhance the program that you wrote for Programming Challenge 17 so it keeps a count
     * of the number of guesses that the user makes. When the user correctly guesses the random
     * number, the program should display the number of guesses.
     */
    public static void solutionNo18() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to the number guessing game.\n The computer has randomly selected a number between 1 and 100");
        System.out.println(" Take a guess until you succeed");
        int input = scanner.nextInt();
        int random = (int) (Math.random() * (100 - 1) + 1);
        int i = 0;
        while (input != random) {
            if (input < random) {
                System.out.println("Too low try again");
                input = scanner.nextInt();
            } else if (input > random) {
                System.out.println("Too high try again");
                input = scanner.nextInt();
            }
            i++;
        }
        if (input == random) {
            System.out.println("Congratulations you got it");
            System.out.println("You took " + (i + 1) + " tries");
        }
    }

    /**
     * Write a program that asks the user for a positive integer no greater than 15. The program
     * should then display a square on the screen using the character ‘X’. The number entered by
     * the user will be the length of each side of the square. For example, if the user enters 5, the
     * program should display the following:
     * XXXXX
     * XXXXX
     * XXXXX
     * XXXXX
     * XXXXX
     * If the user enters 8, the program should display the following:
     * XXXXXXXX
     * XXXXXXXX
     * XXXXXXXX
     * XXXXXXXX
     * XXXXXXXX
     * XXXXXXXX
     * XXXXXXXX
     * XXXXXXXX
     */

    public static void solutionNo19() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 15");
        int num = scanner.nextInt();
        while (num < 1) {
            System.out.println("Enter a valid value");
            System.out.println("Please enter a number between 1 and 15");
            num = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            System.out.println();
            for (int j = 0; j < num; j++) {
                System.out.print("X");
            }
        }
    }

    /**
     * Write a program that plays a simple dice game between the computer and the user. When
     * the program runs, a loop should repeat 10 times. Each iteration of the loop should do the
     * following:
     * • Generate a random integer in the range of 1 through 6. This is the value of the
     * computer’s
     * die.
     * • Generate another random integer in the range of 1 through 6. This is the value of the
     * user’s die.
     * • The die with the highest value wins. (In case of a tie, there is no winner for that
     * particular
     * roll of the dice.)
     * As the loop iterates, the program should keep count of the number of times the computer
     * wins, and the number of times that the user wins. After the loop performs all of its iterations,
     * the program should display who was the grand winner, the computer or the user.
     */
    public static void solutionNo20() {
        System.out.println("The Dice Game");
        int player = 0;
        int computer = 0;
        for (int i = 0; i < 10; i++) {

            int computersDice = (int) (Math.random() * (6 - 1) + 1);
            int playersDice = (int) (Math.random() * (6 - 1) + 1);
            System.out.println("Computer's Dice = " + computersDice);
            System.out.println("Player's Dice = " + playersDice);
            if (computersDice > playersDice) {
                System.out.println("Computer won!");
                computer++;
            } else if (playersDice > computersDice) {
                System.out.println("Player won!");
                player++;
            } else {
                System.out.println("It's a tie");
            }
        }
        System.out.println("The grand winner is ");
        if (player > computer) {
            System.out.println("Player");
        } else if (computer > player) {
            System.out.println("Computer");
        }
    }

    /**
     * A slot machine is a gambling device that the user inserts money into and then pulls a lever
     * (or presses a button). The slot machine then displays a set of random images. If two or more
     * of the images match, the user wins an amount of money that the slot machine dispenses
     * back to the user.
     * Create a program that simulates a slot machine. When the program runs, it should do
     * the following:
     * • Asks the user to enter the amount of money he or she wants to enter into the slot machine.
     * • Instead of displaying images, the program will randomly select a word from the
     * following
     * list:
     * Cherries, Oranges, Plums, Bells, Melons, Bars
     * To select a word, the program can generate a random number in the range of 0
     * through 5. If the number is 0, the selected word is Cherries; if the number is 1, the
     * selected word is Oranges; and so forth. The program should randomly select a word
     * from this list three times and display all three of the words.
     * • If none of the randomly selected words match, the program will inform the user that
     * he or she has won $0. If two of the words match, the program will inform the user
     * that he or she has won two times the amount entered. If three of the words match, the
     * program will inform the user that he or she has won three times the amount entered.
     * • The program will ask whether the user wants to play again. If so, these steps are
     * repeated. If not, the program displays the total amount of money entered into the slot
     * machine and the total amount won.Decision Structures
     */
    public static void solutionNo21() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of money you want to enter in the slot machine");
        int money = scanner.nextInt();
        int spin1 = (int) (Math.random() * (5) + 0);
        int spin2 = (int) (Math.random() * (5) + 1);
        int spin3 = (int) (Math.random() * (5) + 1);
        int winnings = 0;
        //Cherries, Oranges, Plums, Bells, Melons, Bars
        if (spin1 == 0) {
            System.out.println("Cherries");
        } else if (spin1 == 1) {
            System.out.println("Oranges");
        } else if (spin1 == 2) {
            System.out.println("Plums");
        } else if (spin1 == 3) {
            System.out.println("Bells");
        } else if (spin1 == 4) {
            System.out.println("Melons");
        } else if (spin1 == 5) {
            System.out.println("Bars");
        }
        if (spin2 == 0) {
            System.out.println("Cherries");
        } else if (spin2 == 1) {
            System.out.println("Oranges");
        } else if (spin2 == 2) {
            System.out.println("Plums");
        } else if (spin2 == 3) {
            System.out.println("Bells");
        } else if (spin2 == 4) {
            System.out.println("Melons");
        } else if (spin2 == 5) {
            System.out.println("Bars");
        }
        if (spin3 == 0) {
            System.out.println("Cherries");
        } else if (spin3 == 1) {
            System.out.println("Oranges");
        } else if (spin3 == 2) {
            System.out.println("Plums");
        } else if (spin3 == 3) {
            System.out.println("Bells");
        } else if (spin3 == 4) {
            System.out.println("Melons");
        } else if (spin3 == 5) {
            System.out.println("Bars");
        }

        if (spin1 == spin2 && spin2 == spin3) {
            winnings = winnings + (money * 3);
            System.out.println("You won " + money * 3);
        } else if (spin1 == spin2 || spin1 == spin3 || spin2 == spin3) {
            winnings = winnings + (money * 2);
            System.out.println("You won " + money * 2);
        }

        System.out.println("Enter y if you want to play again or enter n to end");
        char decision = scanner.next().charAt(0);
        if (decision == 'y') {
            solutionNo21();
        } else {
            System.out.println("Your total winnings are " + winnings);
        }

    }

    public static void main(String[] args) {
        solutionNo12();
    }
}
