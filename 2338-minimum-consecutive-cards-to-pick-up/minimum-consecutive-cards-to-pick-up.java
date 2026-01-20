class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int res = Integer.MAX_VALUE;

        for (int right = 0; right < cards.length; right++) {
            freq.put(cards[right], freq.getOrDefault(cards[right], 0) + 1);

            while (freq.get(cards[right]) > 1) {
                res = Math.min(res, right - left + 1);
                freq.put(cards[left], freq.get(cards[left]) - 1);
                left++;
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
