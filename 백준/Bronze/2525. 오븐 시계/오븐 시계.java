import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();      
        int cookTime = sc.nextInt();
        int count = (cookTime+m)/60;
        if(m+cookTime>=60){
        	h=h+count;
            m=(m+cookTime)%60;
            if(h>23){
            	h=h%24;
            }
            System.out.println(h+" "+m);
        }else if(m+cookTime<60){
            System.out.println(h+" "+(m+cookTime));
        }
     sc.close();   
    }

}
