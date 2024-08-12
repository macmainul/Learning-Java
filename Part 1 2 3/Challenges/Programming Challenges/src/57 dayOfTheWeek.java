import java.util.Scanner;

class dayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to month form thr num using switch case\n");
        System.out.print("Please enter the month in num : ");
        int month = input.nextInt();

        String result =  switch (month) {
            case 1 -> "Saturday";
            case 2 -> "Sunday";
            case 3 -> "Monday";
            case 4 -> "Tuesday";
            case 5 -> "Wednesday";
            case 6 -> "Thursday";
            case 7 -> "Friday";
            default -> "Invalid";
        };
        System.out.println("The month is : " + result);
    }
}
