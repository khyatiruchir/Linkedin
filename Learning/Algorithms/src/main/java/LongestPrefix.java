package main.java;

import java.awt.peer.SystemTrayPeer;
import java.util.ArrayList;
import java.util.List;

public class LongestPrefix {
	public static void main(String[] arg) {
		//int j=0; strs    0		1	   2
		String[] strs= {"dolly", "dog", "doll"};
		
		if (strs == null || strs.length == 0) {
			System.out.println("no string as input");
		}
	    
		for (int i = 0; i < strs[0].length() ; i++){
	        char c = strs[0].charAt(i);
	        for (int j = 1; j < strs.length; j ++) {
	            if (i == strs[j].length() || (i<strs[j].length() && strs[j].charAt(i) != c))
	                System.out.println( strs[0].substring(0, i));             
	        }
	    }
		
		
		
		/*
		for (String s : str) {
			
			
			for(int i=0;i<s.length();i++) {
				
			}
		}
		
		
		
		ArrayList<String> strArray=new ArrayList<String>(str.length);
		for(int i=0;i<str.length;i++) {
			strArray.add(str[i]);		
			}
		for(int i=0;i<strArray.size();i++) {
			for(int j=0;j<strArray[i])
		}*/
	}
}

