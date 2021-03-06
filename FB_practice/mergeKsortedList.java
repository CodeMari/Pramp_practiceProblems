package FB_practice;

public class mergeKsortedList {
    public ListNode mergeKLists(ListNode[] lisits){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(ListNode head : lists){
            while(head != null){
                pq.add(head.val); 
                head = head.next;
            }
        }
        ListNode dummy = new ListNode(-1); 
        ListNode head =dummy; 
        while(!pq.isEmpty()){
            head.next = new ListNode(pq.remove());
            head = head.next; 
        }
        return dummy.next; 
    }
    
}
