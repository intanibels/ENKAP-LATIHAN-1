package latihan;
public class UjiBus {
    public static void main(String[] args) {
        //membuat objek busMini dari kelas Bus
        Bus busMini = new Bus();
        
        //memasukkan nilai jumlah penumpang dan penumpang maksimal ke dlm objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil method cetak pada kelas bus
        busMini.cetak();
        
        //menambahkan penumpang pada busMini sebanyak 5
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //mengurangi penumpang pada busMini sebanyak 2
        busMini.penumpang = busMini.penumpang - 2;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //menambahkan penumpang pada busMini sebanyak 8
        busMini.penumpang = busMini.penumpang + 8;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
    }
}
// pada jumlah penumpang terakhir, hasilnya akan 16 dan itu melebihi jumlah maksimal
// oleh karena itu, diperlukan sebuah method yang dapat memrogram supaya tidak dapat melebihi maksimal penumpang