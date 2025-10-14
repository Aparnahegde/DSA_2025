class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        int st=0;
        int e=arr.length-1;
        while(st<e){
            String temp=arr[st];
            arr[st]=arr[e];
            arr[e]=temp;
            st++;
            e--;
        }
        return String.join(" ",arr);

    }
}