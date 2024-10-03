//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String part : parts) {
                nums.add(Integer.parseInt(part));
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        
        List<Integer>ans=new ArrayList<Integer>();
        int n=nums.size();
       // System.out.println(n);
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            //System.out.println(nums.get(i));
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
            
        }
        map.forEach((k,v)->{
            if(v>n/3){
                ans.add(k);
            }
            
        });
        if( ans.size()==0){
            ans.add(-1);
        }
        return ans;
        // Your code goes here.
    }
}
