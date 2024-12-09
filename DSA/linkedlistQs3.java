// Question3: Detect a Cycle in a linked list + Trick to remove the cycle

/**
 * Definition for singly-linked list.
 * class ListNode {
 *      int val;
 *      ListNode next;
 *      ListNode(int x) {
 *          val = x;
 *          next = null;
 *      }
 * }
 */

public class linkedlistQs3 {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return  false;
        }
        ListNode hare = head; // fast
        ListNode turtle = head; // slow

        while(hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle) {
                return  true;
            }
        }

        return false;
    }
}
