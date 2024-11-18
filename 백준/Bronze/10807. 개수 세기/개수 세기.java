import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count=0;
//		System.out.println("N의 갯수");
//		System.out.println(N);
		int[] A = new int[N];
//		System.out.println("A 배열의 길이");
//		System.out.println(A.length);
		for(int i = 0; i<A.length; i++) {
			A[i]= sc.nextInt();
		}
		int X = sc.nextInt();
		for(int i = 0; i<A.length; i++) {
			if (A[i]==X) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
