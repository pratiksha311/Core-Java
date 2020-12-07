package CW;

import java.util.Scanner;

public class Practice {
	
	int top=-1;
	int[] stack=new int[5];
	void stackDemo()
	{
		for(int i=0;i<stack.length;i++)
		{
			stack[i]=-1;
		}
	}
	void push(int n)
	{
		if(top==(stack.length-1))
		{
			System.out.println("stack is full");
		}
		else
		{
			top++;
			stack[top]=n;
			System.out.println("inserted value");
		}
	}

    int pop()
	{
    	int n=0;
    	if(top==-1)
    	{
    		System.out.println("stack is empty");
    		return -1;
    	}
    	else
    	{
		    n=stack[top];
		    stack[top]=-1;
		    top--;
    	}
    	return n;
	}
    void dispaly()
    {
    	if(stack[top]==-1)
    	{
    		System.out.println("stack is empty");
    	}
    	else
    	{
    		for(int i=1;i<top;i++)
    		{
    			System.out.print(stack[i]);
    		}
    	}
    }
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Practice p1=new Practice();
		int ch;
		System.out.println("enter choice:");
		System.out.println("1:push");
		System.out.println("2:pop");
		System.out.println("3:display");
		ch=sc.nextInt();
		switch(ch)
		{
	
		case 1:p1.push(10);
		        p1.push(20);
		        p1.push(30);
		         p1.push(40);
	         	p1.push(50);
		     p1.push(60);
		     break;
		case 2:int x=p1.pop();
		       System.out.println("deleted");
		       int y=p1.pop();
		    		   System.out.println("deleted");
		    		   break;
		       
		case 3:p1.dispaly();
		
		default :System.out.println("enter correct choice");
		  break;
		
		}
	
		
	}

}
