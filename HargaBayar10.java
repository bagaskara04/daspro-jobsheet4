import java.util.Scanner; //library
/**
 * HargaBayar10
 */
public class HargaBayar10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String merk_buku;
        int harga, jumlah, jumlah_halbuku;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan merk buku yang dibeli");
        merk_buku= input.next();
        System.out.println("Masukkan jumlah halaman buku");
        jumlah_halbuku = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan jumlah diskon");
        dis = input.nextDouble();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    }
}