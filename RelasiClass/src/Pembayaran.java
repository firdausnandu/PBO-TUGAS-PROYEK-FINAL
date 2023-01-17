abstract public class Pembayaran {
    int biayaObat;

    Pembayaran(int biaya){
        this.biayaObat = biaya;
    }
    public int getBayarObat(){
        return biayaObat;
    }
    abstract int pembayaran();
}
