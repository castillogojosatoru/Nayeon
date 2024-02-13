/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yowaimo;

/**
 *
 * @author Student
 */
public class gojosatoru {
    

    public static void main(String[] args) {
            
//            //Array Sum
//            
//            int[] bisagunsa = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//            
//            System.out.println("Sum of all arrays are: "+bisagunsa[0]+", "+bisagunsa[1]+", "+bisagunsa[2]);
//
//            
//            int bisagunsa_sum = bisagunsa[0] + bisagunsa[1] + bisagunsa[2] + bisagunsa[3] +bisagunsa[4];
//            
//            System.out.println("Sum of all arrays are: " + bisagunsa_sum);

                //Final Maximum Value in Arrays:
                
                int[] bisagunsa = {500, 5, 10, 20, 300, 499};
                
                int max = Math.max(bisagunsa[2], bisagunsa[1]);
                int max1 = Math.max(Math.max(bisagunsa[0], bisagunsa[2]), bisagunsa[1]);
                int max2 = Math.max(bisagunsa[0], Math.max(bisagunsa[2], Math.max(bisagunsa[3], Math.max(bisagunsa[4], bisagunsa[5]))));
                
                System.out.println("Maximum Value: " + max);
                System.out.println("Maximum Value: " +max1);
                System.out.println("Maximum Value: " +max2); 
                
    }
}
