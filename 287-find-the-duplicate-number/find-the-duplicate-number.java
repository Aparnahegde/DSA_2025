class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap<Integer,Integer> m=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //    m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        // }
        // for(int i:m.keySet()){
        //     if(m.get(i)>1){
        //         return i;
        //     }
        // }
        // return -1;

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return -1;

    }
}