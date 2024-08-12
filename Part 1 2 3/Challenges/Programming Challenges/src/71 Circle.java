import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius)  {
        this.radius = radius;
    }
    double getCircumference(double radius) {
        return 2 * radius * Math.PI;
    }
    double getArea(double radius)   {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle : Radius : "+ radius +" Circle Circumferecne : "+ getCircumference(radius) +" Circle Area : "+getArea(radius);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of circle \n");
        System.out.print("Please enter the radius of circle : ");
        double radius = input.nextDouble();

        Circle circel = new Circle(radius);
        System.out.println(circel);
    }
}
