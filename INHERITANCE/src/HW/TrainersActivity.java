package HW;

import java.util.Scanner;

public class TrainersActivity {

	public static void main(String[] args) {
	
		long employeeId, employeePhone,basicSalary;
		String employeeName, employeeAdress, designation;
		Scanner sc=new Scanner(System.in);
		
	    Trainee1 t1=new Trainee1(1234, "xys", "pune", 12345, 5000, "trainee");
	    t1.calculateSalary();
	    t1.calculateTransportAllowance();
        Manager1 m1=new Manager1(123,"xyz","pune", 12345l, 10000,"hr",88);
        m1.calculateSalary();
        m1.calculateTransportAllowance(); 
	}

}
