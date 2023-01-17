public class PembayaranObat extends Pembayaran {
     PembayaranObat(int biaya){
        super(biaya);
    }

    @Override
    int pembayaran() {
        return super.getBayarObat();
    }
}
