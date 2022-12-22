package Soal4;

public class Berat
{
    double beratBenda;
    double hargaAwal = 5000;

    public Berat(double beratBenda)
    {
        this.beratBenda = beratBenda;
    }

    public double beratBarang()
    {
        double c = beratBenda % 1;
        int sum = (int) (beratBenda / 1);

        if (beratBenda <= 1)
        {
            return hargaAwal;
        }
        else if (c > 0)
        {
            return hargaAwal * sum + hargaAwal;
        }
        else
        {
            return (int) hargaAwal * sum;
        }
    }
}