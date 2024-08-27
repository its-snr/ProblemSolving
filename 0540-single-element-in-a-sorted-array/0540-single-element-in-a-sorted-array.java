class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=1;
        //if(n%2==0)return -1613987200;
        while(i<=n-2 && j<=n-1){
            if(arr[i]!=arr[j]){
                return arr[i];
            }
            i=i+2;
            j+=2;
            
        }
        return arr[i];
        
    }
}