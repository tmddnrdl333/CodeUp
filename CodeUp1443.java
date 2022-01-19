package live01;

import java.util.Scanner;

public class CodeUp1443 {
	public static void main(String[] args) {
		int[] a = new int[10001];
		int temp;
		int key;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 1; i < n; i++) { // 1부터 시작이지만 끝까지 감 n-1회
			key = a[i];
			for (int j = i - 1; j > -1; j--) {
				if (a[j] > key) {
					a[j + 1] = a[j];
					a[j] = key;
				} else {
					break;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}