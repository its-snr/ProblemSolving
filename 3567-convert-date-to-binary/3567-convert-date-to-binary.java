class Solution {
    public String convertDateToBinary(String date) {

        StringBuilder s=new StringBuilder();
        int year=Integer.parseInt(date.substring(0,4));
        s.append(Integer.toBinaryString(year));
        s.append('-');
        int month=Integer.parseInt(date.substring(5,7));
        s.append(Integer.toBinaryString(month));
        s.append('-');
        int d=Integer.parseInt(date.substring(8,10));
        s.append(Integer.toBinaryString(d));
        return s.toString();
        
    }
}