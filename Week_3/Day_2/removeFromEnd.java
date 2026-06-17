public class removeFromEnd{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow= head;
        ListNode fast= head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args){
        removeFromEnd soln= new removeFromEnd();
         ListNode a= new ListNode(10);
        ListNode b= new ListNode(1);
        ListNode c= new ListNode(0);
        ListNode d= new ListNode(17);
        ListNode e= new ListNode(19);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
       ListNode ans=soln.removeNthFromEnd(a,3);
        while(ans!=null){
            System.out.print(ans.val + " ");
            ans=ans.next;
        }
    }
}