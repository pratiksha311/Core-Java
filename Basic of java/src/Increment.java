
public class Increment {

	public static void main(String[] args) {
		int k=2;
		k=k++ - ++k + k-- - k++ + ++k -k--  + --k +k+ k-- -k + --k + k++; 
		System.out.println(k);
	}

}
