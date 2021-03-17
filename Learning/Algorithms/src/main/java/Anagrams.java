package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Anagrams {
	public static void main(String[] arg) {
		String[] str={"eat","tea","tan","ate","nat","bat"};
		Anagrams obj=new Anagrams();
		//obj.groupAnagrams(str);
	}
	public List<List<String>> groupAnagrams(String[] strs) {
		 //carray;
		Map<Integer,Integer> obj=new Hashtable<Integer,Integer>();
		//obj.ge
        Map<String,List> mymap=new HashMap<String,List>();
        for(String s:strs){
        	char[] carray=s.toCharArray();
            Arrays.sort(carray);
            String key=String.valueOf(carray);
            if(!mymap.containsKey(key)){
                mymap.put(key,new ArrayList());
            }
            mymap.get(key).add(s);
        }
        return new ArrayList(mymap.values());
    }
}
