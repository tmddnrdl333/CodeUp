package live01;

import java.util.Scanner;

public class CodeUp1512 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] map = new int[n][n];

		int r = sc.nextInt() - 1;
		int c = sc.nextInt() - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = Math.abs(r - i) + Math.abs(c - j) + 1;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", map[i][j]);
			}
			System.out.println();
		}

	}
}
