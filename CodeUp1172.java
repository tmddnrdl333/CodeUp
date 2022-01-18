package live01;

import java.util.Scanner;

public class CodeUp1172 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < b && a < c) {
			System.out.print(a + " ");
			if (b < c)
				System.out.print(b + " " + c);
			else
				System.out.println(c + " " + b);
		} else if (b < c) {
			System.out.print(b + " ");
			if (c < a)
				System.out.print(c + " " + a);
			else
				System.out.println(a + " " + c);
		} else {
			System.out.print(c + " ");
			if (b < a)
				System.out.println(b + " " + a);
			else
				System.out.println(a + " " + b);
		}

	}
}
