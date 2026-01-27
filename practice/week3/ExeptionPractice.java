package practice.week3;

import java.util.Scanner;


public class ExeptionPractice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        
        try {
            int number = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid Number!");
        }
        System.out.println("Program Down Goodbye!");
    }

    public static int inputNumber(){
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while(true)try {
            number = sc.nextInt();
            return number;
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("Invalid Try Again!");
            System.out.println("Enter a Number: ");
        }
    }
}
