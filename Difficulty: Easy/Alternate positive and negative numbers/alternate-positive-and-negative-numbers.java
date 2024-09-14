//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends



class Solution {
    public void rearrange(ArrayList<Integer> arr) {
        
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

       
        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

    
        int i = 0, j = 0;
        while (i < pos.size() && j < neg.size()) {
            ans.add(pos.get(i++));  
            ans.add(neg.get(j++));  
        }

      
        while (i < pos.size()) {
            ans.add(pos.get(i++));
        }

        while (j < neg.size()) {
            ans.add(neg.get(j++));
        }

       
        arr.clear();
        arr.addAll(ans);
    }
}


