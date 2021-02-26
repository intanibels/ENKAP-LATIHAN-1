package latihan;
public class Bus {
    //membuat variabel instance
    public int penumpang;
    public int maxPenumpang;
    
    //membuat method void cetak
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+penumpang); //untuk menampilkan jumlah penumpang
        System.out.println("Penumpang maksimum seharusnya adalah "+maxPenumpang); //untuk menampilkan penumpang maksimal
    }
}