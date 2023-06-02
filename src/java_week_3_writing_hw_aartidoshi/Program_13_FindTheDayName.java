package java_week_3_writing_hw_aartidoshi;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Program_13_FindTheDayName {
    public static void main(String[] args) {
        //Scanner decalration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 1 and 7 : ");
        int day = scanner.nextInt();
        findTheDaysName(day);
        //Closing the scanner object
        scanner.close();
    }
    //Finding the name of the day
    public static void findTheDaysName(int day){
        switch (day){
            case 1:
                System.out.println("Its Monday");
                break;
            case  2 :
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}
