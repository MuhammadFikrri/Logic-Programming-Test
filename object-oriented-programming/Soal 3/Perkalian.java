package Soal3;

public class Perkalian
{
    int angka1;
    int angka2;

    public Perkalian(int angka1, int angka2)
    {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    public void hasilKali()
    {
        int sum = angka1 * angka2;
        System.out.println("Perkalian : " + sum);
    }
}