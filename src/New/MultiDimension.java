package New;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int [3][2]; // r * c.....r mandotary
        System.out.println(arr.length); // no of rows
//        int [][] arr2d = {
//                {1,2,3}, // 0th index
//                {4,5}, // 1st index
//                {6,7,8,9} // 2nd index --> arr
//
//        };
        // input

      for(int row=0;row<arr.length;row++){
          //for each column in each row
          for (int col=0;col<arr[row].length;col++){
              arr[row][col]= in.nextInt();
          }
      }
    }
    // hello world mridul gaur this side ---ssup?
}
