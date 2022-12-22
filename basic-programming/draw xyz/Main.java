class Main
{
    private static void DrawXYZ(int n)
    {
        int rows = n, columns = n;
        int[][] marks = new int[rows][columns];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if (i == 0)
                {
                    marks[i][j] = i + j + 1;
                }
                else
                    marks[i][j] = j + (i * n) + 1;
            }
        }

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if (marks[i][j] % 3 == 0)
                {
                    System.out.printf("X");
                }
                else if (marks[i][j] % 2 == 0)
                {
                    System.out.printf("Z");
                }
                else System.out.printf("Y");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        DrawXYZ(3);
        System.out.println();

        DrawXYZ(5);
        System.out.println();

        DrawXYZ(1);
        System.out.println();
    }
}