import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//	    	1. 문자열 S를 입력 받음.
//	    	2. 각 문자를 R 번 반복.
//	    	3. 새 문자열 P를 만들어서 출력.
//	    	1. 문자열을 입력 받음.
        Scanner sc = new Scanner(System.in);
        int c = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < c; i++) {
            String[] input = sc.nextLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String S = input[1];

            char[] a = new char[S.length()];
            String P = "";

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    P += S.charAt(j);
                }
            }

            System.out.println(P);
        }
    }
}
