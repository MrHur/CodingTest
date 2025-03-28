import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 상수
		/*
		 * 상근이의 동생 상수는 수학을 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는
		 * 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 큰 수를 말해보라고 했다. <- String 2개 입력받음.
		 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
		 * 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다. 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
		 * 상수는 수를 거꾸로 읽음 -> 입력 받은 수를 거꾸로 바꿔야함 char 배열로 받아서, 다시 string으로 담아서, 그 수를 비교해서 큰
		 * 수를 출력.
		 */
		Scanner sc = new Scanner(System.in);
		String firstNum = sc.next();
		String secondNum = sc.next();
		sc.close();
		char[] a = new char[firstNum.length()];
		char[] b = new char[secondNum.length()];

		for (int i = 0; i < firstNum.length(); i++) {
			a[i] = firstNum.charAt(i);
			b[i] = secondNum.charAt(i);
//			System.out.print(a[i]);
		}
		StringBuilder reversedStringBuilderA = new StringBuilder();
		StringBuilder reversedStringBuilderB = new StringBuilder();
		for (int i = firstNum.length() - 1; i >= 0; i--) {
			reversedStringBuilderA.append(a[i]);
			reversedStringBuilderB.append(b[i]);
		}
		// StringBuilder를 String으로 변환
		String reversedStringA = reversedStringBuilderA.toString();
		String reversedStringB = reversedStringBuilderB.toString();
		int c = Integer.parseInt(reversedStringA);
		int d = Integer.parseInt(reversedStringB);
		if (c > d) {
			System.out.print(c);
		} else {
			System.out.print(d);
		}
	}
}
