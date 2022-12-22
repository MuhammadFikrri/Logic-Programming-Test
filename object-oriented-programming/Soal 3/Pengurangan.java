package Soal3;

public class Pengurangan
{
    int angka1;
    int angka2;

    public Pengurangan(int angka1, int angka2)
    {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public void hasilKurang()
    {
        int sum = angka1 - angka2;
        System.out.println("Pengurangan : " + sum);
    }
}