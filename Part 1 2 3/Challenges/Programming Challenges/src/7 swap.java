import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter two number for swaping");
        System.out.print(" Enter number a = ");
        int a = input.nextInt();
        System.out.print(" Enter number b = ");
        int b = input.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.print("After swaping a = " + a );
        System.out.println(" and b = " +b);

    }
}
