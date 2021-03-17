package main.java;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	static Map<String, Integer> values=new HashMap<>();
	static {
		values.put("I",1);
        values.put("V",5);
        values.put("X",10);
        values.put("L",50);
        values.put("C",100);
        values.put("D",500);
        values.put("M",1000);
	}
	public static void main(String[] arg) {
		
		RomanToInt obj=new RomanToInt();
		System.out.print(obj.romanToInt("MDCXCV"));
	}
	
	 public int romanToInt(String s) {
	        
	        int curValue=0,nextValue=0,finalValue=0,i=0;
	      String curChar,nextChar;       
            while(i<s.length()) {
            	curChar=s.substring(i,i+1);
            	curValue=values.get(curChar);
            		if(i+2<=s.length()) {
            			nextChar=s.substring(i+1,i+2);
            			nextValue=values.get(nextChar);
            		}
                	
                	if(curValue<nextValue) {
                		finalValue+=nextValue-curValue;
                		i=i+2;
                	}
                	else {
                		finalValue+=curValue;
                		i++;
                	}         	
            	
            }return finalValue;
	 }

}
