class Solution {
    public int[] resultsArray(int[][] queries, int k) {

        int n=queries.length;
        int[] ans=new int[n];
        PriorityQueue<Integer>tree=new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            int a=Math.abs(queries[i][0]);
            int b=Math.abs(queries[i][1]);
            // if(t>=k){
            //     ans[i]=a+b;
            // if(tree.contains(a+b)){
            //     // ArrayList<Integer> arr=new ArrayList<Integer>(tree);
            //     if(arr.size()>=k){
            //         int temp=arr.get(k-1);
            //         if(temp==)
            //         ans[i]=arr.get(k-1);
            //     }
            //     else ans[i]=-1;

            // }
            // else {
                // tree.add(a+b);
                // if(t>=k){
                    tree.add(a+b);
                    if(tree.size()>k){
                        int temp=tree.poll();
                       // min.add(temp);
                    }
                    if(tree.size()<k){
                        ans[i]=-1;
                    }
                    else {
                        ans[i]=tree.peek();
                    }
               // System.out.println(tree);

                // // }
                // Collections.sort(arr);
                // // ArrayList<Integer> arr=new ArrayList<Integer>(tree);
                // if(arr.size()>=k)ans[i]=arr.get(k-1);
                // else ans[i]=-1;
               // t++;

            }
                
            // }
            // else ans[i]=-1;
           // t++;
        
        return ans; 
    }
}