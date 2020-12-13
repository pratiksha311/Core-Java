package HW;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	double salary;
	Employee(int id, String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
     

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee[] e=new Employee[3];
		for(int i=0;i<e.length;i++)
		{
			System.out.println("enter id ,name salarry");
			e[i] =new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		}
		for(int i=0;i<e.length;i++)
		{
			int large=i;
			for(int j=i+1;j<e.length;j++)
			{
				 if(e[i].salary<e[j].salary)
		    	 {
		    	Employee temp=e[i];
		    	 e[i]=e[j];
		    	 e[j]=temp;
		    	 }
			}
			
			
		}
		for(int i=0;i<e.length;i++)
		{
		e[i].toString();
		
		}
	}

}
