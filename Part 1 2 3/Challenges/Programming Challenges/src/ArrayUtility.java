import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray()    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i < size) {
            System.out.print("Please enter thr element no " + (i + 1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }

        return nums;
    }

    public static int[][] input2DArray()    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of column : ");
        int column = input.nextInt();

        int size = rows * column;
        int[][] nums = new int[rows][column];

        int i=0;
        while(i<rows)   {
            int j =0;
            while (j < column)  {
                System.out.print("Enter the num of rows "+ i + " & column " + j + "  : ");
                nums[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        return nums;
    }

    public static void displayArray(int[] numArray)  {
        int i=0;
        while(i < numArray.length)  {
            System.out.print(numArray[i]+ " ");
            i++;
        }
        System.out.println();
    }
}
