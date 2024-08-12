import java.util.Scanner;

class occurrencesFinding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occurrences Finding \n");
        int[] num = ArrayUtility.inputArray();
        System.out.print("Please enter the target element : ");
        int element = input.nextInt();

       // int occurrances = Occurrences(num,element);
        int occurrances = OccurrencesForEach(num,element);

        System.out.println("The "+element +  "in the array found occurrences : "+ occurrances);

    }

    public static int  Occurrences(int[] num, int element)  {
        int ocr = 0 ;
        for (int i = 0; i < num.length; i++) {
            if(num[i] == element)   ocr++;
        }
        return ocr;
    }

    public static int  OccurrencesForEach(int[] num, int element)  {
        int ocr = 0 ;
        for (int nums : num) {
            if(nums == element)   ocr++;
        }
        return ocr;
    }
}
