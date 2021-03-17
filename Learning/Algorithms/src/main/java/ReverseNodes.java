package main.java;
import main.java.ListNode;

public class ReverseNodes {
	public static void main(String[] arg) {
		ListNode head=null;
		ListNode ptr=head;
		int i=0;
		while(i<3) {
			if(head==null) {
				ListNode node=new ListNode(i);
				head=node;
				ptr=node;
			}
			else {
				ListNode node=new ListNode(i);
				head.next=node;
				head=node;

			}
			i++;
		}

		while(head.next!=null) {
			System.out.print(head.val);
			head=head.next;
		}
	}
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode ptr=head;
		int count=0;
		while(count<k && ptr.next!=null){
			ptr=ptr.next;
			count++;
		}
		if(count==k){
			ListNode reverseHead=this.revereseGroup(ptr,count);
			head.next=reverseKGroup(ptr,k);
			return reverseHead;
		}
		return head;
	}
	public ListNode revereseGroup(ListNode head,int k){
		ListNode ptr=head;
		ListNode new_head=null;
		while(k>0){
			ListNode next_node=ptr.next;
			ptr.next=new_head;
			new_head=ptr;
			ptr=next_node;
			k--;
		}
		return new_head;
	}

}
