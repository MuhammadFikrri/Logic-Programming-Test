package Soal2;

public class Tabung
{
    double jari2;
    double tinggi;

    public Tabung(double jari2, double tinggi)
    {
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }

    public void volumeTabung()
    {
        double a = 22;
        double b = 7;
        double luasLingkaran = (Math.pow(jari2, 2)) * (a/b) ;
        double volume = luasLingkaran * tinggi;
        System.out.println("Tabung : " + volume);
    }
}