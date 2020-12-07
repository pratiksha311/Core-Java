package HW_method;

public class MessagePrinter {
	String msg;
	void printMeassage(String message)
	{
		msg=message;
	}
	void display()
	{
		System.out.println(msg);
	}
	public static void main(String args[]) {
		
		MessagePrinter m=new MessagePrinter();
		m.printMeassage("welcome");
		m.display();
		
	}

}
