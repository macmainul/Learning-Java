import java.util.Scanner;

class odd_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to odd sum calculator ");
        System.out.print("Enter the range : ");

        int n = input.nextInt();

        int ans = 0;
        ans = 0;

        int i = 1;
        while (i <= n)  {
            if((i & 1) == 1)    {
                ans += i;
            }
            i++;
        }
        System.out.println("From 1 to "+ n + " sum of all odd = " + ans);
    }
}
