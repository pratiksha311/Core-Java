package CW;

import java.util.Scanner;

public class StackDemo {
	
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
	    		System.out.println("stack is overflow");
	    	}
	    	else
	    	{
	    		top++;
	    		stack[top]=n;
	    		System.out.println(n+" is inserted");
	    	}
	    }
	    int  pop()
	    {
	    	int  n1=0;
	    	if(top==-1)
	    	{
	    		System.out.println("stack is empty");
	    		return -1;
	    	}
	    	else
	    	{
	    		
	    	n1=stack[top];
	    	stack[top]=-1;
	    	top--;
	    	
	    	}
	    	return n1;
	    
	    }
	    void display()
	    {
	    	if(top==-1)
	    	{
	    		System.out.println("stack is empty");
	    	}
	    	else
	    	{
	    		for(int i=0;i<=top;i++)
	    		{
	    			System.out.println(stack[i]);
	    		}
	    	}
	    }
		public static void main(String[] args) {
			
			int ch;
			Scanner sc=new Scanner(System.in);
			do {
			System.out.println("enter the choice :");
			System.out.println("1:push");
			System.out.println("2:pop");
			System.out.println("3:display");
			 ch=sc.nextInt();
			StackDemo s1=new StackDemo();
			switch(ch)
			{
			case 1 :
			s1.push(10);
			s1.push(20);
			s1.push(30);
			s1.push(40);
			s1.push(50);
			s1.push(50);
			break;
			
			case 2:
			int x=s1.pop();
			System.out.println(x +" is a deleted ");
			int y=s1.pop();
			System.out.println(y +" is a  deleted ");
			break;
			
			case 3:
				s1.display();
				break;
				
			default:System.out.println("enter correct choice");
			}
			System.out.println("Do u want to continue press 0/1");
			ch=sc.nextInt();
		
		}while(ch>0);
		}
		

}
