//package com.company;
import java.util.Scanner;    //for taking input from user

public class TakingInputs {
    public static void main(String[] args) {
        System.out.println("*****Taking Input From the User*****");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        //int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2:");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        //int sum = a + b;
        float sum = a + b;
        System.out.println("The sum of these numbers is ");
        System.out.println(sum);

//        boolean b1 = sc.hasNextInt();  //It will check that the input is int or not
//        System.out.println(b1);
//        String str = sc.next();  //It will consider only first word
//        String str = sc.nextLine();   //It will consider whole line
//        System.out.println(str);

    }
}
