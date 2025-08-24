import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int[] N = new int[sc.nextInt()];
		int a = 0;
		int b = 0;
		int sum = 0;
		while (true) {
			for (int i = 0; i < N.length; i++) {
				a = sc.nextInt();
				b = sc.nextInt();
				sum += a * b;
//			System.out.println(N.length);
			}
//			System.out.println(sum);
//			System.out.println(X);
//			System.out.println(N.length);
//			System.out.println(b);
			if (X == sum) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			break;
		}
		sc.close();
	}
}
