class Solution {
    public boolean isPowerOfTwo(int n) {

        int t=n;
        while(t%2==0 && t>1){
            t=t/2;
        }
        if(t==1)return true;
        else return false;
        
    }
}