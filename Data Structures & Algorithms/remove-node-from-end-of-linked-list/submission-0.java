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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            nodes.add(cur);
            cur = cur.next;
        }

        int remIn = nodes.size() - n;
        if(remIn == 0){
            return head.next;
        }

        nodes.get(remIn - 1).next = nodes.get(remIn).next;
        return head;
    }
}
