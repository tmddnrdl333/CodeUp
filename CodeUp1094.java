package live01;

import java.util.Scanner;

public class CodeUp1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] call = new int[n];

		for (int i = 0; i < n; i++) {
			call[i] = sc.nextInt();
		}

		int tmp;
		sc.close();
		for (int i = 0; i < n / 2; i++) {
			tmp = call[i];
			call[i] = call[n - i - 1];
			call[n - i - 1] = tmp;
		}

		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", call[i]);
		}
	}
}
