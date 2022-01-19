package live01;

import java.util.Scanner;

public class CodeUp1442 {
	public static void main(String[] args) {
		int[] a = new int[10001];
		int temp, min;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// input
		for (int i = 1; i <= n; i++) {
			a[i - 1] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i + 1; j < n ; j++) {
				min = (a[j] < a[min]) ? j : min;
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

		for (int i = 0; i < n; i++)
			System.out.println(a[i]);

	}
}
