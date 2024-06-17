<<<<<<< HEAD
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }
}
=======
public class Solution {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long left = 1, right = (long)Arrays.stream(batteries).asLongStream().sum() / n;
        while (left < right) {
            long target = right - (right - left) / 2;
            long total = Arrays.stream(batteries).asLongStream().map(battery -> Math.min(battery, target)).sum();
            if (total >= target * n) {
                left = target;
            } else {
                right = target - 1;
            }
        }
        return left;
    }
}
>>>>>>> a814fd9a080a6ee0ca3ccbf3a714c2d72d558f47
