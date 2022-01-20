package live01;

import java.util.Scanner;

public class CodeUp3011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int i;
		int tmp;

		for (i = 0; i < n - 1; i++) {
			int cnt = 0;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					cnt++;
				}
			}
			if (cnt == 0)
				break;
		}
		System.out.println(i);

	}
}
