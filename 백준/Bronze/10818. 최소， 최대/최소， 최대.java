import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int[] arr = new int[T];
        
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[T - 1]);
    }
}
