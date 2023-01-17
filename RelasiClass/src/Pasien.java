import java.io.*;
import java.util.Scanner;

public class Pasien {
    int id_pasien;
    String nama_pasien;
    String alamat_pasien;
    String notelp_pasien;

   final void isi_data(){
        Scanner input=new Scanner(System.in);
       System.out.println("--------------------------------------------------");
        System.out.println("DATA PASIEN");
        System.out.print("Masukan ID Pasien      :");
        id_pasien=input.nextInt();
        System.out.print("Masukan Nama Pasien    :");
        nama_pasien= input.next();
        System.out.print("Masukan Alamat Pasien  :");
        alamat_pasien = input.next();
        System.out.print("Masukan Nomor Pasien   :");
        notelp_pasien= input.next();
       System.out.println("--------------------------------------------------");

    }
    void simpan_data() {
        java.io.File file = new java.io.File("pasien.txt");
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("pasien.txt", true));
            //PrintWriter output = new PrintWriter(file);
            output.write("Nama      : "+id_pasien);
            output.newLine();
            output.write("ID        : "+nama_pasien);
            output.newLine();
            output.write("Alamat    : "+alamat_pasien);
            output.newLine();
            output.write("NO        : "+notelp_pasien);
            output.newLine();
            output.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
    void lihat_data(){
        String filename = "pasien.txt";
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
