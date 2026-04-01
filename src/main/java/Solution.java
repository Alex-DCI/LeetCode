public class Solution {
    static void main() {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        short result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                if (i != s.length() - 1 && s.charAt(i + 1) == 'V') {
                    result += 4;
                    i++;
                    continue;
                }
                if (i != s.length() - 1 && s.charAt(i + 1) == 'X') {
                    result += 9;
                    i++;
                    continue;
                }
                result ++;
            }
            if (c == 'V') {
                result += 5;
            }
            if (c == 'X') {
                if (i != s.length() - 1 && s.charAt(i + 1) == 'L') {
                    result += 40;
                    i++;
                    continue;
                }
                if (i != s.length() - 1 && s.charAt(i + 1) == 'C') {
                    result += 90;
                    i++;
                    continue;
                }
                result += 10;
            }
            if (c == 'L') {
                result += 50;
            }
            if (c == 'C') {
                if (i != s.length() - 1 && s.charAt(i + 1) == 'D') {
                    result += 400;
                    i++;
                    continue;
                }
                if (i != s.length() - 1 && s.charAt(i + 1) == 'M') {
                    result += 900;
                    i++;
                    continue;
                }
                result += 100;
            }
            if (c == 'D') {
                result += 500;
            }
            if (c == 'M') {
                result += 1000;
            }
        }
        return result;
    }
}
