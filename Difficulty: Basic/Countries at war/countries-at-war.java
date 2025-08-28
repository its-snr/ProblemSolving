// User function Template for Java

class Solution {
    public String countryAtWar(int[] arr1, int[] arr2) {
        //  code here
        int Acount=0;
        int Bcount=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>arr2[i]){
                Acount++;
            }
            else if(arr1[i]<arr2[i]){
                Bcount++;
            }
        }
        return Acount==Bcount?"DRAW":Acount>Bcount?"A":"B";
        
    }
}