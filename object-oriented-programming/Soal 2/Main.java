package Soal2;

public class Main
{
    public static void main(String[] args)
    {
        Soal2.Kubus methodKubus = new Soal2.Kubus(10);
        Soal2.Balok methodBalok = new Soal2.Balok(3,6,10);
        Soal2.Tabung methodTabung = new Soal2.Tabung(7,10);

        System.out.println("Volume");
        methodKubus.volumeKubus();
        methodBalok.volumeBalok();
        methodTabung.volumeTabung();
    }
}