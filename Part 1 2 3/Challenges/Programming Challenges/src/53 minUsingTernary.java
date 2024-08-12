import java.util.Scanner;

class minUsingTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to minimum calculator using ternary operator");
        System.out.println();
        System.out.print("Please enter first number : ");
        int first = input.nextInt();
        System.out.print("Please enter second number : ");
        int second = input.nextInt();

        minUsingTernary it = new minUsingTernary();

        int minimum = it.min(first,second);
        System.out.println("Minimum number is : "+minimum);
    }

    public int min(int num1,int num2)   {
        return num1 < num2 ? num1 : num2;
    }
}
