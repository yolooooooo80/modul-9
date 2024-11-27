import java.util.Scanner;

public class no5 {
     public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scn.nextInt(); //baca memori n

        System.out.println("Maka kita akan mencari Segitiga Pascal baris "+n+ " : ");

        //membuat ke bawah
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            int kombinasi = 1; 
            System.out.print(kombinasi+ " "); //menampilkan C(i,0)

            //membuat ke samping
            for (int r = 1; r <= i; r++) {
                kombinasi = kombinasi * (i - r + 1) / r; //menghitung kombnasi dikali i dikali r ditambah 1 dan disimpan ke kombinasi
                System.out.print(kombinasi+ " "); //menampilkan isi kombinasi
            }
            System.out.println();
        }
    }
}

