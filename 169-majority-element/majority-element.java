class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> m=new HashMap<>();
      for(int i:nums){
        m.put(i,m.getOrDefault(i,0)+1);
      } 

      for(int i:m.keySet()){
        if(m.get(i)>nums.length/2){
            return i;
        }
      }
      return 0; 
    }
}