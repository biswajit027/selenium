package all;

import java.util.Arrays;

public class ArraySmallestLargestValue2 
{
	public static int getSmallest(int[] a,int total)
	{
		Arrays.sort(a);
		return a[0];
	}
	public static int getLargest(int[] a,int total)
	{
		Arrays.sort(a);
		return a[total-1];
	}


	public static void main(String[] args) 
	{
	 int a[]={12,56,82,24,96,4,249,19};
	 System.out.println("Get Smallest:"+ getSmallest(a,8));
	 System.out.println("Get largest:"+ getLargest(a,8));
	}

}
