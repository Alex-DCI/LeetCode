import java.util.Arrays;

public class Solution {
    static void main() {
        System.out.println(new Solution().isAnagram("car", "rat"));
    }

    public boolean isAnagram(String s, String t) {
        int length = s.length();
        if (length != t.length()) return false;
        short[] counter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < length; i++) {
            counter[s.charAt(i) - 97]++;
            counter[t.charAt(i) - 97]--;
        }
        for (short i : counter) {
            if (i != 0) return false;
        }
        return true;
    }
}
