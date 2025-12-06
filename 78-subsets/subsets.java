class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList=new ArrayList<>();

        backtrack(resultList, new ArrayList<>(),nums,0);
        return resultList;
    }

    public void backtrack(List<List<Integer>> rS,List<Integer> tS,int[] nums,int start){
        rS.add(new ArrayList<>(tS));
        for(int i=start;i<nums.length;i++){
            tS.add(nums[i]);
            backtrack(rS,tS,nums,i+1);
            tS.remove(tS.size()-1);
        }
    }
}