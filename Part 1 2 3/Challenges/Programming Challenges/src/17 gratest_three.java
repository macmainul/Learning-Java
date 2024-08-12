import java.util.Scanner;

class gratest_three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int frist , second , third ;
        System.out.print("Enter first : ");
        frist = input.nextInt();
        System.out.print("Enter second : ");
        second = input.nextInt();
        System.out.print("Enter third : ");
        third = input.nextInt();

        if(frist > second && frist > third )
        {
            System.out.println(frist + "is the greast number");
        }
        else if(second > third) {
            System.out.println(second + "the gretest number");
        }
        else {
            System.out.println(third + "the gratest number");
        }

    }

}
