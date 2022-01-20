package live01;

import java.util.Scanner;

public class CodeUp1095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] call = new int[n];
		// input
		for (int i = 0; i < n; i++) {
			call[i] = sc.nextInt();
		}
		sc.close();
		int min = 23;
		for (int i = 0; i < n; i++) {
			min = (min>call[i])? call[i]:min;
		}
		System.out.println(min);

	}
}
