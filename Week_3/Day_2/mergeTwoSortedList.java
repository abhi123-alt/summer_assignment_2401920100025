public class mergeTwoSortedList{
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode h=new ListNode(100);
        ListNode t=h;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                t.next=t1;
                t=t1;
                t1=t1.next;
            }
            else{
                t.next=t2;
                t=t2;
                t2=t2.next;
            }
        }
        if(t1==null){
            t.next=t2;
        }
        else{
            t.next=t1;
        }
        return h.next;
    }
    public static void main(String[] args){
        mergeTwoSortedList solution= new mergeTwoSortedList();
        ListNode a= new ListNode(10);
        ListNode b= new ListNode(1);
        ListNode c= new ListNode(0);
        ListNode d= new ListNode(17);
        ListNode e= new ListNode(19);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        ListNode m=new ListNode(2);
        ListNode n=new ListNode(4);
        ListNode o=new ListNode(6);
        ListNode p=new ListNode(7);
        ListNode q=new ListNode(100);
        m.next=n;
        n.next=o;
        o.next=p;
        p.next=q;
        ListNode ans=solution.mergeTwoLists(a,m);
        while(ans!=null){
            System.out.print(ans.val + " ");
            ans=ans.next;
        }
    }
}