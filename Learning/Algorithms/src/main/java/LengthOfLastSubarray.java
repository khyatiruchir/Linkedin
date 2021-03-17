package main.java;

public class LengthOfLastSubarray {
	public static void main(String[] arg) {
		LengthOfLastSubarray obj=new LengthOfLastSubarray();
		System.out.print(obj.LengthofArray("d"));
	}
	
	int LengthofArray(String s) {
		s=s.trim();
		int length=0;
		if(s.length()==0)
		{
			return 0;
		}
		/*if(s.length()==1)
		{
			return 1;
		}
*/		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ') {
				break;
			}length=s.length()-i;
		}return length;
	}
}
