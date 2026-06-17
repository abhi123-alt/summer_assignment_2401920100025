public class palindrome{
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
            ListNode temp=reverse(slow.next);
             slow.next=temp;
            ListNode p1= head;
            ListNode p2=slow.next;
            while(p2!=null){
                if(p1.val!=p2.val) return false;
                p1=p1.next;
                p2=p2.next;
        }
            return true;
   }
   public static void main(String[] args) {
        palindrome obj = new palindrome();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        
        boolean result = obj.isPalindrome(head);
        System.out.println("This linked list is " + (result ? "" : "not ") + "a palindrome");
    }
}