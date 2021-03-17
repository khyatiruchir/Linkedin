package main.java;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowOpportunity {

	public static void main(String[] arg) {
		MinimumWindowOpportunity obj =new MinimumWindowOpportunity();
		System.out.println("|"+obj.minWindow("ABAACBAB", "ABC")+"|");

	}

	public String minWindow(String s, String t) {

		Map<Character,Integer> dicT=new HashMap<Character,Integer>();
		for(int i=0;i<t.length();i++) {
			char c=t.charAt(i);
			int val=dicT.getOrDefault(c, 0);
			dicT.put(c, val+1);
		}
		
		int required=dicT.size(), left=0,right=0,formed=0;
		int[] strArray= {-1,0,0};
		Map<Character,Integer> windowT=new HashMap<Character,Integer>();


		while(right<s.length()) {
			char c=s.charAt(right);
			int val=windowT.getOrDefault(c, 0);
			//val=val+1;
			windowT.put(c,val+1 );
			/*
			 * if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
              formed++;
          }
			 * */

			System.out.println("value:"+val+windowT.get(c)+ " "+windowT.get(c).intValue());
			System.out.println(dicT.get(c)+ " "+dicT.get(c).intValue());
			if(dicT.containsKey(c) && windowT.get(c).intValue()==dicT.get(c).intValue()) {
			
				formed++;
			}

			while(left<=right && formed==required) {
				c = s.charAt(left);
				if(strArray[0]==-1 || right-left+1<strArray[0]) {
					strArray[0]=right-left+1;
					strArray[1]=left;
					strArray[2]=right;
				}

				windowT.put(c, windowT.get(c)-1);
				if(dicT.containsKey(c) && dicT.get(c).intValue()>windowT.get(c).intValue()) {
					formed--;
				}
				left++;
			}right++;

		}return strArray[0]==-1? "": s.substring(strArray[1],strArray[2]+1);
	}
}
