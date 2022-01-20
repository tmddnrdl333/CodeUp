package live01;

import java.util.Scanner;

public class CodeUp1492 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i < n; i++) {
			arr[i] += arr[i - 1];
		}

		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		}

	}
}
