//Leetcode 141 Linked List Cycle

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {
                return true; // cycle detected
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        // Link nodes
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create cycle (node4 -> node2)
        node4.next = node2;

        boolean result = hasCycle(head);
        System.out.println(result);  // Output: true
    }
}