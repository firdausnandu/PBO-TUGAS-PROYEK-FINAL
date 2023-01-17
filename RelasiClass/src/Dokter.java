import java.io.*;
import java.util.Scanner;
public class Dokter {
    int id_dokter;
    String nama_dokter;
    String alamat_dokter;
    String notelp_dokter;
    String spesialis_dokter;


    final void isi_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("DATA DOKTER");
        System.out.print("Masukan ID Dokter        :");
        id_dokter=input.nextInt();
        System.out.print("Masukan Nama Dokter      :");
        nama_dokter= input.next();
        System.out.print("Masukan Alamat Dokter    :");
        alamat_dokter= input.next();
        System.out.print("Masukan Nomor Dokter     :");
        notelp_dokter= input.next();
        System.out.print("Masukan Spealis Dokter   :");
        spesialis_dokter= input.next();
        System.out.println("--------------------------------------------------");
    }
    void simpan_data() {
        java.io.File file = new java.io.File("dokter.txt");
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("dokter.txt", true));
            //PrintWriter output = new PrintWriter(file);
            output.write("Nama      : "+id_dokter);
            output.newLine();
            output.write("ID        : "+nama_dokter);
            output.newLine();
            output.write("Alamat    : "+alamat_dokter);
            output.newLine();
            output.write("NO        : "+notelp_dokter);
            output.newLine();
            output.write("Spesialis : "+spesialis_dokter);
            output.newLine();
            output.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
    void lihat_data(){
        String filename = "dokter.txt";
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
