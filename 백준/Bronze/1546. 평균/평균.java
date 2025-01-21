import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[sc.nextInt()];

		double sum = 0;
		double avg = 0;
		for (int i = 0; i < N.length; i++) {
			N[i] = sc.nextInt();
			sum += N[i];
		}
		avg = sum / N.length;
		int max = 0;
		double newAvg = 0;

		for (int j = 0; j < N.length; j++) {
			if (N[j] > max) {
				max = N[j];
			}
			newAvg = avg / max * 100;
		}
		System.out.print(newAvg);

		// 스캐너를 닫음.
		sc.close();
	}
}
