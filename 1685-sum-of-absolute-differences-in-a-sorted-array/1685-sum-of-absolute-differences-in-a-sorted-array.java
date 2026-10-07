class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int total = 0;
        int leftSum = 0;
        for (int num : nums) {
            total += num;
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int left = nums[i] * i - leftSum;
            int right = (total - leftSum - nums[i]) - (n - i - 1) * nums[i];
            result[i] = left + right;
            leftSum += nums[i];
        }
        return result;
    }
}