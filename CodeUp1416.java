package live01;

import java.util.Scanner;

public class CodeUp1416 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		byte[] arr = new byte[32];

		for (int i = 31; i >= 0; i--) {
			if (n / (int) Math.pow(2, i) == 1) {
				arr[i]++;
				n -= (int) Math.pow(2, i);
			}
		}

		int first = 0;
		for (int i = 31; i >= 0; i--) {
			if (arr[i] == 1)
				first++;
			if (first > 0) {
				System.out.print(arr[i]);
			}
		}
		if (first == 0)
			System.out.println("0");
	}
}
