class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        int start = 0, odd = 0, count = 0;

        for (int end = 0; end < nums.length; end++) {
            odd += nums[end] & 1;

            while (odd > k) {
                odd -= nums[start] & 1;
                start++;
            }

            count += end - start + 1;
        }

        return count;
    }
}
