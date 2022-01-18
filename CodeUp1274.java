package live01;

import java.util.Scanner;

public class CodeUp1274 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int prime = 0;
		
		for (int i = num; i > 0; i--) {
			if (num%i==0)
				prime++;
		}
		if(prime<=2)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
}
