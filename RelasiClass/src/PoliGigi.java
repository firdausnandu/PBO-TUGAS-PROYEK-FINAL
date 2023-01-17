public class PoliGigi extends KlinikBrotomulyo {
    public PoliGigi(int id_klinik, String nama_klinik) {
        super(id_klinik, nama_klinik);
    }

    @Override
    public String deskripsi() {
        return "Poli Gigi merupakan Poli yang mengkhususkan kepada perawatan gigi." +
                "Mengatasi permasalahan gigi seperti operasi gigi, memasang kawat gigi, dan pembersihan gigi.";
    }

    @Override
    public String jadwal() {
        return "Setiap selasa dan kamis.";
    }

    public int harga(int harga) {
        return harga;
    }
}

