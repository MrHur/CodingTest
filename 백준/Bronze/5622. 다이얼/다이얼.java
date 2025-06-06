import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/* 다이얼		
		전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면
		다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
		숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
		상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를
		들어, UNUCIC는 868242와 같다.
		할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
		각 알파벳에 해당하는 번호 =>  초
		입력받은 문자열을 -> char[] 에 넣고 char[] 에 있는거 하나씩 꺼내다가 switch case로 돌릴까?
		알파벳의 갯수 -> 만큼 +  때문에   + s.length 
		*/
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			char value = c[i];
			result += getValueBasedOnChar(value);
		}
		System.out.print(result + s.length());
	}
	private static int getValueBasedOnChar(char value) {
		switch (value) {
            case 'A':
            case 'B':
            case 'C':
			return 2;
            case 'D':
            case 'E':
            case 'F':
			return 3;
            case 'G': 
            case 'H':
            case 'I':
			return 4;
            case 'J':
            case 'K': 
            case 'L':
			return 5;
            case 'M':
            case 'N':
            case 'O':
			return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
			return 7;
            case 'T':
            case 'U': 
            case 'V':
			return 8;
            case 'W': 
            case 'X': 
            case 'Y': 
            case 'Z':
			return 9;
		default:
			return -1;
		}
	}
}
