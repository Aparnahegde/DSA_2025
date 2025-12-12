class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String ans = "";

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            String rev = new StringBuilder(word).reverse().toString();
            ans += rev;
            if (i < arr.length - 1) ans += " ";
        }

        return ans;
    }
}
