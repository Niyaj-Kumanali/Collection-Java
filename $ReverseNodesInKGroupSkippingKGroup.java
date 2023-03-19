package Collection;

public class $ReverseNodesInKGroupSkippingKGroup {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(-4);
        ListNode node2 = new ListNode(0, node1);
        ListNode node3 = new ListNode(2, node2);
        ListNode node = new ListNode(3, node3);
        ListNode node4 = node;
        while (node4 != null){
            System.out.print(node4.val +" --> ");
            node4 = node4.next;
        }
        System.out.println();
        node4 = reverseAlternateKGroup(node, 2);
        while (node4 != null){
            System.out.print(node4.val +" --> ");
            node4 = node4.next;
        }
    }

    public static ListNode reverseAlternateKGroup(ListNode head, int k) {
        if (k <= 1 || head == null)
            return head;

        ListNode current = head;
        ListNode prev = null;
        while (current == null){

            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null)
                    next = next.next;
            }

            if (last != null)
                last.next = prev;
            else
                head = prev;

            newEnd.next = current;

            for (int i = 0; i < k; i++) {
                prev = current;
                current = current.next;
            }
        }

        return head;
    }
}
