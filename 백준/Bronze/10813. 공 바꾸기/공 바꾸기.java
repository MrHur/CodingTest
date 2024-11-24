import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[sc.nextInt()];
		int M = sc.nextInt();

		int j;
		int c = 0;
		for (int i = 0; i < N.length; i++) {
			N[i] = i + 1;
		}
		for (j = 0; j < M; j++) {
			int a = sc.nextInt(); // 1
			int b = sc.nextInt(); // 3
			c = N[a - 1];
			N[a - 1] = N[b - 1];
			N[b - 1] = c;
		}
		for (j = 0; j < N.length; j++) {
			System.out.print(N[j] + " ");
		}
		sc.close();
	}
}
