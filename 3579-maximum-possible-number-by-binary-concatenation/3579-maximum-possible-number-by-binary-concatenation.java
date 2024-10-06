class Solution {
    public int maxGoodNumber(int[] nums) {

        String num1=Integer.toBinaryString(nums[0]);
        String num2=Integer.toBinaryString(nums[1]);
        String num3=Integer.toBinaryString(nums[2]);
        int d1=Integer.parseInt(num1+num2+num3,2);
        int d2=Integer.parseInt(num2+num1+num3,2);
        int d3=Integer.parseInt(num3+num1+num2,2);
        int d4=Integer.parseInt(num1+num3+num2,2);
        int d5=Integer.parseInt(num2+num3+num1,2);
        int d6=Integer.parseInt(num3+num2+num1,2);
        int max=Math.max(d1,d2);
        max=Math.max(max,d3);
        max=Math.max(max,d4);
        max=Math.max(max,d5);
        max=Math.max(max,d6);

        return max;
        
    }
}