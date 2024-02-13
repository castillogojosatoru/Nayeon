/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gojosatoru;

/**
 *
 * @author Rhodz
 */
public class amboutoblow {
     public static void main(String[] args) {
        
        int[] ambatublowArray = {120, 2, 69420, 100000, 60, 1};
        System.out.println("Array Elements :" + ambatublowArray[0] + ", " + ambatublowArray[1] + ", " + ambatublowArray[2] + ", " + ambatublowArray[3] + ", "
        + ambatublowArray[4] + ", " + ambatublowArray[5]);

        int ambatublowArray_sum = ambatublowArray[0] + ambatublowArray[1] + ambatublowArray[2] + 
                ambatublowArray[3] + ambatublowArray[4] + ambatublowArray[5];

        System.out.println("Sum of All Arrays: " + ambatublowArray_sum);

        int max = Math.max(ambatublowArray[5], Math.max(ambatublowArray[2], Math.max(ambatublowArray[1], Math.max(ambatublowArray[3],
        Math.max(ambatublowArray[5], ambatublowArray[0])))));

        System.out.println("Maximum Value: " + max);

    }
}
