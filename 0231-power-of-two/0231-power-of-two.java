class Solution {
    public boolean isPowerOfTwo(int n) {

        // int t=n;
        // while(t%2==0 && t>1){
        //     t=t/2;
        // }
        // if(t==1)return true;
        // else return false;
       // return recursive(n);
      
	    return n < 1 ? false : (n & (n - 1)) == 0 ? true : false;    
    }
    public boolean recursive(int n){
        if(n%2!=0 && n!=1)return false;
        else if(n==1)return true;
        else return recursive(n/2);
        
    }
}