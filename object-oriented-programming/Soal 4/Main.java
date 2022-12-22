package Soal4;

public class Main
{
    public static void main(String[] args)
    {
        Soal4.DimensiBarang methodDimensiBarang = new Soal4.DimensiBarang(5,2,4);
        Soal4.Berat methodBerat = new Soal4.Berat(1);
        double b = methodBerat.beratBarang();

        System.out.println("Harga yang harus dibayar adalah ");
        System.out.println("Rp. " + b);

        /*
            Dalam case ini saya beranggapan bahwa jika volume benda kurang dari 50 cm^3
        maka harga yang harus dibayar adalah 5000, berarti jika pembulatan yang dilakukan
        adalah pembulatan keatas begitu juga untuk beratnya.
            Karena jika berat benda misal 0.3 kg maka harga yang dibayarkan seharusnya
        adalah 5000 berarti hal ini melakukan pembulatan keatas.
            Selanjutnya untuk harga yang harus dibayarkan adalah harga dari berat benda
        dikalikan dengan 5000.
         */
    }
}