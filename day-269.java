<<<<<<< HEAD
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(scan.hasNextLine()){
            System.out.println(i + " " + scan.nextLine());
            i++;
        }
    }
}
=======
class Solution {
    public double myPow(double x, int n) {
        return myPowHelper(x, n);
    }
    
    private double myPowHelper(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        
        double res = myPowHelper(x, n / 2);
        res *= res;
        if (n % 2 != 0) {
            return (n > 0) ? res * x : res / x;
        } else {
            return res;
        }
    }
}
>>>>>>> a814fd9a080a6ee0ca3ccbf3a714c2d72d558f47
