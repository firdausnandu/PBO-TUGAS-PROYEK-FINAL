import java.io.*;
import java.util.Scanner;

public class Perawat {
    int id_perawat;
    String nama_perawat;
    String alamat_perawat;
    String notelp_perawat;
    String tugas_perawat;

    final void isi_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("DATA PERAWAT");
        System.out.print("Masukan ID Perawat      :");
        id_perawat=input.nextInt();
        System.out.print("Masukan Nama Perawat    :");
        nama_perawat= input.next();
        System.out.print("Masukan Alamat Perawat  :");
        alamat_perawat= input.next();
        System.out.print("Masukan Nomor Perawat   :");
        notelp_perawat= input.next();
        System.out.print("Masukan Tugas Perawat   :");
        tugas_perawat= input.next();
        System.out.print("--------------------------------------------------");
    }
    void simpan_data() {
        java.io.File file = new java.io.File("perawat.txt");
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("perawat.txt", true));
            //PrintWriter output = new PrintWriter(file);
            output.write("Nama      : "+id_perawat);
            output.newLine();
            output.write("ID        : "+nama_perawat);
            output.newLine();
            output.write("Alamat    : "+alamat_perawat);
            output.newLine();
            output.write("NO        : "+notelp_perawat);
            output.newLine();
            output.write("Tugas     : "+tugas_perawat);
            output.newLine();
            output.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
    void lihat_data(){
        String filename = "perawat.txt";
        try {
            Scanner reader = new Scanner(new File(filename));
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
