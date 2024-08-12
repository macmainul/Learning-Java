import java.util.Scanner;

class mearge_two_sorted_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to merge sort ");
//        System.out.print("Enter the length of first array : ");
//        int first = input.nextInt();
//        System.out.println("Enter the length of second array : ");
//        int second = input.nextInt();
        int[] firstArray = ArrayUtility.inputArray();
        int[] secondArray = ArrayUtility.inputArray();
        int[] meargeArray = MeargeArray(firstArray,secondArray);
        System.out.println("After Meargeing the Array : ");
        ArrayUtility.displayArray(meargeArray);
    }

    public static int[] MeargeArray(int[] first , int[] second) {
        int size = first.length + second.length;
        int[] Mearge = new int[size];

        int i=0, j=0, k=0;
        while(i < first.length || j < second.length)    {
            if(j == second.length || (i < first.length && first [i] < second[j]))   {
                Mearge[k] = first[i];
                i++;
                k++;
            }
            else {
                Mearge[k] = second[j];
                j++;
                k++;
            }
        }
        return Mearge;
    }
}
