package main.java;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversation {
	public static void main(String[] arg) {
		ZigZagConversation obj=new ZigZagConversation();
		System.out.print(obj.convert("PAYPALISHIRING", 3));
	}
	public String convert(String s, int numRows) {
        List<StringBuilder> rows=new ArrayList<>();
        int curRow=0;
        boolean goingDown=false;
        for(int i=0;i<numRows;i++) {
        	rows.add(new StringBuilder());
        }
        for (char  c : s.toCharArray()) {
			rows.get(curRow).append(c);
			if(curRow==0 || curRow==numRows-1) {
				goingDown= !goingDown;
			}
			curRow+=goingDown? 1:-1;
		} 
        
        StringBuilder str=new StringBuilder();
        for (StringBuilder row : rows) {
			str.append(row);
		}
        return str.toString();
    }
}
