import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year finding programme\n");

        System.out.print("Enter the year : ");
        int year = input.nextInt();

        if(year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0) )   {
            System.out.println("The year is  leap year");
        }
        else    {
            System.out.println("The year is not leap");
        }

    }
}
