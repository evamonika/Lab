import java.util.Scanner;
public class listNumber {
    public static void main(String[] args) {
        int[][] listAngka;
        Scanner sc = new Scanner(System.in);

        //blok kode untuk memasukkan jumlah baris dan kolom
        System.out.print("Masukkan jumlah baris : ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        int kolom = sc.nextInt();

        listAngka = new int[baris][kolom];

        //kode untuk memasukkan input kedalam array
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan nilai ke["+i+"]["+j+"] ");
                listAngka[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int pilihan;
        int min = -1;
        System.out.println("============Pilihan Menu============");
        System.out.println("1. Nilai terkecil: ");
        System.out.println("2. Nilai terkecil, jumlah, dan posisi");
        System.out.println("3. Pencarian angka 50");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan menu: ");
        pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                min = -1;
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        //blok kode untuk membandingkan minimum dengan sekarang
                        if (min == -1) {
                            min = listAngka[i][j];
                        } else if (listAngka[i][j] < min) {
                            min = listAngka[i][j];
                        }
                    }
                }
                System.out.println("Nilai minimum adalah " + min);
                break;
            case 2:
                //mencari minimum
                min = -1;
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        //blok kode untuk membandingkan minimum dengan sekarang
                        if (min == -1) {
                            min = listAngka[i][j];
                        } else if (listAngka[i][j] < min) {
                            min = listAngka[i][j];
                        }
                    }
                }
                System.out.println("Nilai minimum : " + min);

                //mencari banyak angka minimum
                int banyak = 0;
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (listAngka[i][j] == min) {
                            System.out.println("Angka " + min + " ada di posisi ["+i+"]["+j+"] ");
                            banyak++;
                        }
                    }
                }
                System.out.println("Banyak angka " + min + " adalah " + banyak);
                break;

            case 3:
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        if (listAngka[i][j] == 50) {
                            System.out.println("ADA");
                            return;
                        }
                    }
                }
                System.out.println("Tidak Ada");
                break;
        }
    }
}