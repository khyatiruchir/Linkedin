package main.java;

public class CountAndSay {
	
	public static void main(String[] arg) {
		CountAndSay c=new CountAndSay();
		String retString=c.countSay(1);
		System.out.print(retString);
	}
	public String countSay(int n) {
		String output="",inputStr;
		char cur,next=' ';
		int counter=1,i=0;
		inputStr=Integer.toString(n);
		while(i<inputStr.length()) {
			cur=inputStr.charAt(i);
			if(i!=inputStr.length()-1)
				next=inputStr.charAt(i+1);
			else {
				if(inputStr.length()==1)
					output=output+cur;
				else 
					output=output+counter+cur;
				break;
			}
			if(cur==next) {
				counter++;
			}
			else {
				output=output+counter+cur;
				counter=1;
			}
			i++;
		}
			
		
		return output;
	}
}
