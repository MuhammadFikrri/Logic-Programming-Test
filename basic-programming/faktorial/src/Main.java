import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukkan bilangan untuk dicari faktornya : ");

        int number = myObj.nextInt();

        System.out.println("Faktornya adalah ");

        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                System.out.println(+ i);
            }
        }
    }
}