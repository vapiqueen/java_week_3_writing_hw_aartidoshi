package java_week_3_writing_hw_aartidoshi;

import java.util.Scanner;

/**
 *  Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */

public class Program_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        //Scanner decalration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        isItOddorEvenNumber(number);
        //closing the scanner object
        scanner.close();
    }
    //Checking the number is even or odd
    public static void isItOddorEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The" + number + " is " + evenOrOdd + " number ");
    }
}
