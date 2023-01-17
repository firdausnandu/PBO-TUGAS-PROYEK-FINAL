public class PoliPenyakitDalam extends KlinikBrotomulyo{
    public PoliPenyakitDalam(int id_klinik, String nama_klinik) {
        super(id_klinik, nama_klinik);
    }

    @Override
    public String deskripsi() {
        return "Poli Penyakit Dalam adalah Poli Khusus yang mengatasi penyakit dalam seperti" +
                "Hipertensi Ginjal, Kardiologi, dan Psikosomatik.";
    }

    @Override
    public String jadwal() {
        return "Setiap Senin dan Rabu.";
    }
    public int harga(int harga) {
        return harga;
    }
}
