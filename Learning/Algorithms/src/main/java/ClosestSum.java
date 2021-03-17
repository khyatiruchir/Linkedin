package main.java;

import java.util.Arrays;

public class ClosestSum {
	public static void main(String[] arg) {
		ClosestSum obj=new ClosestSum();
		int[] nums= {0,0,0};
		int target=1;
		System.out.print(obj.threeSumClosest(nums,target));
	}
	public int threeSumClosest(int[] nums, int target) {
        int low=0,high=nums.length-1,sum=0,diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
        	low=i+1;
        	while(low<high) {
        		sum=nums[i]+nums[low]+nums[high];
        		if(Math.abs(sum-target)<Math.abs(diff)) {
        			diff=sum;
        		}
        		if(sum<target) {
        			low++;
        		}
        		else {
        			high--;
        		}
        			
        	}
        }return target-diff;
        
    }
}
