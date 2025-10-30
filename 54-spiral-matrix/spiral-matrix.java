class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> a=new ArrayList<>();
        int CB=0,CE=matrix[0].length-1,RB=0,RE=matrix.length-1;
        while(RB<=RE&&CB<=CE){
            for(int i=CB;i<=CE;i++){
                a.add(matrix[RB][i]);
            }
            RB++;
            for(int i=RB;i<=RE;i++){
                a.add(matrix[i][CE]);
            }
            CE--;
            if(RB<=RE){
                for(int j=CE;j>=CB;j--){
                    a.add(matrix[RE][j]);
                }
                RE--;
            }
            if(CB<=CE){
                for(int i=RE;i>=RB;i--){
                    a.add(matrix[i][CB]);
                }
                CB++;
            }
        }
        return a;
    }
}