import java.util.ArrayList;

public class ReverseLinkedList {
	
	class ListNode{
		int value;
		ListNode next;
		public ListNode(){};
		public ListNode(int val) {this.value = val;}
		public ListNode(int val, ListNode next) {this.value=val; this.next=next;}
	}
	
	public static void reverseOderList(ListNode head) {
		
		//using ArrayList to store List values
		//O(N) Time and O(N) Space
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(head != null) {
			list.add(head.value);
			head=head.next;
		}
		
		
		for(int i = list.size();i>=0;i--) {
			System.out.println(list.get(i));
		}
	}
	
	public static ListNode reverseWithPointers(ListNode head) {
		
		//O(N) Time and O(1) Space
		ListNode previous=null, current=head, next=null;
		
		while(current != null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		head = previous;
		return head;
	}

}
