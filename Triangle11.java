import java.util.Scanner;
public class Triangle11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner (System.in);
        System.out.print("Enter value N = ");
        int N = input11.nextInt();
        int i = 0;
        while(i <= N){
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}