package all;

public class ArraySmallestLargestValue 
{
	static int a[]={12,65,96,82,34,23,16,6};
    //method for  number
	static int largest()
	{
		int i;
		int max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
			    max=a[i];
			}
		}
		return max;
		
	}
	static int lowest()
	{
		int i;
		int min=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
			    min=a[i];
			}
		}
		return min;
		
	}
	public static void main(String[] args) 
	{
		
		System.out.println("largest number"+ largest());
		System.out.println("lowest number"+ lowest());

	}

}
