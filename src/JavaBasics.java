import java.util.Scanner;

public class JavaBasics {
    private int size;

    private JavaBasics()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size : ");
        size = scanner.nextInt();

        SquarePattern();

        CheckerPattern();

        TimeTable();

        TriangularPatternA();
        TriangularPatternB();
        TriangularPatternC();
        TriangularPatternD();

        BoxPatternA();
        BoxPatternB();
        BoxPatternC();
        BoxPatternD();
        BoxPatternE();

        HillPatternA();
        HillPatternB();
        HillPatternC();
        HillPatternD();

        NumberPatternA();
        NumberPatternB();
        NumberPatternC();
        NumberPatternD();
    }

    private void SquarePattern()
    {
        System.out.println("Square Pattern");
        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void CheckerPattern()
    {
        System.out.println("Checker Pattern");
        for (int row = 0; row < size; row++)
        {
            if (row % 2 == 1)
            {
                System.out.print(" ");
            }
            for (int col = 0; col < size; col++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void TimeTable()
    {
        System.out.println("Time Table");

        System.out.print(" * |");
        for (int i = 0; i < size; i++)
        {
            for (int spacing = 0; spacing < 4 - Integer.toString(i + 1).length(); spacing++)
            {
                System.out.print(" ");
            }
            System.out.print(i + 1);
        }

        System.out.print("\n-----");
        for (int i = 0; i < size; i++)
        { System.out.print("----"); }
        System.out.println();

        for (int row = 0; row < size; row++)
        {
            if (row < 9)
            {
                System.out.print(" ");
            }
            System.out.print((row + 1) + " |");
            for (int col = 0; col < size; col++)
            {
                int num = (col + 1) * (row + 1);
                for (int spacing = 0; spacing < 4 - Integer.toString(num).length(); spacing++)
                {
                    System.out.print(" ");
                }
                System.out.print(num);
            }
            System.out.println();
        }
        System.out.println();

    }

    private void TriangularPatternA()
    {
        System.out.println("Triangular Pattern A");
        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < row+1; col++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void TriangularPatternB()
    {
        System.out.println("Triangular Pattern B");
        for (int row = size - 1; row > -1; row--)
        {
            for (int col = 0; col < row + 1; col++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void TriangularPatternC()
    {
        System.out.println("Triangular Pattern C");
        for (int row = size - 1; row > -1; row--)
        {
            for (int extra = 1; extra < size - row; extra++)
            {
                System.out.print("  ");
            }
            for (int col = 0; col < row + 1; col++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void TriangularPatternD()
    {
        System.out.println("Triangular Pattern D");
        for (int row = 0; row < size; row++)
        {
            for (int extra = 1; extra < size - row; extra++)
            {
                System.out.print("  ");
            }
            for (int col = 0; col < row + 1; col++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void BoxPatternA()
    {
        System.out.println("Box Pattern A");
        for (int i = 0; i < size; i++)
        {
            System.out.print("# ");
        }
        System.out.println();
        for (int row = 0; row < size - 2; row++)
        {
            System.out.print("# ");
            for (int i = 0; i < size * 2 - 5; i++)
            {
                System.out.print(" ");
            }
            System.out.print(" #\n");
        }
        for (int i = 0; i < size; i++)
        {
            System.out.print("# ");
        }
        System.out.println();
    }

    private void BoxPatternB()
    {
        System.out.println("Box Pattern B");
        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                if (row == 0 || row == size - 1 || row == col)
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private void BoxPatternC()
    {
        System.out.println("Box Pattern C");
        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                if (row == 0 || row == size - 1 || row == size - col - 1)
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private void BoxPatternD()
    {
        System.out.println("Box Pattern D");
        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                if (row == 0 || row == size - 1 || row == size - col - 1 || row == col)
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private void BoxPatternE()
    {
        System.out.println("Box Pattern E");
        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                if (row == 0 || row == size - 1 || row == size - col - 1 || row == col || col == 0 || col == size - 1)
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private void HillPatternA()
    {
        System.out.println("Hill Pattern A");
        for (int row = 0; row < size; row++)
        {
            for (int extra = 0; extra < size - row - 1; extra++)
            {
                System.out.print("  ");
            }
            for (int fill = 0; fill < row * 2 + 1; fill++)
            {
                System.out.print("# ");
            }
            for (int extra = 0; extra < size - row - 1; extra++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void HillPatternB()
    {
        System.out.println("Hill Pattern B");
        for (int row = size - 1; row > -1; row--)
        {
            for (int extra = 0; extra < size - row - 1; extra++)
            {
                System.out.print("  ");
            }
            for (int fill = 0; fill < row * 2 + 1; fill++)
            {
                System.out.print("# ");
            }
            for (int extra = 0; extra < size - row - 1; extra++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void HillPatternC()
    {
        System.out.println("Hill Pattern C");
        for (int row = 0; row < size; row++)
        {
            for (int extra = 0; extra < size - row - 1; extra++)
            {
                System.out.print("  ");
            }
            for (int fill = 0; fill < row * 2 + 1; fill++)
            {
                System.out.print("# ");
            }
            for (int extra = 0; extra < size - row - 1; extra++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int row = size - 2; row > -1; row--)
        {
            for (int extra = 0; extra < size - row - 1; extra++)
            {
                System.out.print("  ");
            }
            for (int fill = 0; fill < row * 2 + 1; fill++)
            {
                System.out.print("# ");
            }
            for (int extra = 0; extra < size - row - 1; extra++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void HillPatternD()
    {
        System.out.println("Hill Pattern D");
        for (int row = 0; row < size; row++)
        {
            for (int extra = 0; extra < size - row; extra++)
            {
                System.out.print("# ");
            }
            for (int fill = 0; fill < row * 2 - 1; fill++)
            {
                System.out.print("  ");
            }
            for (int extra = 1; extra < size - row + 1; extra++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        for (int row = size - 2; row > -1; row--)
        {
            for (int extra = 0; extra < size - row; extra++)
            {
                System.out.print("# ");
            }
            for (int fill = 0; fill < row * 2 - 1; fill++)
            {
                System.out.print("  ");
            }
            for (int extra = 0; extra < size - row; extra++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void NumberPatternA()
    {
        System.out.println("Number Pattern A");
        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < row + 1; col++)
            {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void NumberPatternB()
    {
        System.out.println("Number Pattern B");
        for (int row = size - 1; row > -1; row--)
        {
            for (int extra = size - row - 2; extra > -1; extra--)
            {
                System.out.print("  ");
            }
            for (int col = 0; col < row + 1; col++)
            {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void NumberPatternC()
    {
        System.out.println("Number Pattern C");
        for (int row = 0; row < size; row++)
        {
            for (int extra = size - 1; extra > row; extra--)
            {
                System.out.print("  ");
            }
            for (int col = 0; col < row + 1; col++)
            {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void NumberPatternD()
    {
        System.out.println("Number Pattern D");
        for (int row = size - 1; row > -1; row--)
        {
            for (int col = row; col > -1; col--)
            {
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        new JavaBasics();
    }
}
