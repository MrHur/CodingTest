import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
//          같은 눈 3개
		if ((dice1 == dice2) && (dice2 == dice3)) {
			System.out.print(10000 + dice1 * 1000);
//        	같은 눈 2개
		} else if (((dice1 == dice2) && (dice2 != dice3)) || ((dice1 == dice3) && (dice2 != dice3))
				|| ((dice2 == dice3) && (dice1 != dice3))) {
//        	dice 2 3 이 같은 경우.
			if ((dice1 != dice2) && (dice1 != dice3)) {
				System.out.print(1000 + dice3 * 100);
//        	dice 1 3 이 같은 경우.
			} else if ((dice2 != dice3)&& (dice2 != dice1)) {
				System.out.print(1000 + dice1 * 100);
//          dice 1 2 이 같은 경우.
			} else if ((dice3 != dice1) && (dice3 != dice2)) {
				System.out.print(1000 + dice2 * 100);
			}
//        	모두 다른 눈인 경우.
		} else if ((dice1 != dice2) && (dice1 != dice3) && (dice2 != dice3)) {
//        	dice1 이 가장 큰 경우.
			if ((dice1 > dice2) && (dice2 > dice3)) {
				System.out.print(dice1 * 100);
//        	dice2 가 가장 큰 경우.
			} else if ((dice2 > dice3) && (dice3 > dice1)) {
				System.out.print(dice2 * 100);
//        	dice3 가 가장 큰 경우.
			} else if ((dice3 > dice1) && (dice1 > dice2)) {
				System.out.print(dice3 * 100);
//        	dice1 과 dice2가 dice3 보다 클 때, 
			} else if ((dice1 > dice3) && (dice2 > dice3)) {
//        	dice1이 dice2보다 큰 경우.
				if (dice1 > dice2) {
					System.out.print(dice1 * 100);
//			dice 2가 dice1보다 큰 경우.
				} else if (dice2 > dice1) {
					System.out.print(dice2 * 100);
				}
//			dice 2와 dice3이 dice 1보다 클 때,
			} else if ((dice2 > dice1) && (dice3 > dice1)) {
				if (dice2 > dice3) {
					System.out.print(dice2 * 100);
				} else if(dice3> dice2) {
					System.out.print(dice3 * 100);
				}
//			dice 1과 dice 3이 dice 2보다 클 때,
			} else if((dice1 > dice2) && (dice3 > dice2)){
				if (dice1>dice3) {System.out.print(dice1 * 100);
				}else if(dice3>dice1){
					System.out.print(dice3*100);
				}
			}
		}
		sc.close();
	}
}
