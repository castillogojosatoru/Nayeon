/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Twice;
import java.util.Scanner;
/**
 *
 * @author Rhodz
 */
public class Nayeon {


    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter Last Name: ");
        String lName = scn.nextLine();
        
        System.out.print("Enter First Name: ");
        String fName = scn.nextLine();
        
        System.out.print("Enter Middle Initial: ");
        String mInitial = scn.nextLine();
        
        System.out.print("Enter Age: ");
        int age = scn.nextInt();
        
        scn.nextLine();
        
        System.out.print("Enter Gender: ");
        String gender = scn.nextLine();

        System.out.print("Enter Birth Month: ");
        String birthMonth = scn.nextLine();

        System.out.print("Enter Birth Day: ");
        int birthDay = scn.nextInt();
        
        System.out.print("Enter Birth Year: ");
        int birthYear = scn.nextInt();
        
        System.out.println("Your data:\nLast Name: " + lName + "\nFirst Name: " + fName + "\nMiddle Initial: " + mInitial + "\nAge: " + age
        + "\nGender: " + gender + "\nBirthdate: " + birthMonth + "/" + birthDay + "/" + birthYear);
        
        scn.close();
    }

}
