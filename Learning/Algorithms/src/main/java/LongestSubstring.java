package main.java;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] arg) {
		LongestSubstring obj=new LongestSubstring();
		int len=obj.lengthOfLongestSubstring("abcabcbb");
		System.out.print(len);
	}
	public int lengthOfLongestSubstring(String s) {
        int i=0,len=s.length(),ans=0,j;
        for(;i<len;i++) {
        	for(j=i+1;j<=len;j++) {
        		if(allUnique(s,i,j)) ans=Math.max(ans, j-i);
        	
        	}
        }return ans;}
       boolean allUnique(String s,int start,int end){
       Set<Character> substr=new HashSet<Character>();
       for(int i=start;i<end;i++) {
    	   char ch=s.charAt(i);
    	   if(substr.contains(ch)) return false;
    	   substr.add(ch);
    	   
       }return true;
    }
	
}
