import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] N = new int[sc.nextInt()];
		int[] M = new int[sc.nextInt()];
		for(int i = 0; i<M.length; i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
			for(int j=a-1; j<=b-1; j++) {
				N[j]=c;
			}			
		}
		for(int i=0; i<N.length; i++) {
		System.out.print(N[i]+" ");
		}	    
		sc.close();
    }
}
