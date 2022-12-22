package Soal1;

public class Main
{
    public static void main(String[] args)
    {
        Soal1.Persegi methodPersegi = new Soal1.Persegi(4);
        Soal1.Segitiga methodSegitiga = new Soal1.Segitiga(3, 4);
        Soal1.Persegi_Panjang methodPersegiPanjang = new Soal1.Persegi_Panjang(7, 8);

        System.out.println("Luas");
        methodPersegi.Luas();
        methodSegitiga.Luas();
        methodPersegiPanjang.Luas();

        System.out.println();

        System.out.println("Keliling");
        methodPersegi.Keliling();
        methodSegitiga.Keliling();
        methodPersegiPanjang.Keliling();
    }
}