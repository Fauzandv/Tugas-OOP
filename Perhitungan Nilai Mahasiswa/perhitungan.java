import java.util.Scanner;

public class perhitungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("nilai Tubes: ");
        double nilaiTubes = input.nextDouble();
        System.out.print("nilai Quiz: ");
        double nilaiQuiz = input.nextDouble();
        System.out.print("nilai tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Menghitung total nilai
        double totalNilai = (0.30 * nilaiTubes) + (0.10 * nilaiQuiz) + (0.10 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS);

        // Menampilkan output
        System.out.println("\nNilai Matakuliah Pemrograman Berorientasi Objek:");
        System.out.println("nama  : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.printf("Total Nilai: %.2f%n", totalNilai);
    }
}