import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] N = new String[Integer.parseInt(sc.nextLine())];

		for (int i = 0; i < N.length; i++) {
			N[i] = sc.nextLine();
		}

		char a = 64;
		char b = 64;
		for (int j = 0; j < N.length; j++) {
			if (N.length == 1) {
				System.out.print(a);
				System.out.println(a);
			} else {
				a = N[j].charAt(0);
				b = N[j].charAt(N[j].length() - 1);
			}
			System.out.println(String.valueOf(a) + String.valueOf(b));
		}

		// 스캐너를 닫음.
		sc.close();
	}
}