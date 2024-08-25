// class Solution {
//     public boolean isPowerOfFour(int n) {
//         // if(n==1)return true;
//         // else if (n%4!=0)return false;
//         // else if(n%4==0) return isPowerOfFour(n/4);
//         // else return false;
//         if(n<1|| Math.log(n,4)%1!=0)return false;
//         else return true;
//     }
// }
class Solution {
  public boolean isPowerOfFour(int n) {
    // Why (4^n - 1) % 3 == 0?
    // (4^n - 1) = (2^n - 1)(2^n + 1) and 2^n - 1, 2^n, 2^n + 1 are
    // Three consecutive numbers; among one of them, there must be a multiple
    // Of 3, and that can't be 2^n, so it must be either 2^n - 1 or 2^n + 1.
    // Therefore, 4^n - 1 is a multiple of 3
    return n > 0 && Integer.bitCount(n) == 1 && (n - 1) % 3 == 0;
  }
}