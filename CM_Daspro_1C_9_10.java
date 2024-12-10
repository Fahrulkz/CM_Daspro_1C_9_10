import java.util.Scanner;
public class CM_Daspro_1C_9_10 {

    static String[][] inventori = new String[10][2];
    static {
        inventori[0] = new String[] {"Kopi Hitam", "Minuman"};
        inventori[1] = new String[] {"Capucino", "Minuman"};
        inventori[2] = new String[] {"Teh Tarik", "Minuman"};
    }
    static int[] stok = new int[10];
    static {
        stok[0] = 10;
        stok[1] = 5;
        stok[2] = 8;
    }
    public static void main(String[] args) {
        listMenu();
    }

    static void listMenu(){
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n======= Menu Inventori Cafe =======");
            System.out.println("1. Tampilkan Inventori");
            System.out.println("2. Tambah Stok untuk item yang ada");
            System.out.println("3. Tambah Item Baru");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanData();
                    break;
                case 2:
                    tambahStock();
                    break;
                case 3:
                    tambahItem();
                    break;
                case 4:
                    System.out.println("Terimakasih Program Selesai:)");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi!.");
            }
        } while (pilihan != 4);
        sc.close();
    }

    static void tampilkanData() {
        System.out.println("\n===== Daftar Inventori: =====");
        System.out.printf("%-4s %-20s %-15s %-10s\n", "No", "Nama Item", "Kategori", "Stok");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < inventori.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (inventori[i][0]==null) {
                    break;
                }
                System.out.printf("%-4s %-20s %-15s %-10s\n", i+1, inventori[i][0], inventori[i][1], stok[i]);
            }
        }    
    }

    static void tambahItem(){

    }

    static void tambahStock(){
        
    }
}