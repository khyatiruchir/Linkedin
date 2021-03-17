package main.java;

public class MaximizeSubarray {
	public static void main(String[] arg) {
		MaximizeSubarray obj=new MaximizeSubarray();
		int n[]= {-2,1,-3,4,-1,2,1,-5,4},sum=0;
		sum=obj.maxSubarray(n);
		System.out.print(sum);
		
	}
	int maxSubarray(int[] nums) {
		int sum=nums[0],i=0,max=nums[0];
		if(nums.length==1)
		{
			return nums[0];
		}
		
			//newsum=nums[0];
			while(i<nums.length) {
				sum=Math.max(sum+nums[i], nums[i]);
				max=Math.max(max, sum);
				i++;
			//return sum;
			
		}
		//return sum;
			return max;
	}
}
