package main.java;

public class AtoI {
	public static void main(String[] arg) {
		AtoI obj=new AtoI();
		int len=obj.myAtoi("0032");
		System.out.print(len);
	}
	public int myAtoi(String s) {
        if(s.length()==0 || s=="") return 0;
        int i=0, sign=1,result=0;
        while(s.charAt(i)==' ') 
        	 i++;
        if(s.charAt(i)=='+'|| s.charAt(i)=='-') {
        		if(s.charAt(i)=='-') sign=0;
        	}
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9') {
        	if(result>Integer.MAX_VALUE/10 ||
        			result==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>Integer.MAX_VALUE%10){
        				return (sign==1)? Integer.MAX_VALUE:Integer.MIN_VALUE;
        			}
        	result=result*10+s.charAt(i++)-'0';
        
        }return result*sign;
    }
}
