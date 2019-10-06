public class Rectangle {
    double lengthA;
    double lengthB;

    public Rectangle(double a, double b) {
        lengthA = a;
        lengthB = b;
    }

    public double calcPerimeter() {
        double recPerimeter = lengthA * 2 + lengthB * 2;
        return recPerimeter;
    }
}
