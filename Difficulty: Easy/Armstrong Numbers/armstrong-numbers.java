//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // Store the original number
        int temp = n;
        int sum = 0;

        // Calculate the sum of cubes of its digits
        while (n != 0) {
            int r = n % 10;
            sum += (r * r * r);  // Sum of cubes of each digit
            n /= 10;
        }

        // Compare the sum with the original number
        if (sum == temp) {
            return "true"; // Return "true" if it's an Armstrong number
        } else {
            return "false"; // Return "false" otherwise
        }
    }
}
