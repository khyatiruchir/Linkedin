package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
	public static void main(String[] arg) {
		Sum obj=new Sum();
		int[] nums= {-4,-1,-1,0,1,2};
		List<List<Integer>> res=obj.threeSum(nums);
		
	}
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res= new ArrayList<>();
		Arrays.sort(nums);
        for(int i=0;i<nums.length && nums[i]<0;i++) {
        	if(nums[i]!=nums[i+1]  || i==0) {
        		twoSum(nums,i,res);
        	} 	
        }return res;
    }
	
	void twoSum(int[] nums,int i,List<List<Integer>> res) {
		List<Integer> vlu=new ArrayList<>();
		int low=i+1,high=nums.length-1,sum;
		while(low<high) {
			sum=nums[i]+nums[low]+nums[high];
			if(sum<0) {
				low++;
			}
			else if(sum>0) {
				high--;
			}
			else {
				res.add(Arrays.asList(nums[i],nums[low],nums[high]));
				while(low<high && nums[i]==nums[i-1])
					i++;
			}
				
		}
	}

}
