public class PoliUmum extends KlinikBrotomulyo{
    public PoliUmum(int id_klinik, String nama_klinik) {
        super(id_klinik, nama_klinik);
    }

    @Override
    public String deskripsi() {
        return "Poli Umum merupakan Poli yang menkhususkan dalam penyakit umum." +
                "Contohnya demam, pilek, luka ringan, dan penyakit ringan lainya.";
    }

    @Override
    public String jadwal() {
        return "Setiap Hari";
    }
    public int harga(int harga) {
        return harga;
    }
}
