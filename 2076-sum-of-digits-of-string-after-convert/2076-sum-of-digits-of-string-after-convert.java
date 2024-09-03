class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        //StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int n=(int)s.charAt(i)-96;
            if(n>9){
                int d=n%10;
                n=n/10;
                sum+=n+d;
            }
            else sum+=n;
            //sb.append(n);   
        }
       // System.out.println(sum);
        if(k>=2){
            while(k>1 && sum>9){
                int temp=sum;
                sum=0;
                while(temp>0){
                    int d=temp%10;
                    sum+=d;
                    temp/=10;
                }
                //System.out.println(sum);
                k--;

            }
        } 
        return sum;
    }
}