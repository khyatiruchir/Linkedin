package main.java;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class AddNumbers {
	public static void main(String[] arg) {
		AddNumbers obj=new AddNumbers();
		
		 //ListNode l3=obj.addTwoNumbers(li1, li2);
		 ListNode l1=new ListNode(4,new ListNode(3));
		 ListNode child1= new ListNode(2, l1);
		 ListNode l2=new ListNode(5,new ListNode(6,new ListNode(4)));
		 ListNode total= obj.addTwoNumbers(child1, l2);
		 while(total!=null) {
			 System.out.println(total.val);
		 }
	}
	
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode total=new ListNode();
    ListNode p=l1,q=l2,curr;
    //curr
    int carry=0;
    while(p !=null && q!=null){
        int x=p!=null?p.val:0;
        int y=q!=null?q.val:0;
        int sum=x+y+carry;
        carry=sum/10;
        curr.next=new ListNode(sum%10);
        curr=curr.next;
        p=p.next;
        q=q.next;
    }
    return curr;
       
    }
}
