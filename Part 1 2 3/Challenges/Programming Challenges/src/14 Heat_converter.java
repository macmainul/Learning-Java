import java.util.Scanner;

class Heat_converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Fahrenheit to Celsius Scale ");
        System.out.print("Enter heat in Fahrenheit F = ");
        double f = input.nextDouble();

        double c = (f-32) * 5/9;
        System.out.println("Heat in Celsius scale  C =  " +c);
    }
}
