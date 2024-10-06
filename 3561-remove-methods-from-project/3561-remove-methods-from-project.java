class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invs) {
        Set<Integer> sm = new HashSet<>();
        sm.add(k);
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int[] inv : invs) {
                int a = inv[0];
                int b = inv[1];
                if (sm.contains(a) && !sm.contains(b)) {
                    sm.add(b);
                    flag = true;
                }
            }
        }
        for (int[] inv : invs) {
            if (!sm.contains(inv[0]) && sm.contains( inv[1])) return Arrays.asList(helper(n));
        }
        List<Integer> rem = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!sm.contains(i)) {
                rem.add(i);
            }
        }
        return rem;
    }
     private static Integer[] helper(int n) {
        Integer[] res = new Integer[n];
        for (int i = 0; i < n; i++) {
            res[i] = i;
        }
        return res;
    }
}