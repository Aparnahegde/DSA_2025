class Solution {
    public String reverseVowels(String s) {

        // String containing all vowels
        String vowels = "AEIOUaeiou";

        // Convert string to char array
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        // Two-pointer approach
        while (left < right) {

            // If left is not a vowel, move forward
            if (vowels.indexOf(arr[left]) == -1) {
                left++;
            }
            // If right is not a vowel, move backward
            else if (vowels.indexOf(arr[right]) == -1) {
                right--;
            }
            // Both are vowels → swap
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}
