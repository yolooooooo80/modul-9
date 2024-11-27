
import java.util.Scanner;

public class no2 {


    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah penduduk = ");
        int N = scanner.nextInt();

    
        int k0_20 = 0;
        int k21_40 = 0;
        int k41_60 = 0;
        int k61_80 = 0;
        int k81_100 = 0;

      
        for (int i = 1; i <= N; i++) {
            System.out.print("Umur warga " + i + " =  ");
            int umur = scanner.nextInt();

        
            if (umur >= 0 && umur <= 20) {
                k0_20++;
            } else if (umur >= 21 && umur <= 40) {
                k21_40++;
            } else if (umur >= 41 && umur <= 60) {
                k41_60++;
            } else if (umur >= 61 && umur <= 80) {
                k61_80++;
            } else if (umur >= 81 && umur <= 100) {
                k81_100++;
            }
        }

        System.out.println("jumlah kelompok usia warga " + N + " penduduk adalah:");

        System.out.print("0 – 20  : ");
        for (int i = 0; i < k0_20; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("21 – 40 : ");
        for (int i = 0; i < k21_40; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("41 – 60 : ");
        for (int i = 0; i < k41_60; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("61 – 80 : ");
        for (int i = 0; i < k61_80; i++) {
            System.out.print("*");
        }
        System.out.println();

   
        System.out.print("81 – 100: ");
        for (int i = 0; i < k81_100; i++) {
            System.out.print("*");
        }
        System.out.println();

        
        scanner.close();
    }
}

    

