import java.util.Scanner;

class sum_average {
    public static void main(String[] args) {
        System.out.println("Welcome to the Sum and Average ");

        int[] numArray = ArrayUtility.inputArray();

        long arraySum = arraySum(numArray);
        System.out.println("Sum of the array is : "+ arraySum);

        int ave = ave(numArray);
        System.out.println("Average of array elements is : "+ave);

    }

    public static long arraySum(int[] numArray) {
        int i=0;
        long sum =0;
        while(i != numArray.length) {
            sum += numArray[i];
            i++;
        }

        return sum;
    }

    public static int ave(int[] numArray)   {
        long sum = arraySum(numArray);

        return (int)(sum/numArray.length);
    }
}
