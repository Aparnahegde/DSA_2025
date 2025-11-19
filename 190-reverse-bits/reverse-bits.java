class Solution {
    public int reverseBits(int n) {
    int rev = 0;

    for (int i = 0; i < 32; i++) {
        rev = (rev *2) | (n & 1);  // take last bit and add to rev
        n =n/2;                     // move to next bit
    }

    return rev;


    }
}