class Solution {
    public int maximumGain(String s, int x, int y) {
        int score = 0;

        StringBuilder sb=new StringBuilder(s);

        if (x > y) {
            score += solution(sb, x, 'a', 'b');
            score += solution(sb, y, 'b', 'a');
        } else {
            score += solution(sb, y, 'b', 'a');
            score += solution(sb, x, 'a', 'b');

        }
        return score;

    }

    public int solution(StringBuilder s, int x, char c1, char c2) {

          int n = s.length();
        if (n < 2) return 0;

        int score = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ++i) {

            int l = sb.length();
            if (l > 0 && sb.charAt(l - 1) == c1 && s.charAt(i) == c2) {
                sb.deleteCharAt(l - 1);
                score += x;
            } else
                sb.append(s.charAt(i));

        }
        s.setLength(0);
        s.append(sb);

        return score;
    }
}