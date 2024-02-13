/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Twice;
import java.util.Scanner;
/**
 *
 * @author Rhodz
 */
public class Jihyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scn = new Scanner(System.in);
       
       int fahrenheit;
       double celsius;
       
        System.out.print("Enter Fahrenheit: ");
        fahrenheit = scn.nextInt();
        
        celsius = (fahrenheit - 32.0) *(5/9.0);
        System.out.println("Fahrenheit: " +fahrenheit+"\n"+"Fahrenheit to Celsius: "+celsius);
    }
    
}
