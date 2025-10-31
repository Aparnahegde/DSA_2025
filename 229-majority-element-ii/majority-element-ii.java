class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> a=new ArrayList<>();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(int j:m.keySet()){
            if(m.get(j)>nums.length/3){
                a.add(j);
            }
        }
        return a;
    }
}