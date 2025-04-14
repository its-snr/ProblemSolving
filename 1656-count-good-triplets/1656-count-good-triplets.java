class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int size=arr.length;
        int count=0;

        for(int i=0;i<size-2;i++){
            for(int j=i+1;j<size-1;j++){
                for(int k=j+1;k<size;k++){

                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c){
                        count++;    
                    }   
                }
            }
        }
        return count;
    }
}