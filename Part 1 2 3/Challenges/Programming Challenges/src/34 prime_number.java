import java.util.Scanner;

class prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime calculator ");
        System.out.print("Enter the first number : ");
        int num = input.nextInt();

        boolean isPrime = isPeime(num);

        if(isPrime) {
            System.out.println("The number is prime ");
        }else {
            System.out.println("The number is not prime");
        }
    }

    public static boolean isPeime(int num)  {
        if(num == 1) return true;
        int i=2;
        while(i < num)  {
            if(num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
