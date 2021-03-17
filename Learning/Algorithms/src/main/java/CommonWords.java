package main.java;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonWords {
	public static void main(String[] arg) {
		CommonWords obj=new CommonWords();
		String paragraph="Bob hit a ball, the hit BALL";
		String[] banned={"hit"};
		System.out.print(obj.mostCommonWord(paragraph,banned));
	}
	public String mostCommonWord(String paragraph, String[] banned) {
        String trmString=paragraph.replace("[^a-zA-Z0-9 ]", " ").toLowerCase();
        Map<String,Integer> mapWords= new HashMap<String,Integer>();
        Set<String> mapBanned=new HashSet<String>();
        char c;
        int i=0;
        int len=0;
        for(String str:banned) {
        	mapBanned.add(str);
        }
        while(i<trmString.length()) {
        	c=trmString.charAt(i);
        	if(c==' ') {
        		String str=trmString.substring(len,i);
        		if(!mapBanned.contains(str))
        			mapWords.put(str,mapWords.getOrDefault(str,0)+1);
        		len=i;
        	}i++;
        }
        return Collections.max(mapWords.entrySet(),Map.Entry.comparingByValue()).getKey();
 
// @formatter:on

    }
}
