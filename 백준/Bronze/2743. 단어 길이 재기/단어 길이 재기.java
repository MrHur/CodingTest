import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.print(word.length());
        
        // Scanner 자원 해제
        sc.close();
    }
}