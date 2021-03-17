package main.java;

public class InsertionSort {
 
	public static void main(String[] args)
	{
		int a[]= {4,6,3,2,1,9,7};
		int holeposition,valuetoinsert;
		for (int i=0;i<7;i++)
		{
			valuetoinsert=a[i];
			holeposition=i;
			while(holeposition>0 && a[holeposition]-1>valuetoinsert)
			{
				a[holeposition]=a[holeposition-1];
				holeposition--;
			}
			if(holeposition!=i)
				a[holeposition]=valuetoinsert;
		}
		for(int i=0;i<7;i++)
		{
			System.out.println(a[i]);
		}
	}
}
