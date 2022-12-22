class Main
{
    private static boolean primeNumber(int number)
    {
        int a = 0;
        for (int i = 2; i <= number; i++)
        {
            if (number % i == 0 || number == i)
            {
                a = a + 1;
            }
            // System.out.println(+ a); //true
        }

        if (a == 1)
        {
            return true;
        }
        else return false;
    }

    public static void main(String[] args)
    {
        System.out.println(primeNumber(11)); //true
        System.out.println(primeNumber(13)); //true
        System.out.println(primeNumber(17)); //true
        System.out.println(primeNumber(20)); //false
        System.out.println(primeNumber(35)); //false
    }
}