package HW;

import java.util.Scanner;

public class sort_number_36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first String");
		String s1 = new String(sc.next());
		char[] c1 = s1.toCharArray();
		char temp;
		for (int i = 0; i < c1.length; i++) {
			for (int j = i + 1; j < c1.length - 1; j++) {
				// System.out.println(c1[i]);

				if (c1[i] > c1[j]) {
					temp = c1[i];
					c1[i] = c1[j];
					c1[j] = temp;
				}
			}
		}
		for (int i = 0; i < c1.length; i++) {
			System.out.print(c1[i]);
		}

	}

}
