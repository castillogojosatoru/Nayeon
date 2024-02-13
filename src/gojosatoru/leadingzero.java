/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gojosatoru;
import java.util.Scanner;
/**
 *
 * @author Rhodz
 */
public class leadingzero {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number with a leading zero: ");
        String input = scanner.next();

        // Remove leading zeros if any (to avoid octal interpretation)
        input = input.replaceFirst("^0+", "");

        // Parse the string as an integer
        int number = Integer.parseInt(input);

        System.out.println("Number entered: " + number);
    }
}
