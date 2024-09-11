class Solution {
    public int minBitFlips(int start, int goal) {

        // String s1=Integer.toBinaryString(start);
        // int n1=s1.length();
        // //System.out.println(s1);
        // String s2=Integer.toBinaryString(goal);
        // int n2=s2.length();
        // int i=n1-1;
        // int j=n2-1;
        // int count=0;
        // while(i>=0 && j>=0){
        //     if(s1.charAt(i)!=s2.charAt(j)){
        //         count++;
        //     }
        //     i--;
        //     j--;
        // }
        // while(i>=0){
        //     if(s1.charAt(i)=='1')count++;
        //     i--;
        // }
        // while(j>=0){
        //     if(s2.charAt(j)=='1')count++;
        //     j--;
        // }
        // //System.out.println(s2);
        // return count;
         int count = 0; 
        int xor = start ^ goal; // XOR will give 1 where the bits differ

        while(xor!=0){
            count += xor & 1; // Increment count if the last bit is 1
            xor >>=1; // Right-shift to check the next bit
        }
        return count;
        
    }
}