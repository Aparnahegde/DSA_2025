class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        HashSet <Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        for(int i:m.keySet()){
            if(s.add(m.get(i))){
                continue;
            }
            else{
                return false;
            }
        }

        return true;
    }
}