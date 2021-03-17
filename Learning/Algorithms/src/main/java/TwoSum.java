package main.java;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class TwoSum {
	public static void main(String[] arg) {
		int a[]= {2,7,11,15},target=9;
		TwoSum obj=new TwoSum();
		int result[]=obj.funTwoSum(a, target);
		if(result.length==0)
			System.out.print("no valid match");
		
			
	}
	
	int[] funTwoSum(int[]a,int target) {
		int[] result=new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==target-a[i]) 
					return new int[] {i,j};
				
					
				
			}//return ;
		}return new int[] {};
		
	}//throw IllegalArgumentException("not valid input");
}
