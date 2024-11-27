

public class no3 {
    public static void main(String[] args) {
            //looping memori jam sampai 12
            for (int jam = 1; jam <= 12; jam++ ) {
                for (int menit = 1; menit <= 60; menit++) {
                    
                    //looping dan mencetak blok detik
                    System.out.print("Detik: ");
                     for (int detik = 1; detik <= 60; detik++) {
                        System.out.print(detik+ " ");
                       
                    }
                    //setelah blok detik, diberi spasi
                    System.out.println();
    
                    //mencetak menit dan isi memorinya
                    System.out.println("Menit: "+menit);
                }
                //mencetak jam dan isi memorinya
                System.out.println("Jam  : "+jam);
            }
        }
    }
    
