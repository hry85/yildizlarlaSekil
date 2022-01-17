import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz : ");
        int n=sc.nextInt();

        for (int i = 1 ; i <= n ; i++) {
            for (int k = 1 ; k <= (n - i) ; k++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <= (2 * i) - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1 ; i >= 1 ; i--){
            for (int k = (n - i) ; k >= 1 ; k--){
                System.out.print(" ");
            }
            for (int j = (2 * i) -1 ; j >= 1 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


