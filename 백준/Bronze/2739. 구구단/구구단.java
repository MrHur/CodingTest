import java.util.Scanner;

public class Main{
    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int gugudan = sc.nextInt();
	        sc.close();
	        int a = 1;
	        for(; a<=9; a++){
            System.out.println(gugudan+" * "+a+" = "+gugudan*a);
        }
    }
}