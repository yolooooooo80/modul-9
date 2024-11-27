import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //deklarasi Scanner

      
        System.out.print("Masukkan ukuran n =  ");
        int N = scanner.nextInt(); // baca n

        // melakukan looping
        for (int i = 0; i < N; i++) {
       
            for (int j = 0; j < N; j++) {

                if (i == j) {   //melakukan percabangan
                    System.out.print("1 ");
                } else {
     
                    System.out.print("0 ");
                }
            }
         
            System.out.println();
        }

    
    }
}

    

