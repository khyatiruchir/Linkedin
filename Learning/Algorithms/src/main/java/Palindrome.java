package main.java;

public class Palindrome {
	 public void isPalindrome(int x) {
	     int tempn=x;
		int revn=0,mod;
		boolean flag=false;
		while(x>0) {
			revn=(revn*10)+(x%10);
			x=x/10;
		}
		if(tempn==revn) {
			System.out.print("number is palindrome");
		}
		else {
			System.out.print("number is not palindrome");
		}
		
	}
}
