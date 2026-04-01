import java.util.ArrayList;
import java.util.List;

public class Solution {
    static void main() {
        System.out.println(new Solution().groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}).toString());
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        if (strs.length == 0) return result;
        if  (strs.length == 1) {
            List<String> list = new ArrayList<>();
            list.add(strs[0]);
            result.add(list);
            return result;
        }

        for (int i = 0; i < strs.length; i++) {
            String current = strs[i];
            if (current != null) {
                List<String> list = new ArrayList<>();
                list.add(current);
                strs[i] = null;
                for (int j = i + 1; j < strs.length; j++) {
                    String next = strs[j];
                    if (strs[j] != null && isAnagram(current, next)) {
                        list.add(next);
                        strs[j] = null;
                    }
                }
                result.add(list);
            }
        }
        return result;
    }

    private boolean isAnagram(String s, String t) {
        int length = s.length();
        if (length != t.length()) return false;
        byte[] counter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < length; i++) {
            counter[s.charAt(i) - 97]++;
            counter[t.charAt(i) - 97]--;
        }
        for (byte i : counter) {
            if (i != 0) return false;
        }
        return true;
    }
}
