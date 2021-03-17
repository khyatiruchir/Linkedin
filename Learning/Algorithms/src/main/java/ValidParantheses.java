package main.java;

import java.util.Stack;
import java.util.*;
public class ValidParantheses {
	public static void main(String[] arg) {
		HashMap<Character, Character> brcMap=new HashMap<Character,Character>();
		brcMap.put(')', '(');
		brcMap.put('}', '{');
		brcMap.put(']', '[');
		String s= "[()()]";
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(brcMap.containsKey(c)) {
				Character topElement=st.pop();
				if(topElement != brcMap.get(c)) {
					System.out.print("Invalid");
				}
			}
			else {
				st.push(c);
			}
		}
		if(st.isEmpty()) {
			System.out.print("Valid");
		}
		else{
			System.out.print("Invalid");
		}
		
	}
}