

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefCount = new HashMap<>();
        prefCount.put(0, 1);   // one way to have prefix sum 0 (empty prefix)

        int sum = 0;
        int count = 0;

        for (int n : nums) {
            sum += n;
            // if there was a previous prefix with value (sum - k), then
            // subarray(s) between that prefix and current index sum to k
            count += prefCount.getOrDefault(sum - k, 0);

            // record this prefix sum for future subarrays
            prefCount.put(sum, prefCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
