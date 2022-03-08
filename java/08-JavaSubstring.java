import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int aLength = A.length();
        int bLength = B.length();
        
        System.out.println(aLength + bLength);
        
        String capA = captalizeFirst(A);
        String capB = captalizeFirst(B);
        isLarger(A, B);
        System.out.println(capA + " " + capB);     
    }
    
    public static void isLarger(String A, String B) {
        int compareA = A.compareTo(B);
        int compareB = B.compareTo(A);
        if (compareA > compareB) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static String captalizeFirst(String string) {
        String capFirstLetter = string.substring(0, 1).toUpperCase() + string.substring(1);
        return capFirstLetter;
    }
}