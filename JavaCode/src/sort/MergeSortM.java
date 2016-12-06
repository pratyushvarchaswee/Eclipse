package sort;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

public class MergeSortM {

	public static void main(String[] args) {
		
		int [] arr={2,4,1,6,8,5,3,7};
		
		int i=0;
		while(i<arr.length)
		{
		System.out.print( arr[i]);
		i++;
		}
     mergeSort(arr);
       i=0;
       System.out.println();
		while(i<arr.length)
		{
		System.out.print(arr[i]);
		i++;
		}
	}
	
	
	public static void mergeSort(int [] arr)
	{
		int n= arr.length;
		int mid=n/2;
		if(n<2)return;
		int [] l= new int[mid];
		int [] r= new int[n-mid];
		int [] a=new int[n];
		int i=0;
		while(i <mid)
		{
			l[i]=arr[i];
			i++;
			
		}
		
		 i=mid;
		 int j=0;
		while(i <n-1)
		{
			r[j]=arr[i];
			j++;
			i++;
			
		}
		
		mergeSort(l);
		mergeSort(r);
		merge(l,r,a);
	}

	public static void merge(int [] l,int [] r, int [] a)
	{
		int nl=l.length;
		int rl=r.length;
		int al=a.length;
		int i=0,j = 0,k=0;
		
		while(i<nl && j<rl)
		{
			if(l[i]<r[j])
			{
				a[k]=l[i];
				i++;
				k++;
				
			}
			else
			{
				a[k]=r[j];
				k++;
				j++;
				
			}
		}
		
		while(i<nl){
			a[k]=l[i];
			i++;
			k++;
		}
		
		while(j<rl){
			a[k]=l[j];
			j++;
			k++;
		}
		System.out.println();
		new ConcurrentHashMap<String,String>();
		
	}
}
