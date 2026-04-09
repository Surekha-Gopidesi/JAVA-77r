package demo;

	import java.util.PriorityQueue;
      class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}

	public class List{
	    public ListNode mergeKLists(ListNode[] lists) {
	        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);
	        
	        for (ListNode list : lists) {
	            if (list != null) {
	                queue.offer(list);
	            }
	        }
	        
	        ListNode obj = new ListNode(0);
	        ListNode current = obj;
	        
	        while (!queue.isEmpty()) {
	            ListNode node = queue.poll();
	            current.next = node;
	            current = current.next;
	            
	            if (node.next != null) {
	                queue.offer(node.next);
	            }
	        }
	        
	        return obj.next;
	    }

	    public static void main(String[] args) {
	        List solution = new List();

	        // Create linked lists
	        ListNode list1 = new ListNode(1);
	        list1.next = new ListNode(4);
	        list1.next.next = new ListNode(5);

	        ListNode list2 = new ListNode(1);
	        list2.next = new ListNode(3);
	        list2.next.next = new ListNode(4);

	        ListNode list3 = new ListNode(2);
	        list3.next = new ListNode(6);

	        // Merge linked lists
	        ListNode[] lists = {list1, list2, list3};
	        ListNode mergedList = solution.mergeKLists(lists);

	        // Print merged linked list
	        while (mergedList != null) {
	            System.out.print(mergedList.val + " ");
	            mergedList = mergedList.next;
	        }
	    }


}


