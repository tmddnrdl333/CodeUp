package live01;

import java.util.Scanner;

public class CodeUp1099 {
	public static void main(String[] args) {

		// 10*10 입력
		Scanner sc = new Scanner(System.in);
		byte[][] map = new byte[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				map[i][j] = sc.nextByte();
			}
		}

		// 개미 출발위치
		int antI = 1;
		int antJ = 1;
		boolean flag = true;

		// 출발
		while (flag) {
			if (map[antI][antJ]==2)
				flag = false;
			map[antI][antJ] = 9;
			if (map[antI + 1][antJ] == 1 && map[antI][antJ+1] == 1) {
				flag = false;
			} else if (map[antI][antJ + 1] == 1) {
				antI++;
			} else {
				antJ++;
			}
		}

		// 출력.
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(map[i][j]);
				if (j != 9)
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
