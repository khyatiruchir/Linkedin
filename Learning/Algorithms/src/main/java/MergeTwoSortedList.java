package main.java;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedList {
 
	public static void main(String[] arg) {
		int[] a= {6,8,1,4};
		int[] b= {5,0,2};
		List<Integer> mergelist=new ArrayList<Integer>();
		int i=0,j=0;
		while(i<a.length) {
			while(j<b.length) {
				if(a[i]<b[j]) {
					mergelist.add(a[i]);
					i++;
				}
				else{
					mergelist.add(b[j]);
					j++;
				}
			}
		}
		for(int k=0;i<mergelist.size();k++) {
			System.out.println(mergelist.get(k));
		}
		
	}
}
