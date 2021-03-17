package main.java;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {4,6,7,9,0,1,3,5},temp;
		for (int i=0;i<a.length;i++)
		{
			int indexmin=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[indexmin])
					indexmin=j;
			}
				if(i!=indexmin)
				{
					temp=a[indexmin];
					a[indexmin]=a[i];
					a[i]=temp;
				}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
