//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
        // code here
         int n=arr.length,low=0,mid=0,high=n-1,firstIndex=-1,lastIndex=-1;
        for(int i=0;i<2;i++){
            low=0;
            high=n-1;
            while(low<=high){
                mid=(low+high)/2;
                if(arr[mid]==target){
                    if(i==0){
                        firstIndex=mid;
                        high=mid-1;
                    }
                    else{
                        lastIndex=mid;
                        low=mid+1;
                    }
                }
                else if(arr[mid]>target)high=mid-1;
                else low=mid+1;
            }
        }
        if(firstIndex==-1)return 0;
        return lastIndex-firstIndex+1;
    }
}
