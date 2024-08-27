//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findMaxDiff(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    public int findMaxDiff(int[] arr) {
        
        int n=arr.length;
        int[] leftArray=new int[n];
        int[] rightArray=new int[n];
        leftArray[0]=0;
        rightArray[n-1]=0;
        int max=0;
        int ans=0;
        for(int i=1;i<n;i++){
            int j=i-1;
            if(arr[i]>arr[i-1]){
                leftArray[i]=arr[i-1];
            }
            else if(j>=0){
                while(j>=0){
                    if(arr[i]>arr[j]){
                leftArray[i]=arr[j];
                break;
                    }
                
                j--;
            } 
                }
            
            else leftArray[i]=0;
            
        }
        for(int i=n-2;i>=0;i--){
            int j=i+1;
            if(arr[i]>arr[i+1]){
                rightArray[i]=arr[i+1];
               
            }
            else if(j<=n-1){
                while(j<=n-1){
                    if(arr[i]>arr[j]){
                rightArray[i]=arr[j];
                break;
                }
             j++;
                }
            }
            else rightArray[i]=0;
        }
        for(int i=0;i<n;i++){
            // System.out.print(leftArray[i]);
            // System.out.println(rightArray[i]);
            max=Math.abs(leftArray[i]-rightArray[i]);
            ans=Math.max(max,ans);
        }
        return ans;
    }
}
