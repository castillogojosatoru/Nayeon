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
public class Yowaimo {


    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter First name: " );
        String fName = scn.nextLine();
        
        System.out.println("Enter Middle initial: " );
        String mInitial = scn.nextLine();
        
        System.out.println("Enter Last name: " );
        String lName = scn.nextLine();
        
        System.out.println("Your data: " +fName +" "+mInitial+" "+lName+" ");
        
        System.out.println("Enter your favorite color: " );
        String color = scn.nextLine();
        
        System.out.println("Enter age: " );
        int age = scn.nextInt();
        
        System.out.println("Your favorite color & age: " +color+" "+age+" ");
        
        scn.close();
    }
}