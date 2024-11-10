import java.util.Scanner;
public class AssignmentPorseni11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        int athletesPerSport = 5, Politeknik = 1;
        String[][] athletes = new String[sports.length][athletesPerSport];
        while (Politeknik<=5) {
            System.out.println("Politeknik " + Politeknik);
        for (int i = 0; i < sports.length; i++) {
            System.out.println("Enter " + sports[i] + " athletes names:");
            for (int j = 0; j < athletesPerSport; j++) {
                System.out.print("Athlete number " + (j + 1) + ": ");
                athletes[i][j] = input11.next();
            }
            System.out.println(); 
        }
        System.out.println();
            Politeknik++;
        }
    }
}