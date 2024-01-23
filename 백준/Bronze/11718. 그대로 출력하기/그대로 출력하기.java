import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    while(sc.hasNext()){
            System.out.println(sc.nextLine());
	    }
	 // 스캐너를 닫음.
	 sc.close();
	}
}