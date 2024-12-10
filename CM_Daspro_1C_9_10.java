import java.util.Scanner;
public class CM_Daspro_1C_9_10 {

    //Variabel untuk nama item dan kategori
    static String[][] inventori = new String[10][2];
    static {
        inventori[0] = new String[] {"Kopi Hitam", "Minuman"};
        inventori[1] = new String[] {"Capucino", "Minuman"};
        inventori[2] = new String[] {"Teh Tarik", "Minuman"};
    }
    //Variabel menyimpan stok
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

            // untuk memilih menu
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
        } 
        //tidak sama dengan 4 akan mengulang fungsi pilihan
        while (pilihan != 4);
        sc.close();
    }

    static void tampilkanData() {
        // menampilkan header
        System.out.println("\n===== Daftar Inventori: =====");
        System.out.printf("%-4s %-20s %-15s %-10s\n", "No", "Nama Item", "Kategori", "Stok");
        System.out.println("-----------------------------------------------");
        // untuk tampilan nama kategori dan stok
        for (int i = 0; i < inventori.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (inventori[i][0]==null) {
                    break;
                }
                System.out.printf("%-4s %-20s %-15s %-10s\n", i+1, inventori[i][0], inventori[i][1], stok[i]);
            }
        }    
    }

    //fungsi untuk menambah item
    static void tambahItem(){
        Scanner sc = new Scanner(System.in);
        String kategori;
        String itembaru;
        int stokawal;
        //menginput nama item baru, kategori, dan jumlah stocknya
        System.out.println("==== TAMBAH ITEM BARU ====");
        System.out.print("Masukkan nama item baru: ");
        itembaru = sc.nextLine();
        System.out.print("Masukkan kategori item baru: ");
        kategori = sc.nextLine();
        System.out.print("Masukkan jumlah stock awal: ");
        stokawal= sc.nextInt();
    //kondisi untuk menambahkan item baru ke array inventori
        for (int i = 0; i < inventori.length; i++) {
            for (int j = 0; j < inventori[i].length; j++) {
                if (inventori[i][j]==null) {
                    inventori[i][0] =itembaru;
                    inventori[i][1] =kategori;
                    stok[i] = stokawal;
                    System.out.println("Item baru berhasil ditambahkan " + itembaru + " (" + kategori + ") " +"- Stok: " + stokawal);
                    listMenu();
                }
            }
        }
    }

    //fungsi untuk menambah stock
    static void tambahStock(){
        Scanner sc = new Scanner(System.in);
        int nomor;
        int tambahstok;
        //input nomor ke item yang akan ditambah stocknya
        System.out.println("==== TAMBAH STOCK ====");
        System.out.print("Masukkan nomor item: ");
        nomor = sc.nextInt();
        System.out.print("Masukkan jumlah stock yang ingin ditambahkan: ");
        tambahstok = sc.nextInt();
        //kondisi untuk menambahkan stock ke array inventori
        if (inventori[nomor-1][0]!=null||stok[nomor-1]>0) {
            stok[nomor-1] += tambahstok;
        }
        System.out.print("Stock " + inventori[nomor-1][0] + " berhasil ditambah." + " Stok sekarang: " + stok[nomor-1]);
    }
}