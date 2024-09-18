class Solution {
    public boolean isValid(String s) {
        
        int n=s.length();
        Stack<Character>st=new Stack<Character>();
        if(n%2!=0)return false;
        for(int i=0;i<n;i++){
           char c=s.charAt(i);
           if(c=='(' || c=='{' || c=='[')st.push(c);
           else{
            if(st.isEmpty())return false;
            else {
                char open=st.pop();
                if(open=='(' && c==')')continue;
                else if(open=='{' && c=='}')continue;
                else if(open=='[' && c==']')continue;
                else return false;
            }
           }
            
        }
        
        return st.isEmpty();
        
    }
}