class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l= new ArrayList<>();
        int m=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>m) m=candies[i];
        } 
        for(int i:candies){
            if(m<=i+extraCandies){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }

        return l;
    }
}