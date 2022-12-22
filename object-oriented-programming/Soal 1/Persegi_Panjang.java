package Soal1;

public class Persegi_Panjang
{

    int panjang;
    int lebar;

    public Persegi_Panjang(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void Luas()
    {
        int luas = panjang * lebar;
        System.out.println("Persegi Panjang : " + luas);
    }

    public void Keliling()
    {
        int keliling = 2 * (panjang + lebar);
        System.out.println("Persegi Panjang : " + keliling);
    }
}