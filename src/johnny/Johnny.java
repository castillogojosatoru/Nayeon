/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package johnny;
import java.util.Scanner;
/**
 *
 * @author Rhodz
 */
public class Johnny {

    
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
    
    String firstname;
    String middlename;
    String lastname;
  
    // Get first name
    System.out.println("Firstname: "); 
    firstname = myObj.nextLine();  
    
    // Get middle name
    System.out.println("Middlename: "); 
    middlename = myObj.nextLine();  
    
    //Get last name
    System.out.println("Lastname: "); 
    lastname = myObj.nextLine();  
    
    //Capitalize first letter of the word
    String FirstName = firstname.substring(0,1).toUpperCase() + firstname.substring(1);
    
    String MiddleName = middlename.substring(0,1).toUpperCase() + middlename.substring(1);
    
    String LastName = lastname.substring(0,1).toUpperCase() + lastname.substring(1);
    
    // Prints and organizes data
    System.out.println("Your Data: \n" + "First Name: " +FirstName+ "\n" + "Middle Name: "+ MiddleName +"\n"+ "Last Name: "+ LastName);
    
    myObj.close();
    }
    
}
