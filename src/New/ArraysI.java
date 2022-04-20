package New;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // arrays of premitives
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
//        for(int num: arr){ // for every element in array, print the element
//            System.out.println(num + " "); // here num represents elements of the array
//        }
        System.out.println(Arrays.toString(arr));// another way to print arrray elements
        // arrays of objects
        String[] str = new String[4];
        for (int i=0;i< str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
