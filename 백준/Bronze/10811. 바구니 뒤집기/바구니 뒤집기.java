import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[sc.nextInt()];
        int M = sc.nextInt();

        for (int i = 0; i < N.length; i++) {
            N[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 입력 받은 범위(a부터 b)의 배열을 역순으로 바꿈
            for (int k = 0; k < (b - a + 1) / 2; k++) {
                int temp = N[a - 1 + k];
                N[a - 1 + k] = N[b - 1 - k];
                N[b - 1 - k] = temp;
            }
        }

        for (int j = 0; j < N.length; j++) {
            System.out.print(N[j] + " ");
        }

        // 스캐너를 닫음.
        sc.close();
	}
}
