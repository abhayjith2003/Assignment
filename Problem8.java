/* 
 Given the head of a sorted linked list, delete all duplicates such that each elements 
 appears only once. Return the linked list sorted as well.
*/


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Problem8 {
    
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(4);

        Problem8 obj = new Problem8();
        ListNode result = obj.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
