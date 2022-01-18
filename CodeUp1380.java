package live01;

import java.util.Scanner;

public class CodeUp1380 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int first=1;

		if (k>7)
			first = k-6;
		for (int i = first; i <= k-first; i++) {
			System.out.println(i+" "+(k-i));
		}
	}
}