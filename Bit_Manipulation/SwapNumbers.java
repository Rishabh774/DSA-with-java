package Bit_Manipulation;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numbers before swapping :");
        System.out.print("Enter first number :");
        int num1= sc.nextInt();
        System.out.print("Enter second  number :");
        int num2 = sc.nextInt();
        num1 =num1^num2;
        num2= num1^num2;
        num1= num1^num2;
        System.out.println("After swapping ");
        System.out.println("First number :"+ num1);
        System.out.print("Second number :"+ num2);

    }
}
