class Solution {
    public int chalkReplacer(int[] chalk, int k) {

        int i=0;
        int n=chalk.length;
        if(n==1)return 0;
        while(k>=0){
            k=k-chalk[i];
            if(k<0)return i;
            i++;
            if(i>=n)i=i%n;
        }
        return i-1;
        
    }
}