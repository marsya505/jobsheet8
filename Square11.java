import java.util.Scanner;
public class Square11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Enter value N = ");
        int N = input11.nextInt(); 
        for (int iOuter=1; iOuter<=N; iOuter++) {
            for (int i=1; i<=N; i++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}