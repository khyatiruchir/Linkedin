package main.java;

public class LongestPalindrome {
	public static void main(String[] arg) {
		LongestPalindrome obj=new LongestPalindrome();
		String len= obj.LongPalindrome("abad");
		System.out.print(len);

	}
	public String LongPalindrome(String s) {
		int start=0, end=0;
		if(s==null || s.length()<0) return "";
		for(int i=0;i<s.length();i++) {
			int len1 = expandAroundCener(s, i, i); // 1 , 1
			int len2 = expandAroundCener(s, i, i+1); // 0 , 0
			int len = Math.max(len1, len2);
			
			if(len>end-start) {
				start= i - (len-1)/2; // 0 
				end= i + len/2;	// 0		
			}
			System.out.println("print all -- len1 : " +len1+  " || len2 : " +len1+  
					" || len :" +len1+ "|| start : " + start + " || end : " + end );
			System.out.println(s.substring(start,end+1));
		}

		return s.substring(start,end+1);
	}
	public int expandAroundCener(String s,int left, int right) {
		int L=left,R=right;
		while (L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)) {
			L--;
			R++;

		}
		return R-L-1; }

}
