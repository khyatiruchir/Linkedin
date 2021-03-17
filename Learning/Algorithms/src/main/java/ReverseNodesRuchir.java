package main.java;
import main.java.ListNode;

public class ReverseNodesRuchir {
	public static void main(String[] arg) {
		//ListNode head=null;
		ListNode pointerNode = new ListNode();
		int i=5;
		while(i>=1) {
			ListNode deepestNode = new ListNode(i);
			if(pointerNode==null) {
				pointerNode = deepestNode;
			}else {
				deepestNode.next = pointerNode;
				pointerNode = deepestNode;
			}
			
			i--;
		}

		ReverseNodesRuchir
		while(pointerNode.next!=null) {
			System.out.print(pointerNode.val);
			pointerNode = pointerNode.next;
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
