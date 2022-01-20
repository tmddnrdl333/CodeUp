package live01;

import java.util.Scanner;

public class CodeUp1098 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] map = new int[r][c];
		int n = sc.nextInt();
		int[][] info = new int[n][4];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				info[i][j] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			if (info[i][1] == 0) {
				for (int j = 0; j < info[i][0]; j++) {
					map[info[i][2] - 1][info[i][3] - 1 + j] = 1;
				}
			} else {
				for (int j = 0; j < info[i][0]; j++) {
					map[info[i][2] - 1 + j][info[i][3] - 1] = 1;
				}
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.printf("%d ", map[i][j]);
			}
			System.out.println();
		}
	}
}
