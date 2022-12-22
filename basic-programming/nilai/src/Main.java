import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukkan nilai siswa: ");

        int nilai = myObj.nextInt();

        if (nilai >= 0 && nilai <= 34) {
            System.out.println("Nilai siswa adalah D");
        } else if (nilai >= 35 && nilai <= 49) {
            System.out.println("Nilai siswa adalah C");
        } else if (nilai >= 50 && nilai <= 64) {
            System.out.println("Nilai siswa adalah B");
        } else if (nilai >= 65 && nilai <= 79) {
            System.out.println("Nilai siswa adalah B+");
        } else if (nilai >= 80 && nilai <= 100) {
            System.out.println("Nilai siswa adalah A");
        } else
            System.out.println("Nilai invalid");
    }
}