package live01;

import java.util.Scanner;

public class CodeUp1507 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		boolean[][] map = new boolean[100][100];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < arr[i][2] - arr[i][0]; j++) {
				for (int k = 0; k < arr[i][3] - arr[i][1]; k++) {
					map[arr[i][0]+j][arr[i][1]+k] = true;
				}
			}
		}
		
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(map[i][j]==true)
					sum++;
			}
		}
		System.out.println(sum);

	}
}
