package Soal3;

public class Penjumlahan
{
    int angka1;
    int angka2;

    public Penjumlahan(int angka1, int angka2)
    {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public void hasilJumlah()
    {
        int sum = angka1 + angka2;
        System.out.println("Penjumlahan : " + sum);
    }
}