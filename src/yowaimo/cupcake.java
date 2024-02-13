/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yowaimo;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class cupcake {

    public static void main(String[] args) {
      
//        int Num1 = 5;
//        int Num2  = 10;
//        int C;
//        C = Num1 + Num2;
//        
//        System.out.println("Sum of two numbers:\n" + C);
//        
Scanner scn = new Scanner(System.in);
//
//        System.out.println("Enter first number: ");
//        int number1 = scn.nextInt();
//        
//        System.out.println("Enter second number: ");
//        int number2 = scn.nextInt();
//        
//        int C = number1 + number2;
//        
//        System.out.println("Result: " + C);
//        
//        
    
//int r;
//double area;
//
//        System.out.println("Input radius: ");
//        r = scn.nextInt();
//
//        area = Math.PI*(r*r);
//        System.out.println("Area: " + area);

 int fahrenheit;
 double celsius;
 
        System.out.println("Input Fahrenheit: ");
        fahrenheit = scn.nextInt();
        
        celsius = (((fahrenheit - 32.0)*  5/ 9.0));
        System.out.println(fahrenheit + " degree Fahrenheit is equalt to " + celsius+" in Celsius.");
    }
}
