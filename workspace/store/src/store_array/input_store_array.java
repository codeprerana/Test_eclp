package store_array;

import java.util.ArrayList;

public class input_store_array {

	public static void main(String[] args) {
		
int a[]={4,5,5,8,4,4,4,4};
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
	
	

