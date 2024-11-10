import java.util.Scanner;
public class Assignment1N511 {
    public static void main(String[] args) {
        int N = 5;
            for (int column = 0; column < N; column++){
                for (int row = 0; row < N; row ++){
                if (column == 0 || column == N-1 || row == 0 || row == N-1 ) {
                    System.out.print(" 5 ");
                } else {
                    System.out.print("   ");
                }    
            }  
            System.out.println();
            }
        }
    }