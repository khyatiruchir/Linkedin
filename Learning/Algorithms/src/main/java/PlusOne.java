package main.java;

public class PlusOne {
	public static void main(String[] arg) {
		PlusOne obj=new PlusOne();
		int[] nums= {9,9};
		obj.plusOne(nums);
		for(int i=0;i<nums.length;i++) {
		System.out.println(nums[i]);
		}
	}
	
	int[] plusOne(int[] digits) {
		
		int lastDigit=digits[digits.length-1];
		if(lastDigit==9)
		{
			digits[digits.length-1]=0;
			digits[digits.length-2]++;
		}
		else {
				digits[digits.length-1]=++lastDigit;
		}
		return digits;
	}
}
