import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// 단어의 개수
		/*
		 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. -> String 이 문자열에는 몇 개의 단어가 있을까? (한 단어가 여러 번
		 * 등장하면 등장한 횟수만큼 모두 세어야 한다. 공백을 기준으로 단어의 갯수를 check -> 단어의 갯수 = 공백의 갯수 + 1 입력받은
		 * string 을 charAt 으로 한 글자씩 받아서 if 문에서 값이 " " 공백일 경우 count++ print 문으로 count + 1
		 * 출력
		 */

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		// st 에 공백을 기준으로 나눈 토큰들을 st 에 저장한다
		StringTokenizer st = new StringTokenizer(S," ");
		
		// countTokens() 는 토큰의 개수를 반환한다
		System.out.println(st.countTokens());	
	}
}
