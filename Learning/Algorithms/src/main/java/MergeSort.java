package main.java;

import java.util.function.ToIntFunction;

public class MergeSort {
	void divide (int a[],int low, int rear)
	{
		if(low<rear)
		{
			int mid=(low+rear)/2;
			divide(a,low,mid);
			divide(a,mid+1,rear);
			
			merge(a,low,mid,rear);
		}
	}
	 
	void merge(int a[],int low,int mid, int rear)
	{
		int n1,n2;
		n1=mid-low+1;
		
		n2=rear-mid;
		
		int[] l = new int[n1];
		int[] r = new int[n2];
		
		for(int i=0;i<n1 ;i++)
			l[i]=a[i+low];
		
		for (int j=0;j<n2;j++)
			r[j]=a[j+mid+1];
		
		int i=0,j=0,k=low;
		while(i<n1 && j<n2)
		{
			if(l[i]<=r[j])
			{
				a[k]=l[i];
				i++;
			}
			else
			{
				a[k]=r[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
            a[k] = l[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            a[k] = r[j];
            j++;
            k++;
        }
	}
	
	public static void main(String[] arg)
	{
		int mainarray[]= {29,61,1,3,8,4};
		MergeSort ms= new MergeSort();
		ms.divide(mainarray,0,mainarray.length-1);
		for(int i=0;i<mainarray.length;i++)
		{
			System.out.println(mainarray[i]);
		}
		
	}

}
