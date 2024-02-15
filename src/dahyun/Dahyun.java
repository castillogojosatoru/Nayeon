/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dahyun;

/**
 *
 * @author Rhodz
 */
public class Dahyun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] practice = {10, 99, 99999, 414231, 20};
        
        System.out.println("Array Elements: " + practice[0] + ", " + practice[1] + ", " + practice[2] 
                + ", " + practice[3] + ", " + practice[4]);
        
        int practice_sum = practice[0] + practice[1] + practice[2] + practice[3] + practice[4];
        System.out.println("Sum of all arrays: " + practice_sum);
        
        int max = Math.max(practice[2], Math.max(practice[1], Math.max(practice[4], Math.max(practice[3], practice[0]))));
        System.out.println("Maximum Value: " + max);
        
    }
    
}
