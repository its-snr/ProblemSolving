class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        int p1=Character.getNumericValue(coordinate1.charAt(1));
        int p2=Character.getNumericValue(coordinate2.charAt(1));
        //char[] c={'a','b','c','d','e','f','g','h'};
        ArrayList<Character> c=new ArrayList<Character>();
        c.add('a');
        c.add('b');
        c.add('c');
        c.add('d');
        c.add('e');
        c.add('f');
        c.add('g');
        c.add('h');
        int pa1=c.indexOf(coordinate1.charAt(0));
        int pa2=c.indexOf(coordinate2.charAt(0));
        if((pa1+1)%2==0 && (pa2+1)%2==0){

            if(p1%2==0 && p2%2==0){
                return true;

            }
            else if(p2%2!=0 && p1%2!=0){
                return true;
            }
            else return false;

        }
        else if((pa1+1)%2!=0 && (pa2+1)%2!=0){

            if(p1%2==0 && p2%2==0){
                return true;

            }
            else if(p2%2!=0 && p1%2!=0){
                return true;
            }
            else return false;

        }
        else if(((pa1+1)%2!=0 && (pa2+1)%2==0)||((pa1+1)%2==0 && (pa2+1)%2!=0)){

            if(p1%2==0 && p2%2==0){
                return false;

            }
            else if(p2%2!=0 && p1%2!=0){
                return false;
            }
            else return true;

        }
        return true;
    }
}