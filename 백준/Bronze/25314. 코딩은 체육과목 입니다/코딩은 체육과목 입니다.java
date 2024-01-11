import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a/4;
		for(int i=0; i<b; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		// 스캐너를 닫음.
		sc.close();
	}
}
