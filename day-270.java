<<<<<<< HEAD
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else {
                if (n >= 2 && n <= 5) {
                    ans = "Not Weird";
                } else if (n >= 6 && n <= 20) {
                    ans = "Weird";
                } else {
                    ans = "Not Weird";
                }
            
               //Complete the code
                
            }
            System.out.println(ans);
            
        }
    }
=======
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int n = arr.length;
        while (i <= j) {
            int mid = (i + j) / 2;
            if ((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == n - 1 || arr[mid + 1] < arr[mid]))
                return mid;
            else if (mid > 0 && arr[mid - 1] > arr[mid])
                j = mid - 1;
            else
                i = mid + 1;
        }
        return -1;
    }
}
>>>>>>> a814fd9a080a6ee0ca3ccbf3a714c2d72d558f47
