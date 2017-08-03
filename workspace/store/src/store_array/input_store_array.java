package store_array;

import java.util.ArrayList;
import java.util.Scanner;



public class input_store_array {

	public static void main(String[] args)
	{
		int[] myArray=getArray();
		findArray(myArray);

	}	
	
public static int[] getArray()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Sequence of numbers with one space:");
	String input=sc.nextLine();
	String[] stringArr=input.split(" ");
	final int SIZE=stringArr.length;
	int[] intArr=new int[SIZE];
	for(int i=0; i<SIZE; i++)
	{ intArr[i]=Integer.parseInt(stringArr[i]);
	}
	sc.close();
	return intArr;
}

public static void findArray(int [] a)
{
	ArrayList<Integer> uni=new ArrayList<Integer>();
	ArrayList<Integer> dup=new ArrayList<Integer>();
	ArrayList<Integer> temp=new ArrayList<Integer>();
	int k;

	for(int i=0; i<a.length; i++)
	{ 	 k=0;
		if (!temp.contains(a[i]))
			{ for(int j=i+1; j<a.length; j++)
					{if(a[i]==a[j])
						k=k+1;
					}
			}
		if (k==0)
			uni.add(a[i]);
		if (k==1) 
			dup.add(a[i]);
		
	}
	System.out.println("Duplicates No.:"+dup);
	System.out.println("Uniques:"+uni);
}
}


	
	
	
	

