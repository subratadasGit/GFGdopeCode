//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public int minimizeCost(int k, int[] arr) {
        int n = arr.length;
        // DP array to store minimum cost to reach each stone
        int[] dp = new int[n];
        
        // Initialize dp array with maximum value
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Base case: cost to reach the first stone is 0
        dp[0] = 0;
        
        // Iterate through each stone
        for (int i = 0; i < n; i++) {
            // Check the possible jumps from stone i to stone j (i+1 to i+k)
            for (int j = i + 1; j <= i + k && j < n; j++) {
                dp[j] = Math.min(dp[j], dp[i] + Math.abs(arr[i] - arr[j]));
            }
        }

        // Return the minimum cost to reach the last stone
        return dp[n - 1];
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minimizeCost(k, arr);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends