package all;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		//Reverse a string in java
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			rev=rev+c;
		}
		System.out.println(rev);

	}

}
