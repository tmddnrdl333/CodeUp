package live01;

import java.util.Scanner;

public class CodeUp1166 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();

		if (inp % 4 == 0 && inp % 100 != 0 || inp % 400 == 0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
