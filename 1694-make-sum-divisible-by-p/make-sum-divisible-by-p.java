class Solution {
    public int minSubarray(int[] nums, int p) {

        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int remainder = (int)(totalSum % p);

        if (remainder == 0) {
            return 0;
        }

        Map<Integer, Integer> remainderIndex = new HashMap<>();
        remainderIndex.put(0, -1); // base case

        long currentSum = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];
            int currentRemainder = (int)(currentSum % p);

            int needed = currentRemainder - remainder;
            if (needed < 0) {
                needed += p;
            }

            if (remainderIndex.containsKey(needed)) {
                int length = i - remainderIndex.get(needed);
                minLength = Math.min(minLength, length);
            }

            remainderIndex.put(currentRemainder, i);
        }

        return minLength == nums.length ? -1 : minLength;
    }
}
