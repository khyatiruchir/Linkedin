package main.java;

public class NumberToWords {
	public static void main(String[] arg) {
		NumberToWords obj=new NumberToWords();
		System.out.print(obj.numberToWords(123));
		
	}
	public String numberToWords(int num) {
		String str="";
        int billion=num/1000000000;
        int million=(num-billion*10000000)/1000000;
        int thousand=(num-billion*10000000-million*1000000)/1000;
        int rest=num-billion*10000000-million*1000000-thousand*1000;
        if(billion!=0) 
        	str=three(billion)+ " billion ";
        if(million!=0) {
        	if(!str.isEmpty())
        		str+=three(million)+ " milliion ";
        }
        if(thousand!=0) {
        	if(!str.isEmpty())
        		str+=three(thousand)+ " thousand ";
        }
        if(rest!=0) {
        		str+=three(rest);
        }
        return str;
        
    }
	public String one(int num) {
		switch(num) {
		case 1: return "one";
		case 2: return "two";
		case 3: return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";
		case 9: return "nine";
		default: return "";
		}		
	}
	public String twoLessThanTwenty(int num) {
		switch(num) {
		case 10: return "ten";
		case 11: return "eleven";
		case 12: return "twelve";
		case 13: return "thirteen";
		case 14: return "fourteen";
		case 15: return "fifteen";
		case 16: return "sixteen";
		case 17: return "seventeen";
		case 18: return "eightteen";
		case 19: return "nineteen";
		default: return "";
		}
	}
	
	public String ten(int num) {
		switch(num) {
		case 20: return "twenty ";
		case 30: return "thirty ";
		case 40: return "fourty ";
		case 50: return "fifty ";
		case 60: return "sixty ";
		case 70: return "seventy ";
		case 80: return "eighty ";
		case 90: return "ninety ";
		default: return "";
		}
	}
	
	public String two(int num) {
		String res;
		if(num<20) {
			res=twoLessThanTwenty(num);
		}
		else if(num<10) {
			res=one(num);
		}
		else {
			int tenth=num/10;
			int rest=num-tenth*10;
			if(rest!=0)
				res=ten(tenth*10)+one(rest);
			else
				res=ten(tenth*10);
		}
		return res;
	}
	
	public String three(int num) {
		int hundred=num/100;
		int rest=num-hundred*100;
		String res="";
		if(hundred!=0) {
			res=one(hundred)+" hundred "+two(rest);
		}
		else
			res=one(hundred);
		return res;
	}
}
