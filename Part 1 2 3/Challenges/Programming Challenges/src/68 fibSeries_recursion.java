import java.util.Scanner;

class fibSeries_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to world fibonacci series \n");

        System.out.print("please enter the NUM that where you want to print : " );
        int num = input.nextInt();

        for (int i = 1; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int num)  {
        if(num == 1)    return 0;
        if(num == 2)    return 1;
        return fib(num-2) + fib(num -1);
    }
}
