package live01;

import java.util.Scanner;

public class CodeUp1097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] map = new int[19][19];
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		int[][] inp = new int[n][2];

		for (int i = 0; i < n; i++) {
			inp[i][0] = sc.nextInt();
			inp[i][1] = sc.nextInt();
		}
		sc.close();

		//
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 19; j++) {
				map[inp[i][0] - 1][j] = (map[inp[i][0] - 1][j] == 1) ? 0 : 1;
			}
			for (int j = 0; j < 19; j++) {
				map[j][inp[i][1] - 1] = (map[j][inp[i][1] - 1] == 1) ? 0 : 1;
			}
		}
		//

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.printf("%d ", map[i][j]);
			}
			System.out.println();
		}
	}
}
