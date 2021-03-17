package main.java;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
	public static void main(String[] args) {
		FindMissingNumber obj=new FindMissingNumber();
		int[] nums= {1,3,0};
		System.out.print(obj.missingNumber(nums));
	}
	
	public int missingNumber(int[] nums) {
        Set<Integer> mySet=new HashSet<Integer>(); 
        int lenSet;
        for(int i:nums) {
        	mySet.add(i);
        }
        lenSet=mySet.size();
        for(int i=0;i<lenSet;i++) {
        	if(!mySet.contains(i))
        		return i;
        }return -1;
	}

	
}
