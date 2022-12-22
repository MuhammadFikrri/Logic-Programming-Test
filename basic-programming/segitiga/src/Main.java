import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        float alas = 20;
        float tinggi = 25;

//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Masukkan alas: ");
//        float alas = myObj.nextInt();
//        System.out.println("Masukkan tinggi: ");
//        float tinggi = myObj.nextInt();

        float luas = alas * tinggi / 2;

        System.out.println("Luas segitiga adalah " + luas);
    }
}