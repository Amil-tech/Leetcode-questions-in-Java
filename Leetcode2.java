
public class Leetcode2 {

	public static void main(String[] args) {
		
		String name = "1Amil";
		System.out.println(Integer.valueOf(String.valueOf(name.charAt(0))));

	}
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		      
	}
	
	
	  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode dummy = new ListNode(0);
	        ListNode current = dummy;
	        ListNode ard1 = l1;
	        ListNode ard2 = l2;
	        int carry = 0;
	        while(ard1 != null || ard2 != null){
	            int x = (ard1 != null) ? ard1.val : 0;
	            int y = (ard2 != null) ? ard2.val : 0;
	            int sum = x + y + carry;
	            int num = sum % 10;
	            carry = sum / 10;
	            current.next = new ListNode(num);
	            current = current.next;
	            ard1 = (ard1 != null) ? ard1.next : null;
	            ard2 = (ard2 != null) ? ard2.next : null;
	        }

	        if(carry > 0){
	            current.next = new ListNode(carry);
	        }

	        return dummy.next;
		}
	

}
