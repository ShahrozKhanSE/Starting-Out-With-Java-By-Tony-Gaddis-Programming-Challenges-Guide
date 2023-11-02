package src.chapter3.programmingChallenges;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class solution {

    public static void solutionNo1(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        int input = scanner.nextInt();
        if (input >= 1 && input <= 10){
            if (input == 1){
                System.out.println("I");
            }else
            if (input == 2){
                System.out.println("II");
            }else
            if (input == 3){
                System.out.println("III");
            }else
            if (input == 4){
                System.out.println("IV");
            }else
            if (input == 5){
                System.out.println("V");
            }else
            if (input == 6){
                System.out.println("VI");
            }else
            if (input == 7){
                System.out.println("VII");
            }else
            if (input == 8){
                System.out.println("VIII");
            }else
            if (input == 9){
                System.out.println("IX");
            }else
            if (input == 10){
                System.out.println("X");
            }
        }
        else {
            System.out.println("Value out of range.");
        }

    }

    public static void solutionNo2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a date");
        int date = scanner.nextInt();
        System.out.println("Please enter a month in numbers");
        int month = scanner.nextInt();
        System.out.println("Please enter a years last two digits");
        int year = scanner.nextInt();

        if (date * month == year){
            System.out.println("The date is magical");
        }
        else {
            System.out.println("The date is not magical");
        }
    }
    public static void solutionNo3(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight in pounds.");
        double weight = scanner.nextDouble();
        System.out.println("Please enter your height in inches");
        double height = scanner.nextByte();
        double BMI = weight * 707 / (height * height);
        System.out.println("Your BMI is " + BMI);
        if (BMI < 18.5){
            System.out.println("You are underweight");
        }else
        if (BMI <= 25){
            System.out.println("Your weight is optimal");
        }
        else {
            System.out.println("You are overweight");
        }
    }
    public static void solutionNo4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 test scores out of 100");
        double testNo1 = scanner.nextDouble();
        double testNo2 = scanner.nextDouble();
        double testNo3 = scanner.nextDouble();
        double average = (testNo1 + testNo2 + testNo3) / 300 * 100;
        System.out.println("Your average score is " + average);
        if (average >= 90){
            System.out.println("Your grade is A");
        } else if (average >= 80 && average <= 89){
            System.out.println("Your grade is B");
        } else if (average >= 70 && average <= 79){
            System.out.println("Your grade is C");
        }else
        if (average >= 60 && average <= 69){
            System.out.println("Your grade is D");
        }else
        if (average < 60){
            System.out.println("Your grade is F");
        }
    }
    public static void solutionNo5 (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the mass in KGs");
        double mass = scanner.nextDouble();
        double weight = mass * 9.8;
        System.out.println("The weight of the object is " + weight+ " Newtons.");
        if (weight < 10){
            System.out.println("The object is too light");
        }
        else if (weight > 1000){
            System.out.println("The object is too heavy");
        }
    }
    public static void solutionNo6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the time in seconds");
        int time = scanner.nextInt();
        int minutes = (time/60)%60;
        int hours = (time/3600)%24;
        int days = (time/86400);

        if (time < 60){
            System.out.println("The time is " + time + " seconds");
        }else
        if (time >= 60 && time < 3600){
            System.out.println("The time is " + minutes + " minutes");
        }else
        if (time >=3600 && time < 86400){
            System.out.println("The time is " + hours + " hours and " + minutes + " minutes");
        }else
        if (time >= 86400){
            System.out.println("The time is " + days + " days " + hours + " hours and " + minutes + " minutes");
        }
    }
    public static void solutionNo7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three names");
        String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();
        String first = "";
        String second = "";
        String third = "";
        System.out.println("The names in ascending order are :");
        if (name1.charAt(0) < name2.charAt(0)){
            first = name1;
            second = name2;
        }
        else {
            first = name2;
            second = name1;
        }

        if (name3.charAt(0) < first.charAt(0)){
            first = name3;
            third = name1;
        }
        else if (third.charAt(0) < second.charAt(0)){
            String temp = second;
            second = third;
            third = temp;
        }
        else{
            third = name3;
        }
        System.out.println(first+"\n"+second+"\n"+third);
    }
    public static void solutionNo8(){
        Scanner scanner = new Scanner(System.in);
        double packagePrice = 99;
        System.out.println("PLease enter the number of packages purchased");
        int numberOfPackages = scanner.nextInt();
        double discountedAmount = 0;
        double totalPrice = numberOfPackages * packagePrice;
        if (numberOfPackages >= 10 && numberOfPackages <= 19){
            System.out.println("Price before discount = " + totalPrice);
            System.out.println("Discount percentage = 20%");
            discountedAmount = totalPrice * 0.20;
            System.out.println("Amount of discount =" + discountedAmount);
            System.out.println("Total Price after discount = " + (totalPrice - discountedAmount));
        }else
        if (numberOfPackages >= 20 && numberOfPackages <= 49){
            System.out.println("Price before discount = " + totalPrice);
            System.out.println("Discount percentage = 20%");
            discountedAmount = totalPrice * 0.30;
            System.out.println("Amount of discount =" + discountedAmount);
            System.out.println("Total Price after discount = " + (totalPrice - discountedAmount));
        }else
        if (numberOfPackages >= 50 && numberOfPackages <= 99){
            System.out.println("Price before discount = " + totalPrice);
            System.out.println("Discount percentage = 20%");
            discountedAmount = totalPrice * 0.40;
            System.out.println("Amount of discount =" + discountedAmount);
            System.out.println("Total Price after discount = " + (totalPrice - discountedAmount));
        }else
        if (numberOfPackages >= 100){
            System.out.println("Price before discount = " + totalPrice);
            System.out.println("Discount percentage = 20%");
            discountedAmount = totalPrice * 0.50;
            System.out.println("Amount of discount =" + discountedAmount);
            System.out.println("Total Price after discount = " + (totalPrice - discountedAmount));
        }
        else {
            System.out.println("Total Amount = "+ totalPrice);
        }
    }
    public static void solutionNo9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the weight of the package in pounds");
        double weight = scanner.nextDouble();
        if (weight <= 2){
            System.out.println("Your shipping charges are 1.10$");
        }else
        if (weight > 2 && weight <= 6){
            System.out.println("Your shipping charges are 2.20$");
        }else
        if (weight > 6 && weight <= 10){
            System.out.println("Your shipping charges are 3.70$");
        }else
        if (weight > 10){
            System.out.println("Your shipping charges are 3.80$");
        }
    }
    public static void solutionNo10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no of calories in the food");
        double calories = scanner.nextDouble();
        System.out.println("Please enter the no of fat grams in the food");
        double fatGrams = scanner.nextDouble();
        double caloriesFromFat = fatGrams * 9;
        double caloriesPercentage = caloriesFromFat/calories;
        if (caloriesFromFat > calories){
            System.out.println("Please enter valid input");
        } else if (caloriesPercentage < 30){
                System.out.println("The calories percentage in your food is " + caloriesPercentage + "%");
                System.out.println("The food is low in fat");
        }

    }
    public static void solutionNo11(){
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
        if (time1 < time2){
            first = name1;
            second = name2;
        }
        else {
            first = name2;
            second = name1;
        }
        if (time3 < time1){
            String temp = first;
            first = name3;
            third = temp;
        }
        else if (time3 < time2){
            String temp = second;
            second = third;
            third = temp;
        }
        else{
            third = name3;
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
    public static void solutionNo12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the medium you want to know the speed of light in air, water or steel");
        String medium = scanner.next();
        System.out.println("Please enter the distance");
        double distance = scanner.nextDouble();
        double time = 0;
        String medium1 = "air";
        String medium2 = "water";
        String medium3 = "steel";

        if (Objects.equals(medium, medium1)){
            time = distance/1100;
            System.out.println("The time taken = "+time+ "seconds");
        }else
        if (Objects.equals(medium, medium2)){
            time = distance / 4900;
            System.out.println("The time taken = "+time+ "seconds");
        }else
        if (Objects.equals(medium, medium3)){
            time = distance / 16400;
            System.out.println("The time taken = "+time+ "seconds");
        }
    }
    public static void solutionNo13(){
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
        if (Objects.equals(internetPackage, package1)){
            if (hours > 10){
                additionalHours = hours - 10;
                totalBill = packageACharges + (additionalHours * packageAAdditionalCharges);
                System.out.println("Total Charges = " + totalBill+ "$");
            }
            else {
                System.out.println("Total Charges = " + packageACharges+ "$");
            }

        }else
        if (Objects.equals(internetPackage, package2)){
            if (hours > 20){
                additionalHours = hours - 20;
                totalBill = packageBCharges + (additionalHours * packageBAdditionalCharges);
                System.out.println("Total Charges = " + totalBill+ "$");
            }
            else {
                System.out.println("Total Charges = " + packageBCharges+ "$");
            }

        }else
        if (Objects.equals(internetPackage, package3 )){
            System.out.println("Total Charges = " + packageCCharges+ "$");
        }
    }

    public static void solutionNo14(){

    }

    public static void solutionNo15(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no of checks written this month");
        int noOfChecks = scanner.nextInt();
        double totalCharges = 10;
        if (noOfChecks < 20){
            totalCharges = totalCharges + (.10 * noOfChecks);
            System.out.println("Total Service Fees = " + totalCharges +"$" );
        }
        else if (noOfChecks >= 20 && noOfChecks < 40){
            totalCharges = totalCharges + (.08 * noOfChecks);
            System.out.println("Total Service Fees = " + totalCharges +"$" );
        }
        else if (noOfChecks >= 40 && noOfChecks < 60){
            totalCharges = totalCharges + (.06 * noOfChecks);
            System.out.println("Total Service Fees = " + totalCharges +"$" );
        }
        else {
            totalCharges = totalCharges + (.04 * noOfChecks);
            System.out.println("Total Service Fees = " + totalCharges +"$" );
        }
    }
    public static void solutionNo16(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the no of books purchased this month");
        int noOfBooks = scanner.nextInt();
        if (noOfBooks == 0){
            System.out.println("You have earned 0 points" );
        }
        else if (noOfBooks == 1){
            System.out.println("You have earned 5 points" );
        }
        else if (noOfBooks == 2){
            System.out.println("You have earned 15 points" );
        }
        else if (noOfBooks == 3){
            System.out.println("You have earned 30 points" );
        }
        else {
            System.out.println("You have earned 60 points " );
        }
    }


    public static void main(String[] args) {

        solutionNo15();

        // Java
        // SQL
        // HTML CSS WEB
        // Selenium framework
        // Angular Framework
        // Spring boot / API
    }
}
