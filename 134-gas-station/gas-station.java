class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totGas=0;
        int totSt=0;
        for(int i=0;i<gas.length;i++){
            totGas+=gas[i];
            totSt+=cost[i];
        } 
        if(totGas<totSt){
            return -1;
        }

        int cG=0,st=0;
        for(int i=0;i<gas.length;i++){
            cG+=gas[i]-cost[i];
            if(cG<0){
                st=i+1;
                cG=0;
            }
        }
        return st;

    }
}