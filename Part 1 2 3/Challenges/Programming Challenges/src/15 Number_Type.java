import java.util.Scanner;

class Number_Type {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to number type programme");
         System.out.print("Enter the nember :  ");
         int num = input.nextInt();

         if(num > 0)    {
             System.out.println("The number is positive ");
         }else if(num < 0)  {
             System.out.println("The number is negative");
         }else  {
             System.out.println("The nember is zero");
         }
     }
}
