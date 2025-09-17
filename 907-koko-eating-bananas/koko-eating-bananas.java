class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int pile:piles){
            max=Math.max(pile,max);
        }
        while(min<max){
            int mid=min+(max-min)/2;
            if(EatInTime(piles,h,mid))
                max=mid;
            else
                min=mid+1;
        }
        return min;
    }
    private boolean EatInTime(int[] piles,int h,int speed){
        int hr=0;
        for(int pile:piles){
            hr+= (int) Math.ceil((double) pile / speed);
            
        }
        return hr<=h;
    }
}