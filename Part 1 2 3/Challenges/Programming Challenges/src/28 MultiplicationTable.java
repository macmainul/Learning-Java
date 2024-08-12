import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication table");
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (i * num));
            i++;
        }
    }
}
