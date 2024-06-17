import java.util.*;
<<<<<<< HEAD
import java.io.*;
class Solution{
    public static void main(String []argh)
    {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=scan.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-Math.pow(2,63) && x<=(Math.pow(2,63)-1))System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(scan.next()+" can't be fitted anywhere.");
            }
        }
    }
}
=======

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Deque<Integer> stk = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            if (stk.isEmpty() || asteroids[i] > 0) {
                stk.push(asteroids[i]);
            } else {
                while (!stk.isEmpty() && stk.peek() > 0 && stk.peek() < Math.abs(asteroids[i])) {
                    stk.pop();
                }

                if (!stk.isEmpty() && stk.peek() == Math.abs(asteroids[i])) {
                    stk.pop();
                } else {
                    if (stk.isEmpty() || stk.peek() < 0) {
                        stk.push(asteroids[i]);
                    }
                } 
            }
        }
        
        int[] ans = new int[stk.size()];
        int size = stk.size();
        while (!stk.isEmpty()) {
            ans[--size] = stk.pop();
        }
        
        return ans;
    }
}
>>>>>>> a814fd9a080a6ee0ca3ccbf3a714c2d72d558f47
