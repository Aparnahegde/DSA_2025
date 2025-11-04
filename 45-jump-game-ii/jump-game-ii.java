class Solution {
    public int jump(int[] nums) {
        int coverage = 0;
        int lastJump = 0;
        int tot = 0;
        int dest = nums.length - 1;

        for (int i = 0; i < dest; i++) {
            coverage = Math.max(coverage, i + nums[i]);
            
            if (i == lastJump) {
              
                lastJump = coverage;
                tot++;
              
                if (lastJump >= dest) return tot;
            }
        }
        return tot;
    }
}
