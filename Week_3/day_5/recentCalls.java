import java.util.*;
public class recentCalls{
    Queue<Integer> q= new LinkedList();
   // public RecentCounter() {
        
    //}
    
    public int ping(int t) {
        q.add(t);
        while(q.peek()<t-3000) q.poll();
        return q.size();
    }
    public static void main(String[] args) {
        recentCalls r= new recentCalls();
        System.out.println(r.ping(1));
        System.out.println(r.ping(0));
        System.out.println(r.ping(3001));
        System.out.println(r.ping(3002));
        System.out.println(r.ping(100));

    }
}