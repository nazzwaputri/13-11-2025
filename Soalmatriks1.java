import java.util.Scanner;

public class Soalmatriks1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris = 2; // jumlah baris (sesuai contoh di gambar)
        System.out.print("Masukkan jumlah kolom= ");
        int kolom = input.nextInt();

        int[][] matriks = new int[baris][kolom];

        // Input nilai-nilai matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("nilai matriks[" + i + "][" + j + "]=");
                matriks[i][j] = input.nextInt();
            }
        }

        // Menampilkan hasil matriks
        System.out.println("Matriks=");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}

