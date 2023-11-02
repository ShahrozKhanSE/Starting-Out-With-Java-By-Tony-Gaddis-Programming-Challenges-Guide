package src.chapter4.programmingChallenges;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.zip.ZipFile;

public class solution {
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
    public static void solutionNo2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the time in hours");
        int time = scanner.nextInt();
        System.out.println("Please enter the speed of the vehicle");
        int speed = scanner.nextInt();
        int distance = 0;
        while (time < 1 || speed < 0){
            System.out.println("Please enter valid inputs");
            System.out.println("Please enter the time in hours");
            time = scanner.nextInt();
            System.out.println("Please enter the speed of the vehicle");
            speed = scanner.nextInt();
        }
        distance = speed * time;
        int distanceInAnHour = distance / time;
        System.out.println("Hour                Distance Traveled");
        for (int i = 1; i <= time ; i++) {
            System.out.println(i+"                      "+distanceInAnHour*i );
        }
    }

    public static void solutionNo3(){

    }

    public static void solutionNo4(){
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Please enter the no of days");
        int noOfDays = scanner.nextInt();
        double salary = 1;
        for (int i = 1; i <= noOfDays; i++) {
                System.out.println("Day " + i + " salary = " + salary / 100 + "$");
                salary = salary * 2;
        }
    }
    public static void solutionNo5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String string = scanner.nextLine();
        System.out.println("Please enter a character");
        char character = scanner.next().charAt(0);
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character){
                j++;
            }
        }
        System.out.println(character+" has appeared "+ j + " times in the string");
    }
    public static void solutionNo6(){

    }

    public static void solutionNo7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no of floors in the hotel");
        int floors = scanner.nextInt();
        while (floors < 1){
            System.out.println("Please enter a valid amount");
            System.out.println("Please enter the no of floors in the hotel");
            floors = scanner.nextInt();
        }
        double totalNoOfRooms = 0;
        double totalNoOfOccupiedRooms = 0;
        for (int i = 0; i <= floors; i++) {
            System.out.println("Please enter the no of rooms on floor "+ i);
            int rooms = scanner.nextInt();
            while (rooms < 10){
                System.out.println("Please enter a valid amount");
                System.out.println("Please enter the no of rooms on floor "+ i);
                rooms = scanner.nextInt();
            }
            System.out.println("Please enter the no of occupied rooms");
            int occupied = scanner.nextInt();
            while (occupied > rooms){
                System.out.println("Please enter valid no of occupied rooms");
                System.out.println("Please enter the no of occupied rooms");
                occupied = scanner.nextInt();
            }
            totalNoOfRooms = totalNoOfRooms + rooms;
            totalNoOfOccupiedRooms = totalNoOfOccupiedRooms + occupied;
        }
        System.out.println("Total no of rooms = "+totalNoOfRooms);
        System.out.println("Total no of occupied rooms = " + totalNoOfOccupiedRooms);
        System.out.println("Total no of vacant rooms = " + (totalNoOfRooms-totalNoOfOccupiedRooms));
        System.out.println("Occupancy rate = "+ totalNoOfOccupiedRooms/totalNoOfRooms);
    }
    public static void solutionNo8(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of years");
        int years = scanner.nextInt();
        int months = 12;
        int totalRainfall = 0;
        while (years < 1){
            System.out.println("Please enter valid number of years");
            System.out.println("Please enter the number of years");
            years = scanner.nextInt();
        }
        for (int i = 1; i <= years; i++) {

            for (int j = 0; j < months; j++) {
                System.out.println("Please enter the inches of rainfall this month");
                int rainfall = scanner.nextInt();
                while (rainfall < 0){
                    System.out.println("Please enter a valid value");
                    System.out.println("Please enter the inches of rainfall this month");
                    rainfall = scanner.nextInt();
                }
                totalRainfall = totalRainfall + rainfall;
            }
        }
        System.out.println("Total no of months are " + months *years );
        System.out.println("Total inches of rainfall is "+ totalRainfall);
        System.out.println("Average inches of rainfall per month is "+ totalRainfall /(months * years));
    }
    public static void solutionNo9(){
        Scanner scanner = new Scanner(System.in);
        double population = 0;
        System.out.println("Please enter the starting no of the organisms");
        double organisms = scanner.nextDouble();
        while (organisms < 2){
            System.out.println("PLease enter a minimum of 2 starting organisms");
            System.out.println("Please enter the starting no of the organisms");
            organisms = scanner.nextDouble();
        }
        System.out.println("Please enter the daily percentage of population Increase");
        double dailyPopulationIncrease = scanner.nextDouble();
        while (dailyPopulationIncrease < 0){
            System.out.println("Please enter a valid value");
            System.out.println("Please enter the daily percentage of population Increase");
            dailyPopulationIncrease = scanner.nextDouble();
        }
        System.out.println("Please enter the number of days they will multiply");
        int days = scanner.nextInt();
        while (days < 1){
            System.out.println("Please enter valid no of days");
            System.out.println("Please enter the number of days they will multiply");
            days = scanner.nextInt();
        }
        for (int i = 1; i <= days; i++) {
            population = organisms * (i * dailyPopulationIncrease/100);
            System.out.println("The size of population on day "+ i + " is "+ population);
        }
    }
    public static void solutionNo10(){
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        int smallest = 0;
        int value = 0;
        while (value != -99){

            System.out.println("Please enter a number. Enter -99 to end");
            value = scanner.nextInt();
            if (value == -99){
                break;
            }else
            if (value > largest){
                largest = value;
            } else if (value < smallest) {
                smallest = value;
            }
        }
        System.out.println("The largest value is " + largest);
        System.out.println("The smallest value is " + smallest);
    }
    public static void solutionNo11(){
        for (int i = 0; i <= 20; i++) {
            System.out.println(i+ " Degree = " + ((9/5) * i + 32) + " Fahrenheit");
        }
    }
    public static void solutionNo12(){
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
        for (int i = 0; i < 1; i++) {

            System.out.println("Store 1 : ");
            for (int j = 0; j < store1/100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Store 2 : ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < store2/100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Store 3 : ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < store3/100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Store 4 : ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < store4/100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Store 5 : ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < store5/100; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solutionNo16(){
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
        if (total < budget){
            System.out.println("You are under budget");
        }
        else if (total > budget){
            System.out.println("You are over budget");
        }
    }
    public static void solutionNo17(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game.\n The computer has randomly selected a number between 1 and 100");
        System.out.println("Take a guess until you succeed");
        int input = scanner.nextInt();
        int random = (int) (Math.random() * (100 - 1) + 1);
        while(input != random){
            if (input < random){
                System.out.println("Too low try again");
                input = scanner.nextInt();
            } else if (input > random) {
                System.out.println("Too high try again");
                input = scanner.nextInt();
            }
        }
        if (input == random){
            System.out.println("Congratulations you got it");
        }
    }
    public static void solutionNo18(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to the number guessing game.\n The computer has randomly selected a number between 1 and 100");
        System.out.println(" Take a guess until you succeed");
        int input = scanner.nextInt();
        int random = (int) (Math.random() * (100 - 1) + 1);
        int i = 0;
        while(input != random){
            if (input < random){
                System.out.println("Too low try again");
                input = scanner.nextInt();
            } else if (input > random) {
                System.out.println("Too high try again");
                input = scanner.nextInt();
            }
            i++;
        }
        if (input == random){
            System.out.println("Congratulations you got it");
            System.out.println("You took "+ (i + 1) + " tries");
        }
    }
    public static void solutionNo19(){

    }
    public static void solutionNo20() {
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
    public static void solutionNo21(){
        System.out.println("The Dice Game");
        int player = 0;
        int computer = 0;
        for (int i = 0; i < 10; i++) {
            
            int computersDice = (int) (Math.random() * (6 - 1) + 1);
            int playersDice = (int) (Math.random() * (6 - 1) + 1);
            System.out.println("Computer's Dice = " + computersDice);
            System.out.println("Player's Dice = "+ playersDice);
            if (computersDice > playersDice){
                System.out.println("Computer won!");
                computer++;
            } else if (playersDice > computersDice) {
                System.out.println("Player won!");
                player++;
            }
            else {
                System.out.println("It's a tie");
            }
        }
        System.out.println("The grand winner is ");
        if (player > computer){
            System.out.println("Player");
        } else if (computer > player) {
            System.out.println("Computer");
        }
    }
    public static void solutionNo22(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of money you want to enter in the slot machine");
        int money = scanner.nextInt();
        int spin1 = (int) (Math.random() * (5) + 0);
        int spin2 = (int) (Math.random() * (5) + 1);
        int spin3 = (int) (Math.random() * (5) + 1);
        int winnings = 0;
        //Cherries, Oranges, Plums, Bells, Melons, Bars
        if (spin1 == 0 ){
            System.out.println("Cherries");
        } else if (spin1 == 1 ){
            System.out.println("Oranges");
        }else if (spin1 == 2 ){
            System.out.println("Plums");
        }else if (spin1 == 3 ){
            System.out.println("Bells");
        }else if (spin1 == 4 ){
            System.out.println("Melons");
        }else if (spin1 == 5 ){
            System.out.println("Bars");
        }
        if (spin2 == 0 ){
            System.out.println("Cherries");
        } else if (spin2 == 1 ){
            System.out.println("Oranges");
        }else if (spin2 == 2 ){
            System.out.println("Plums");
        }else if (spin2 == 3 ){
            System.out.println("Bells");
        }else if (spin2 == 4 ){
            System.out.println("Melons");
        }else if (spin2 == 5 ){
            System.out.println("Bars");
        }
        if (spin3 == 0 ){
            System.out.println("Cherries");
        } else if (spin3 == 1 ){
            System.out.println("Oranges");
        }else if (spin3 == 2 ){
            System.out.println("Plums");
        }else if (spin3 == 3 ){
            System.out.println("Bells");
        }else if (spin3 == 4 ){
            System.out.println("Melons");
        }else if (spin3 == 5 ){
            System.out.println("Bars");
        }
        if (spin1 == spin2 && spin2 == spin3){
            winnings = winnings + (money * 3);
            System.out.println("You won " + money * 3);
        } else if (spin1 == spin2 || spin1 == spin3 || spin2 == spin3){
            winnings = winnings + (money * 2);
            System.out.println("You won " + money * 2);
        }else {
            winnings = winnings;
        }
        System.out.println("Enter y if you want to play again or enter n to end");
        Character decision = scanner.next().charAt(0);
        if (decision == 'y'){
         solutionNo22();
        }else {
            System.out.println("Your total winnings are " + winnings);
        }

    }

    public static void main(String[] args) {
        solutionNo22();
    }
}
