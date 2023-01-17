import java.io.*;
import java.util.Scanner;
public class KaryawanAdministrasi {
    int id_karyawan;
    String nama_karyawan;
    String alamat_karyawan;
    String notelp_karyawan;
    String tugas_karyawan;

    final void isi_data(){
        Scanner input=new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("DATA KARYAWAN");
        System.out.print("Masukan ID Karyawan    : ");
        id_karyawan=input.nextInt();
        System.out.print("Masukan Nama Karyawan   :");
        nama_karyawan= input.next();
        System.out.print("Masukan Alamat Karyawan :");
        alamat_karyawan= input.next();
        System.out.print("Masukan Nomor Karyawan  :");
        notelp_karyawan= input.next();
        System.out.print("Masukan Tugas Karyawan  :");
        tugas_karyawan= input.next();
        System.out.println("--------------------------------------------------");
    }
    void simpan_data() {
        java.io.File file = new java.io.File("karyawan.txt");
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("karyawan.txt", true));
            //PrintWriter output = new PrintWriter(file);
            output.write("Nama      : "+id_karyawan);
            output.newLine();
            output.write("ID        : "+nama_karyawan);
            output.newLine();
            output.write("Alamat    : "+alamat_karyawan);
            output.newLine();
            output.write("NO        : "+notelp_karyawan);
            output.newLine();
            output.write("Tugas     : "+tugas_karyawan);
            output.newLine();
            output.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
    void lihat_data(){
        String filename = "karyawan.txt";
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