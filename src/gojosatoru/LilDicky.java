/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gojosatoru;

/**
 *
 * @author Rhodz
 */
public class LilDicky {
    
    public static void main(String[] args) {
        
        int[] djkhaled = {10, 666, 2, 6, 69};
        
        System.out.println("Array Elements: " + djkhaled[0] + ", " + djkhaled[1] +
                ", " + djkhaled[2] + ", " + djkhaled[3] + ", " + djkhaled[4]);
        
        int djkhaled_sum = djkhaled[0] + djkhaled[1] + djkhaled[2] + djkhaled[3] + djkhaled[4];
        
        System.out.println("Sum of all arrays: "+djkhaled_sum);
        
        int max = Math.max(djkhaled[4], Math.max(djkhaled[2], Math.max(djkhaled[1], Math.max(djkhaled[3], djkhaled[0]))));
        
        System.out.println("Maximum Value: " + max);
    }
}
