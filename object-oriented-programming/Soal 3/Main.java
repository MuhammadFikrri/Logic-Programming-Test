package Soal3;

public class Main
{
    public static void main(String[] args)
    {
        Soal3.Penjumlahan methodPenjumlahan = new Soal3.Penjumlahan(3,4);
        Soal3.Pengurangan methodPengurangan = new Soal3.Pengurangan(15,4);
        Soal3.Perkalian methodPerkalian = new Soal3.Perkalian(10,10);
        Soal3.Pembagian methodPembagian = new Soal3.Pembagian(12,3);

        System.out.println("Hasil");
        methodPenjumlahan.hasilJumlah();
        methodPengurangan.hasilKurang();
        methodPerkalian.hasilKali();
        methodPembagian.hasilBagi();
    }
}