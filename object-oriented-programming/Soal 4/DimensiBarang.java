package Soal4;

public class DimensiBarang
{
    double panjang;
    double lebar;
    double tinggi;

    public DimensiBarang(double panjang, double lebar, double tinggi)
    {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double volumeBarang()
    {
        double volume = panjang * lebar * tinggi;
        return volume;
    }
}