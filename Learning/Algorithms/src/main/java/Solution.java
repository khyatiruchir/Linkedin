package main.java;

public class Solution {
	public static void main(String[] arg) {
		
		int n=123;
		int mod=0,revn=0;
		while (n>0) {
			revn=(revn*10)+(n%10);
			n=n/10;
		}
		System.out.print(revn);
	}
}