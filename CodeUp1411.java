package live01;

import java.util.Scanner;

public class CodeUp1411 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		// 1안 - 정직하게 1부터 N까지, 카드 더미에 있는지 찾기

		outer: for (int cmp = 1; cmp <= N; cmp++) {
			boolean flag = false;
			for (int j = 0; j < N - 1; j++) {
				if (arr[j] == cmp) {
					flag = true;
					continue outer;
				}
			}
			if (flag == false) {
				System.out.println(cmp);
				break;
			}
		}
		
		// 2안 - (잃어버리기 전의 합-지금 합)
		
//		int sum=0;
//		for(int i =0;i<N-1;i++) {
//			sum+=arr[i];
//		}
//		System.out.println(N*(N+1)/2-sum);
		

	}
}
