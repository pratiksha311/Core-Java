package HW;

import java.util.Scanner;

public class Employee2 {


		private int id;
		private String name;
		private double salary;
		private Employee2(int id, String name,double salary)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
			
		}
		

		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public double getSalary() {
			return salary;
		}

		void display() 
		{
			System.out.println("Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]");
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Employee2[] e=new Employee2[3];
			for(int i=0;i<e.length;i++)
			{
				System.out.println("enter id ,name salarry");
				e[i] =new Employee2(sc.nextInt(), sc.next(), sc.nextDouble());
			}
			for(int i=0;i<e.length;i++)
			{
				int large=i;
				for(int j=i+1;j<e.length;j++)
				{
					 if(e[i].getSalary()<e[j].getSalary())
			    	 {
			    	 Employee2 temp=e[i];
			    	 e[i]=e[j];
			    	 e[j]=temp;
			    	 }
			     }		
			}
			for(int i=0;i<e.length;i++)
			{
				e[i].display();
			}
			for(int i=0;i<e.length;i++)
			{
				int large=i;
				for(int j=i+1;j<e.length;j++)
				{
					 if(e[i].getId()>e[j].getId())
			    	 {
			    	Employee2 temp=e[i];
			    	 e[i]=e[j];
			    	 e[j]=temp;
			    	 }
			     }		
			}
			for(int i=0;i<e.length;i++)
			{
				e[i].display();
			}
			
			
			}
			
			
		}


