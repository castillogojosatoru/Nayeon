/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James;
import java.util.Scanner;
/**
 *
 * @author Rhodz
 */
public class Johnny {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter your favorite color:");
        String color = scn.nextLine();
        
        System.out.println("Enter Your First Name:");
        String fName = scn.nextLine();
        
        System.out.println("Enter your Middle Name:");
        String mName = scn.nextLine();
        
        System.out.println("Enter your Last Name:");
        String lName = scn.nextLine();
        
        System.out.println("Enter your Age ");
        int age = scn.nextInt();
        
        System.out.println("Your Data: " + color + " " + fName + " " + mName +" "+ lName + " "+ age);
    
        scn.close();
    }
}
