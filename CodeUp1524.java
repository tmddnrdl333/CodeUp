package live01;

import java.util.Scanner;

public class CodeUp1524 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte[][] slot = new byte[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				slot[i][j] = sc.nextByte();
			}
		}
		byte selRow = sc.nextByte();
		byte selCol = sc.nextByte();

		if (slot[selRow - 1][selCol - 1] == 1) {
			System.out.println(-1);
			return;
		}

		int result = 0;
		int rmin = (selRow == 1) ? 1 : selRow - 1;
		int rmax = (selRow == 9) ? 9 : selRow + 1;
		int cmin = (selCol == 1) ? 1 : selCol - 1;
		int cmax = (selCol == 9) ? 9 : selCol + 1;

		for (int r = rmin; r <= rmax; r++) {
			for (int c = cmin; c <= cmax; c++) {
				result += slot[r - 1][c - 1];
			}
		}
		System.out.println(result);

	}
}
