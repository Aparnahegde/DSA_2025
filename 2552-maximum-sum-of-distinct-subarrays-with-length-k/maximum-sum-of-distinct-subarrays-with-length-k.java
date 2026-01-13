class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> windowSet = new HashSet<>();
        long windowSum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Remove duplicates from window
            while (windowSet.contains(nums[right])) {
                windowSet.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            // Add current element
            windowSet.add(nums[right]);
            windowSum += nums[right];

            // If window size is k, check max and slide
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);

                // Slide window
                windowSet.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}
