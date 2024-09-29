class Solution {
    public char kthCharacter(int k) {

        String word="a";
        char curr='a';
        while(word.length()<k){
            String nxt="";
            for(int i=0;i<word.length(); i++){
                char c=word.charAt(i);
                //int ascii=
                nxt+=(c=='z')?'a':(char)(c+1);
                //nxt+=nextChar;
            }
            word+=nxt;
        }
        return word.charAt(k-1);

        
        
    }
}