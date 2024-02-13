/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package James;
import java.util.Arrays;
/**
 *
 * @author Rhodz
 */
public class Array {
    public static void main(String[] args) {
        int[] array = {20, 30, 60, 945, 50};

        System.out.println("Elements of the array:");
        System.out.println("First array element: " + array[0]); 
        System.out.println("Second array element: " + array[1]);
        System.out.println("Third array element: " + array[2]);
        System.out.println("Fourth array element: " + array[3]);
        System.out.println("Fifth array element: " + array[4]);

        int sum = Arrays.stream(array).sum();
        
        System.out.println("Sum of the array elements: " + sum);

        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Maximum value in the array: " + max);
    }
}

