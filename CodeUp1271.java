package live01;

import java.util.Scanner;

public class CodeUp1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short N = sc.nextShort();
		int max = 0;
		int num = 0;

		for (short i = 0; i < N; i++) {
			num = sc.nextInt();
			if (num > max)
				max = num;
		}
		System.out.println(max);
	}
}
