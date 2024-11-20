import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        for(int i=0; i< arr.length; i++){
            arr[i] = -1;
        }
        String S = sc.nextLine();
        for(int i=0; i<S.length(); i++){
            char a = S.charAt(i);           
            if(arr[a - 'a'] == -1){
                arr[a - 'a'] = i;
            }
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}
