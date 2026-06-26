class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> prefix = new ArrayList<>();
        List<Integer> suffix = new ArrayList<>();

        int prefixMul = 1;
        int suffixMul = 1;

        for (int i = 0; i < nums.length; i++) {
            prefix.add(prefixMul);
            prefixMul = prefixMul * nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            suffix.add(0, suffixMul);
            suffixMul = suffixMul * nums[i];
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix.get(i) * suffix.get(i);
        }

        return ans;
    }
}
