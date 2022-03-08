import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
    
        substringEndStart(S, start, end);
    }
    
    public static void substringEndStart(String string, int start, int end) {
        String subst = string.substring(start, end);
        
        System.out.println(subst);
    }
}