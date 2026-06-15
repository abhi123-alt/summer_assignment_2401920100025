public class cycleInAList{
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
     public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            if(slow==null) return false;
            slow=slow.next;
            if(fast.next==null) return false;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;}
    public static void main(String[] args) {
        // Create a linked list with a cycle
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates a cycle

        cycleInAList solution = new cycleInAList();
        boolean hasCycle = solution.hasCycle(head);
        System.out.println("Linked list has " + (hasCycle ? "a" : "no") + " cycle.");
    }
}