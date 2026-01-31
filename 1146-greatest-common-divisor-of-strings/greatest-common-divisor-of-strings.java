// class Solution {
//     public String gcdOfStrings(String str1, String str2) {
//         // Check if concatenated strings are equal or not, if not return ""
//         if (!(str1 + str2).equals(str2 + str1))
//             return "";
//         // If strings are equal than return the substring from 0 to gcd of size(str1), size(str2)
//         int gcd = gcd(str1.length(), str2.length());
//         return str1.substring(0, gcd);
//     }

//     private int gcd(int a, int b) {
//         return b == 0 ? a : gcd(b, a % b);
//     }
// }


class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int lenGCD = gcd(str1.length(), str2.length());
        return str1.substring(0, lenGCD);        
    }

    private int gcd(int len1, int len2) {
        while (len2 != 0) {
            int temp = len1 % len2;
            len1 = len2;
            len2 = temp;
        }
        return len1;
    }
}