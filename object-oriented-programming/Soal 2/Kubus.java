package Soal2;

public class Kubus
{
    int sisi;

    public Kubus(int sisi)
    {
        this.sisi = sisi;
    }

    public void volumeKubus()
    {
        int volume = sisi * sisi * sisi;
        System.out.println("Kubus : " + volume);
    }
}