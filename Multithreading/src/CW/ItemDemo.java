package CW;

public class ItemDemo {

	public static void main(String[] args) {
		
		Item t=new Item();
		Producer1 p1=new Producer1(t);
		Consumer1 c1=new Consumer1(t);
		
		p1.start();
		c1.start();

	}

}
