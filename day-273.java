<<<<<<< HEAD
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            for (int j = 0; j < n; j++)
            {
                res += (int)(Math.pow(2, j) * b);
                System.out.print(res + " ");
            }
            System.out.print('\n');
        }
        in.close();
    }
}
=======
class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int[] pairs = new int[n - 1];
        for (int i = 1; i < n; i++) {
            pairs[i - 1] = weights[i] + weights[i - 1];
        }
        Arrays.sort(pairs);
        long minScore = 0;
        long maxScore = 0;
        for (int i = 0; i < k - 1; i++) {
            minScore += pairs[i];
            maxScore += pairs[n - i - 2];
        }
        return maxScore - minScore;
    }
}
>>>>>>> a814fd9a080a6ee0ca3ccbf3a714c2d72d558f47
