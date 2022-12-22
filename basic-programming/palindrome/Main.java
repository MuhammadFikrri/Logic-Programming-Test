class Main
{
    private static boolean palindrome(String value)
    {
        String reverseValue = "";

        int valueLength = value.length();

        for (int i = (valueLength - 1); i >=0; --i)
        {
            reverseValue = reverseValue + value.charAt(i);
        }

        if (value.toLowerCase().equals(reverseValue.toLowerCase()))
        {
            return true;
        }
        else return false;
    }

    public static void main(String[] args)
    {
        System.out.println(palindrome("kodik")); //true
        System.out.println(palindrome("katak")); //true
        System.out.println(palindrome("kasur rusak")); //true
        System.out.println(palindrome("kupu-kupu")); //false
        System.out.println(palindrome("lion")); //false
    }
}