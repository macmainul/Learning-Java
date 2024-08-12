import java.util.Scanner;

class area_of_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eenter Base & Hieght : ");
        float b,h;
        b = input.nextFloat();
        h = input.nextFloat();

        double area = 2.5 * (double) b * h;

        System.out.println("Area of tri-angle is = " + area);
    }
}
