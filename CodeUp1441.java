package live01;

import java.util.Scanner;

public class CodeUp1441 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10001];
		int temp;
		int n = sc.nextInt(); // 개수

		for (int i = 1; i <= n; i++) {
			a[i - 1] = sc.nextInt();
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++)
			System.out.println(a[i]);
	}
}
