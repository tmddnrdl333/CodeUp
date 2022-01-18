package live01;

import java.util.Scanner;

public class CodeUp1278 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int n = sc.nextInt();

		while (true) {
			if (n / ((int) Math.pow(10, i)) == 0)
				break;
			i++;
		}
		System.out.println(i);
	}
}
