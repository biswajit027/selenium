package all;

import java.util.Comparator;
import java.util.TreeSet;

public class InsertTreesetDescending implements Comparator
{
	public int compare(Object obj1, Object obj2) 
	{
		Integer a=(Integer)obj1;
		Integer b=(Integer)obj2;
		if(a<b)
		{
			return +1;
		}
		else if(a>b)
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet(new InsertTreesetDescending());
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		t.add(10);
		System.out.println(t);

	}

	

}
