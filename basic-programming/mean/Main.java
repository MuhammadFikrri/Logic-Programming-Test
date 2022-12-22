import javax.print.DocFlavor.STRING;
import java.util.Scanner;

class Main
{
    private static float Mean(float[] numbers)
    {
        float arrayLength = numbers.length;
        float sumss = 0;
//        System.out.println("The length of the array is: "+arrayLength);

        for (float i = 0; i < arrayLength; i++)
        {
            sumss += numbers[(int) i];
//            System.out.println("sum : "+sumss);
        }

        float rata2 = sumss / arrayLength;

        System.out.println("The mean of the array is: "+rata2);

        return 0;
    }

    public static void main(String[] args)
    {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}