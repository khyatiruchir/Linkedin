package main.java;

public class containerMaxWater {
	public static void main(String[] arg) {
		containerMaxWater obj=new containerMaxWater();
		int[] a={1,8,6,2,5,4,8,3,7};
		System.out.print(obj.maxArea(a));
	}
	
	public int maxArea(int[] height) {
        int max=0,curArea=0;
        int i=0,j=height.length-1;
        while(i<j) {
        	curArea=(j-i)*Math.min(height[i],height[j]);
        	max=Math.max(curArea, max);
        
        if(height[i]<height[j]) {
        	i++;
        }
        else {
        	j--;
        }
        }return max;
    }
}
