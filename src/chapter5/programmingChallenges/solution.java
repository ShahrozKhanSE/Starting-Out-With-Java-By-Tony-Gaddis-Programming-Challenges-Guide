package src.chapter5.programmingChallenges;

import java.sql.SQLOutput;
import java.util.Scanner;

public class solution {
    public static void solutionNo1(String word,int position){
        if (position < word.length()) {
            System.out.println(word.charAt(position));
        }else{
            System.out.println("Please enter correct position and try again");
        }
    }
    public static double solutionNo2(double wholeSalePrice,double markUpPercentage){
        markUpPercentage = markUpPercentage / 100;
        double retailPrice = wholeSalePrice + (wholeSalePrice * markUpPercentage);
        return retailPrice;

    }
    public static void solutionNo3(double length,double width){

        double area = length * width;
        System.out.println("The length of the triangle is " + length);
        System.out.println("The width of the triangle is " + width);
        System.out.println("The total area of the triangle is "+ area);
    }
    public static void solutionNo4 (){
        Scanner scanner = new Scanner(System.in);
        int labourCostPerHour = 18;
        int labourWorkRatePerHour = 115/8;
        System.out.println("Please enter the no of rooms");
        int rooms = scanner.nextInt();
        System.out.println("Please enter the price of paint");
        int price = scanner.nextInt();
        int totalSquareFeet = 0;
        for (int i = 1; i <= rooms; i++) {
            System.out.println("Enter the square feet of wall space in room "+ i);
            int squareFeet = scanner.nextInt();
            totalSquareFeet = totalSquareFeet + squareFeet;
        }
        int totalNoOfGallons = totalSquareFeet/115;
        int totalHoursOfLabour = totalSquareFeet/labourWorkRatePerHour;
        int totalCostOfPaint = totalNoOfGallons*price;
        int totalCostOfLabour = totalHoursOfLabour*labourCostPerHour;
        int grandTotal = totalCostOfLabour + totalCostOfPaint;
        System.out.println("The no of gallons of paint required is " + totalNoOfGallons);
        System.out.println("The hours of labour required is "+ totalHoursOfLabour);
        System.out.println("The cost of paint will be " + totalCostOfPaint);
        System.out.println("The cost of labour will be "+ totalCostOfLabour);
        System.out.println("The total cost of paint job will be "+ grandTotal);
    }
    public static double solutionNo5(int timeInSeconds){
        double distanceInMeters = -1;
        final double gravity = 9.80665;
        if(timeInSeconds >= 0){
            distanceInMeters = 0.5 * gravity * timeInSeconds * timeInSeconds;
        }
        return distanceInMeters;
    }
    public static void solutionNo6(){
        for (int i = 1; i <= 20; i++) {
            int fahrenheit = i;
            double celsius = (fahrenheit - 32) * 5.0/9.0;
            System.out.println(i + " Fahrenheit = " + celsius + " Celsius");
        }
    }
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
        } else{
            return 'F';
        }
    }
    public static void solutionNo7(){
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

    public static void solutionNo8(){

    }
    public static void main(String[] args) {
        solutionNo6();
    }
}
