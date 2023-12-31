package layout;

import java.util.Scanner;
import controller.MyController;

public class Delete {
    public static void showDeleteData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Silahkan Pilih Data yang Ingin Dihapus");
        System.out.println("--------------------------------");
        MyController.getDatabase();
        System.out.println("--------------------------------");
        System.out.println("**Note: Input nama produk dengan benar!!!");
        System.out.print("Pilih Nama Produk: ");
        String nama = sc.nextLine();
        System.out.println("================================");

        if (MyController.deleteData(nama)) {
            System.out.println("Berhasil Delete Data");
        } else {
            System.out.println("Maaf, Gagal Delete Data");
        }

        System.out.println("--------------------------------");
        Menu.showMenu();
        sc.close();
    }
}
