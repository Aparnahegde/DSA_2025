/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int maxSum = Integer.MIN_VALUE;
        int l = list.size();
        for(int i = 0; i < l/2; i++){
            maxSum = Math.max(maxSum, list.get(i) + list.get(l-i-1));
        }

        return maxSum;
    }
}
