package main.java;

public class BubbleSort {
	int a[];
	public BubbleSort(int []a){
		this.a=a;
		
	}
	public void sort(int[] a)
	{
		int temp=0,i,j;
		boolean flag=false;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=false;
				}
				else
				{
					flag=true;
				}
			}
		}
		//return a;
		
	}
	public static void main(String []arg)
	{
		System.out.println("in main");
		int a[]= {5,6,8,9,1,4,6};
		BubbleSort bs=new BubbleSort(a);
		bs.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("BubbleSort.main()");
		
	}
}

