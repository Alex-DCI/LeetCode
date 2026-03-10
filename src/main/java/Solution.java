import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    static void main() {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        resultMap.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++){
            int complement = target - nums[i];

            if(resultMap.containsKey(complement)) {
                return new int[]{resultMap.get(complement), i};
            }

            resultMap.put(nums[i],i);
        }

        return new int[]{};
    }
}
