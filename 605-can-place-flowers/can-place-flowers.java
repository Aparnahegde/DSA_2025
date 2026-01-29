class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int flowersPlanted = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            // Check if current plot is empty
            if (flowerbed[i] == 0) {

                // Check left side
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);

                // Check right side
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                // If both sides are empty, we can plant a flower
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;   // plant flower
                    flowersPlanted++;

                    // If we already planted enough flowers, return true
                    if (flowersPlanted >= n) {
                        return true;
                    }
                }
            }
        }

        // After checking all plots
        return flowersPlanted >= n;
    }
}
