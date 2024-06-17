<<<<<<< HEAD
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum = A.length() + B.length();
        System.out.println(sum);
        int a = A.compareTo(B);
        if(a>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String A1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String B1 = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A1 + " " + B1);
        }
        
    }



=======
    static boolean isAnagram(String a, String b) {
       
        a=a.toUpperCase();
        b=b.toUpperCase();
        boolean ret = false;
        StringBuilder c= new StringBuilder(b);

        if(a.length()==b.length()){
            for(int i=0; i<a.length();i++){
                for(int j=0; j<c.length();j++){
                    if(a.charAt(i)==c.charAt(j)){
                            c.deleteCharAt(j);
                        if(i==a.length()-1 && c.length()==0){
                            ret=true;
                            break;
                        }
                        break;

                    }

                }
            }
        }return ret;
   
   }
>>>>>>> a814fd9a080a6ee0ca3ccbf3a714c2d72d558f47

