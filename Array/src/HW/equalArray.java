package HW;

public class equalArray {

	public static void main(String[] args) {
		int count=0;
		int a[]= {12,66,99,44,7,8};
		int b[]= {12,66,99,44,7,45};
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=0;j<a.length;j++)
	    	{
	    		if(a[i]==b[j])
	    		{
	    			count++;
	    			
	    		}
	    	}
	    }
	    System.out.println(count);
	    if(count==a.length)
	    {
	    	System.out.println("equal");
	    }
	    else
	    {
	    	System.out.println("not equal");
	    }
	   

	}

}
