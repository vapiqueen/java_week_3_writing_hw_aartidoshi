package java_week_3_writing_hw_aartidoshi;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

public class Program_7_SalesCommission {


    public static void main(String[] args) {
        //Scanner decalaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Seller ID: ");
        int sellerId = scanner.nextInt();
        System.out.println("Enter Sales Amount : ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic Salary: ");
        int basicSalary = scanner.nextInt();
        //Creating the object to call instance method
        Program_7_SalesCommission salesCommission = new Program_7_SalesCommission();
        int grossSalary =  basicSalary + salesCommission.calculateCommission(salesAmount);
        System.out.println("Seller name is                : " + name);
        System.out.println("Seller id is                  : " + sellerId);
        System.out.println("Seller's sales amount is      : " + salesAmount);
        System.out.println("Seller's basic salary is      : "  + basicSalary);
        System.out.println("Seller's gross salary is      : "  + grossSalary);
        //closing the scanner object
        scanner.close();
    }
    //Calculating the sales commission
    public int calculateCommission(int salesAmount){
        int commission;
        if(salesAmount >= 50000){
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
       } else if(salesAmount >= 30000){
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Comission is " + commission);
        }else if (salesAmount >= 2000){
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales Comission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
        }else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Comission is " + commission);
        }
        return commission;
    }
}
