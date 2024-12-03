//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
        static int[] computeLPS(String newStr){
        int N = newStr.length();
        int j = 0;
        int i = 1;
        int[] lps = new int[N];
        lps[0] = 0;
        while(i < N){
            if(newStr.charAt(i) == newStr.charAt(j)){
                lps[i] = j + 1;
                ++i;
                ++j;
            }
            else{
                if(j != 0){
                    j = lps[j - 1];
                }   
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
        
    }


    public static int minChar(String s) {
        // Write your code here
         
        String rev = new StringBuilder(s).reverse().toString();
        String newStr =  s + "$" + rev;
        int[] lps = computeLPS(newStr);
        int N = newStr.length();
        return s.length() - lps[N - 1];
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        var sc = new FastReader();
        int test = sc.nextInt();
        while (test-- > 0) {
            String s = sc.nextString();
            System.out.println(Solution.minChar(s));

            System.out.println("~");
        }
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        private void read() throws IOException {
            st = new StringTokenizer(br.readLine());
        }

        public String nextString() throws IOException {
            while (!st.hasMoreTokens()) read();
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(nextString());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(nextString());
        }
    }
}
// } Driver Code Ends