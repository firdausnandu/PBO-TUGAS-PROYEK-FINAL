public class KlinikBrotomulyo {
    int id_klinik;
    String nama_klinik;


    public KlinikBrotomulyo(){

    }
    public KlinikBrotomulyo(int id_klinik, String nama_klinik) {
        this.id_klinik = id_klinik;
        this.nama_klinik = nama_klinik;
    }

    public String deskripsi(){
        return "Klinik Brotomulyo adalah Klinik Kesehatan yang " +
                "memiliki 3 Poli Utama yaitu Poli Gigi, Poli Umum, " +
                "dan Poli Penyakit Dalam.";
    }

    public String jadwal(){
        return "Setiap Hari";
    }




}
