import java.util.Scanner;
public class bacaFile {
    void baca(){
            java.io.File file = new java.io.File("transaksi.txt");
            try {
                Scanner in = new Scanner(file);
                in.useDelimiter("\n");
                String idtrans = in.next();
                String idpas = in.next();
                String nama = in.next();
                String tanggal = in.next();
                String deksripsi = in.next();

                System.out.println("ID TRANSAKSI : "+idtrans);
                System.out.println("ID PASIEN    : "+idpas);
                System.out.println("NAMA PASIEN  : "+nama);
                System.out.println("TANGGAL      : "+tanggal);
                System.out.println("KELUHAN      : "+deksripsi);

            } catch (Exception e) {
                System.out.println("File tidak Ditemukan !!!!");
            }
        }
    }

