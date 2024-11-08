import java.util.Scanner;
public class AverageValue11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner (System.in);
        int i, j;
        float nilaiMhs, totalNilai = 0, rataNilai;
        i = 1;
        while (i<=5) {
            System.out.println("Input Nilai Mahasiswa ke " + i);
        totalNilai = 0;
        for (j=1; j<=5; j++) {
            System.out.print("Nilai ke-" +j + " = ");
            nilaiMhs=input11.nextInt();
            totalNilai+=nilaiMhs;
            }
        rataNilai=totalNilai/5;
        System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
        i++;
        }
    }
}