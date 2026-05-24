** in side there we can use substring methos there in side there print ln ** 
//substring(start, end)
  // length = end - start 

// The first line contains a single string denoting .
// The second line contains two space-separated integers denoting the respective values of  and .

// Constraints

// String  consists of English alphabetic letters (i.e., ) only.
// Output Format

// Print the substring in the inclusive range from  to .

// Sample Input

// Helloworld
// 3 7
// Sample Output

// lowo
// Explanation

// In the diagram below, the substring is highlighted in green:

// substring.png


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
        
        System.out.println(S.substring(start, end));
    }
}
