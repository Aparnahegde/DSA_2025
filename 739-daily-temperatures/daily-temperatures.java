class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> h=new Stack<>();
        int n=temperatures.length;
        int[] r=new int[n];

        for(int i=n-1;i>=0;i--){
            while(!h.isEmpty()&& temperatures[i]>=temperatures[h.peek()]){
                h.pop();
            }

            if(!h.isEmpty()){
                r[i]=h.peek()-i;
            }

            h.push(i);
        }
        return r;
    }
}