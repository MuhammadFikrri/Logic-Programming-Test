package Soal3;

public class Pembagian
{
    int angka1;
    int angka2;

    public Pembagian(int angka1, int angka2)
    {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public void hasilBagi()
    {
        int sum = angka1 / angka2;
        System.out.println("Pembagian : " + sum);
    }
}