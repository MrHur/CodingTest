import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * 문제 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
		 * 
		 * 입력 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		 * 
		 * 출력 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
		 */
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
//	  *******
//	   *****
//	    ***
//	     *

//		공백 4개 / 별 1개
//		공백 3개 / 벌 3개
//		공백 2개 / 별 5개
//		공백 1개 / 별 7개
//		공백 0개 / 별 9개 (2*a-1)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

        // 위쪽 피라미드
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < a - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 역피라미드
        for (int i = 1; i < a; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (a - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

}
