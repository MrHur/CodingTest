import java.util.Scanner;

public class Main {
	/*
	 * 동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
	 * 
	 * 체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가
	 * 올바르지 않았다.
	 * 
	 * 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
	 * 
	 * 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[6];
		for (int i = 0; i < 6; i++) {
			a[i] = sc.nextInt();
		}

		int[] count = new int[6];
		for (int i = 0; i < 6; i++) {
			count[i] = 0;
		}
		while (true) {
			if (a[0] > 1) {
				a[0] -= 1;
				count[0]--;
			} else if (a[0] <= 0) {
				a[0] += 1;
				count[0]++;
			}

			if (a[1] > 1) {
				a[1] -= 1;
				count[1]--;
			} else if (a[1] <= 0) {
				a[1] += 1;
				count[1]++;
			}


			if (a[2] > 2) {
				a[2] -= 1;
				count[2]--;
			} else if (a[2] <= 1) {
				a[2] += 1;
				count[2]++;
			}

			if (a[3] > 2) {
				a[3] -= 1;
				count[3]--;
			} else if (a[3] <= 1) {
				a[3] += 1;
				count[3]++;
			}

			if (a[4] > 2) {
				a[4] -= 1;
				count[4]--;
			} else if (a[4] <= 1) {
				a[4] += 1;
				count[4]++;
			}

			if (a[5] > 8) {
				a[5] -= 1;
				count[5]--;
			} else if (a[5] <= 7) {
				a[5] += 1;
				count[5]++;
			}
            // 모든 a 배열의 값이 목표치에 도달하면 while 루프를 종료
            if (a[0] == 1 && a[1] == 1 && a[2] == 2 && a[3] == 2 && a[4] == 2 && a[5] == 8) {
                break;
            }
			
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(count[i] + " ");
		}
		// 스캐너를 닫음.
		sc.close();
	}
}