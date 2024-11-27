import java.util.Scanner;

public class no4 {
     public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
       
        //menginisalisasi memori 
        int pilihan;            
        double totalUsia = 0;
        int usiaJumlah = 0;
        int usia020 = 0;
        int usia2140 = 0;
        int usia4160 = 0;
        int usia6180 = 0;
        int usia81100 = 0;
        double rtrt;

        do { 
            //menampilkan menu
            System.out.println("Menu pilihan:");
            System.out.println("1. Memasukkan data usia");
            System.out.println("2. Rata-rata");
            System.out.println("3. Deviasi Standard");
            System.out.println("4. Diagram batang");
            System.out.println("5. Keluar");
            System.out.println("Pilih ? ");
            pilihan = scn.nextInt();

            switch (pilihan) {
                case 1:
                    //memasukkan data usia
                    System.out.print("Masukkan usia (1 - 100): ");
                    int usia = scn.nextInt();
                    if (usia >= 0 && usia <= 100) {
                        totalUsia += usia; 
                        usiaJumlah++; 

                        //menghitung untuk diagram usia
                        if (usia <= 20) {
                            usia020++;
                        }else if (usia <= 40) {
                            usia2140++;
                        }else if (usia <= 60) {
                            usia4160++;
                        }else if (usia <= 80) {
                            usia6180++;
                        }else if (usia <= 100) {
                            usia81100++;
                        }
                    }else {
                        System.out.println("Input tidak valid. Ulangi");
                    }
                    break;
                case 2:
                    //menghitung rata-rata usia
                    if (usiaJumlah > 0) {
                        rtrt = totalUsia / usiaJumlah;
                        System.out.println("Rata-rata usia: "+rtrt);
                    }else {
                        System.out.println("Input data belum ada");
                    }
                    break;
                case 3:
                    //hitung deviasi standard
                    if (usiaJumlah > 0) {
                        double deviasi = totalUsia / usiaJumlah;
                        double totalDeviasi = 0;

                        //menghitung deviasi di setiap usia
                        for (int i = 1; i <= usiaJumlah; i++) {
                            System.out.print("Masukkan inputan usia sebelumnya "+i+ ": ");
                            int usia2 = scn.nextInt();
                            totalDeviasi += Math.pow(usia2 - deviasi, 2);
                        }
                        double deviasiStandard = Math.sqrt(totalDeviasi/usiaJumlah);
                        System.out.println("Deviasi Standar usia: "+deviasiStandard);
                    }else {
                        System.out.println("Input data usia belum ada");
                    }
                    break;
                case 4:
                    if (usiaJumlah > 0) {
                        //menampilkan diagram di setiap usia
                        System.out.println("Hasil Diagram Batang Usia");
                        System.out.print("Usia 0 - 20: ");
                        for (int j = 1; j <= usia020; j++) {
                            System.out.print("*");
                        }
                        System.out.println();

                        System.out.print("Usia 21 - 40: ");
                        for (int j = 1; j <= usia2140; j++) {
                            System.out.print("*");
                        }
                        System.out.println();

                        System.out.print("Usia 41 - 60: ");
                        for (int j = 1; j <= usia4160; j++) {
                            System.out.print("*");
                        }
                        System.out.println();

                        System.out.print("Usia 61 - 80: ");
                        for (int j = 1; j <= usia6180; j++) {
                            System.out.print("*");
                        }
                        System.out.println();

                        System.out.print("Usia 81 - 100: ");
                        for (int j = 1; j <= usia81100; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }else {
                        System.out.println("Input data usia belum ada");
                    }
                    break;
                case 5:
                    //keluar program
                    System.out.println("Keluar dari program");
                    break;
                }        
        }while (pilihan != 5);

    }    
}  

