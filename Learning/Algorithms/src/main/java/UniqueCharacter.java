package main.java;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {
	public static void main(String[] arg) {
		UniqueCharacter obj=new UniqueCharacter();
		System.out.print(obj.firstUniqChar("leetcodelove"));
	}
	
	 public int firstUniqChar(String s) {
	        Map<Character, Integer> myMap=new HashMap<Character, Integer>();
	        char c=' ';
	        for(int i=0;i<s.length();i++) {
	        	c=s.charAt(i);
	        	if(!myMap.containsKey(c)) {
	        		myMap.put(c, 1);
	        	}
	        	else {
	        		int value= Integer.valueOf(myMap.get(c));
	        		myMap.put(c, value+1);
	        	}
	        }
	        
	        for(int i=0;i<myMap.size();i++) {
	        	//System.out.print(myMap.get(s.charAt(i)));
	        	//System.out.print(myMap.get(i)==1);
	        	if(myMap.get(s.charAt(i))==1)
	        		return i;
	        }
	        return -1;
	    }
}
