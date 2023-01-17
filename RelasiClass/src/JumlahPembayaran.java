public class JumlahPembayaran implements MenuPembayaran {

    @Override
    public int jumlahPembayaran1(int jumlah) {

        return jumlah-total1;
    }

    @Override
    public int jumlahPembayaran2(int jumlah) {
        return jumlah-total2;
    }

    @Override
    public int jumlahPembayaran3(int jumlah) {

        return jumlah - total3;
    }
}
