import java.util.HashMap;

public class _1_TwoSum {
    public static void main(String[] argv) {
        int[] result = twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(result);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <= nums.length; i++) {
            int diff = target - nums[i];
            if (hashMap.containsKey(diff)) {
                return new int[] { hashMap.get(diff), i };
            }
            hashMap.put(nums[i], i);
        }
        return new int[] { 0 };
    }
}
