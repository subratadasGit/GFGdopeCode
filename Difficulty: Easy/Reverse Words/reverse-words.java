//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
          StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                temp.reverse();
                temp.append('.');
                ans.append(temp);
                temp=new StringBuilder();
            }
            else if(i==str.length()-1){
                temp.append(str.charAt(i));
                temp.reverse();
                ans.append(temp);
            }
            else temp.append(str.charAt(i));
        }
        ans.reverse();
        return ans.toString();
    }
}