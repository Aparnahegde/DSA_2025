class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> m=new HashMap<>();
        List<Integer> l=new ArrayList<>();
       for (int x : nums) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }

       
        for (int i = 1; i <= n; i++) {
            if (!m.containsKey(i)) {
                l.add(i);
            }
        }
        return l;
    }
}