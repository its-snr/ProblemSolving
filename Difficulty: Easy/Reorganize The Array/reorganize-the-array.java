//{ Driver Code Starts
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// } Driver Code Ends

class Solution {
   
    public List<Integer> rearrange(List<Integer> arr) {
        
       int size = arr.size();
        // initialising ans list with -1 and a size of arr
        // remember to import java.util.Collections
        List<Integer> list = new ArrayList<>(java.util.Collections.nCopies(size, -1));
        for(int i = 0;i<size;i++){
            // check if it is in boundary or not
            if (arr.get(i) >= 0 && arr.get(i) < size) {
                // set the index arr[i] to arr[i] as this is asked us to do
                list.set(arr.get(i), arr.get(i)); 
            }
        }
        // returning ans;
        return list;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Solution solution = new Solution();

        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("\\s+");
            List<Integer> arr = new ArrayList<>();
            for (String s : inputArr) {
                arr.add(Integer.parseInt(s));
            }

            List<Integer> ans = solution.rearrange(arr);

            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
// } Driver Code Ends