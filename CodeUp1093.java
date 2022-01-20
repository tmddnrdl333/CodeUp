package live01;

import java.util.Scanner;

public class CodeUp1093 {
	public static void main(String[] args) {
		int[] num = new int[23];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] call = new int[n];
		for (int i = 0; i < n; i++) {
			call[i] = sc.nextInt();
		}
		sc.close();

		for (int e : call) {
			num[e - 1]++;
		}
		for (int i = 0; i < 23; i++) {
			System.out.printf("%d", num[i]);
			if (i == 22)
				break;
			System.out.print(" ");
		}

	}
}
