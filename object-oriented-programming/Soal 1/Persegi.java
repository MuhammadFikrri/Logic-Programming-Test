package Soal1;

public class Persegi
{
    int sisi;

    public Persegi(int sisi)
    {
        this.sisi = sisi;
    }

    public void Luas()
    {
        int luas = sisi * sisi;
        System.out.println("Persegi : " + luas);
    }

    public void Keliling()
    {
        int keliling = sisi * 4;
        System.out.println("Persegi : " + keliling);
    }
}