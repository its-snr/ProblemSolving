class Solution {
    public boolean isPowerOfThree(int n) {

       if(n==1)return true;
        // while(0<n){
        //     if(n%3!=0)return false;
        //     n=n/3;
        //     if(n==1)return true;
        // We can use this method to judge power of 2, 3, 5, 7, 11, ... since they are prime numbers. But we can't do this to 4, because 4 = 2 * 2 and 4^n % 2^m == 0.
        // }
        //return false;
       // return ( n>0 &&  1162261467%n==0);
       
        int maxPow = (int)(Math.pow(3, (int)(Math.log(Integer.MAX_VALUE) / Math.log(3))));
        return (n > 0 && maxPow % n == 0);
    
         //return recursive(n); 
    }
    public boolean recursive(int n){
        if(n==1)return true;
        // while(0<n){
        //     if(n%3!=0)return false;
        //     n=n/3;
        //     if(n==1)return true;
        // }
        if(n%3!=0 || n<1)return false;
        else return recursive(n/3);
    }
}