class Solution {
    public int countOfSubstrings(String word, int k) {

        int n=word.length();
        ArrayList<Character>v=new ArrayList<Character>();
        int ans=0;
        v.add('a');
         v.add('e');
          v.add('i');
           v.add('o');
            v.add('u');
            
        for(int i=0;i<n;i++){
            char c1=word.charAt(i);
            int v_count=0;
           //if(!v.contains(c1))v_count++;
            for(int j=i;j<n;j++){
                char c2=word.charAt(j);
                if(!v.contains(c2))v_count++;
                // if(containsVowel(i,j,word) && v_count<=k)ans++;
                //if(v_count>k)break;
                // if(k!=0 && v_count==k){
                //     if(containsVowel(i,j,k,word))ans++;

                //     break;
                // }
                // else if(k==0) {
                //     if(containsVowel(i,j,word))ans++;
                // }
                if(containsVowel(i,j,k,word))ans++;
            }
            //if(v_count==0)if(containsVowel(i,j,word))ans++;
            
        }
        return ans;
        
    }
    public boolean containsVowel(int i,int j,int k,String word){
        if((j-i)<4)return false;
        int i_count=0;
        int a_count=0;
        int e_count=0;
        int o_count=0;
        int u_count=0;
        int count=0;
        for( ;i<=j;i++){
            char c=word.charAt(i);
            if(c=='a')a_count++;
            else if(c=='e')e_count++;
            else if(c=='i')i_count++;
            else if(c=='o')o_count++;
            else if(c=='u')u_count++;
            else count++;

        }
        if(a_count>0 && e_count>0 && i_count>0 && o_count>0 && u_count>0 && count==k)return true;
        else return false;
    }
}