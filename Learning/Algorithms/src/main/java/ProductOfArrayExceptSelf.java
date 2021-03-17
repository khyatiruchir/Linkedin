package main.java;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	public static void main(String[] arg) {
		ProductOfArrayExceptSelf obj=new ProductOfArrayExceptSelf();
		int[] nums= {1,2,3,4};
		int[] result=obj.productExceptSelf(nums);
		
	}
	public int[] productExceptSelf(int[] nums) {
        int[] right=new int[nums.length];
        int[] left=new int[nums.length];
        int[] result=new int[nums.length];
        
        left[0]=1;
        for(int i=1;i<nums.length;i++) {
        	left[i]=left[i-1]*nums[i-1];
        }
        
        right[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--) {
        	right[i]=nums[i+1]*right[i+1];
        }
        
        for(int i=0;i<nums.length;i++) {
        	result[i]=left[i]*right[i];
        }
        
        return result;
    }
}
