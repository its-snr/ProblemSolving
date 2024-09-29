class Solution {
public:
    char kthCharacter(int k) {

        string w="a";
        
        while(w.length()<k){
            string current="";
            for(char character:w){
                //char character=word.charAt(i);
               if( character=='z')current+'a';
               else current+=character+1;
                
            }
            w+=current;
        }
        return w[k-1];
        
    }
};