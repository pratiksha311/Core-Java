package HW;

import java.util.ArrayList;

public class SortArrayList_Without_Using_sort_method {
	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer> ();
		a1.add(5);
		a1.add(6);
		a1.add(4);
		a1.add(9);
	
		Object[] o=a1.toArray();
		System.out.println("before sorting : \n");
		for(int i=0;i<o.length;i++)
		{
			System.out.print(o[i]+" ");
		}
			    
		for(int i=0;i<o.length;i++)
		{
			for(int j=i+1;j<o.length;j++)
			{
	
				if((int)o[i]>(int)o[j])
				{
					int temp=(int)o[i];
					o[i]=o[j];
				    o[j]=temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("After sorting : \n");
		for(int i=0;i<o.length;i++)
		{
			System.out.print(o[i]+" ");
		}
	}
}
