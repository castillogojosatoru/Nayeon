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
       
       double celsius;
       double fahrenheit;
       
        System.out.print("Enter Celsius: ");
        celsius = scn.nextInt();
        
        fahrenheit = (celsius - 32.0) *(5/9.0);
        System.out.println("Celsius: " +celsius+"\n"+"Celsius to Fahrenheit: "+fahrenheit);
    }
    
}
