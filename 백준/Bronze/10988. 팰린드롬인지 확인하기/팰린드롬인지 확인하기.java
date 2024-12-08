import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
//		팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
//		level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
				
//		홀수일 때랑 짝수일 때가 다른가? 같다고 보고 구현을 해보자
//		string 으로 받은 문자열을 charAt 으로 받아와서 index 0번이랑 마지막꺼랑 비교하면 되는데
//              charAt 으로 받아올 거니까 배열 하나 만들어주고 char[] c  -> 배열의 크기는 a.length만큼
		char[] c = new char[a.length()];
//		0번은 ++  마지막꺼는 -- 해야되네?
//		비교할 갯수는 문자열의 길이의 반까지 비교하면 돼 ->  < a.length/2
		for(int i = 0; i<a.length(); i++) {
			c[i] = a.charAt(i);		
		}
//		c[] 에 string a 의 문자열을 다 받아왔으니까 c[0] 부터 c[a.length-1] 을 차례대로 비교해서 같으면 되는거지
//		if(c[0] == c[a.length()-1]) {
//		근데 여기서 보면, 문자의 길이가 100개라고 하면 50번 비교해야하니까 for 문으로 자동 매크로 돌려야지.
//		}	
//		이렇게 for 문을 돌려서 모두 참이면 팰린드롬이므로 1을 출력 // 아니면 팰린드롬이 아니니까 0을 출력 
//		그러면 변수 하나 선언해서 1인지 0인지 받아올까? int ok = 0; 뭐 이런걸로 
//		근데 그냥 int 로 받았을때 배열이 아니니까 마지막꺼만 일치하면 어떡해? 예를들면 abccde 면 마지막 비교가 cc니까 1로 나올거 아냐 
//		아 그러면 카운트로 받자 count ++ 해서 count 의 갯수가 a.length/2 만큼이면 true 자나
		int count = 0;
		for(int i=0; i<a.length()/2; i++) {
			if(c[i] == c[a.length()-i-1]) {
				count++;
			}
		}
		if(count == a.length()/2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
