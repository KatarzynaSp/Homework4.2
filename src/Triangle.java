public class Triangle {
    double lengthA;
    double lengthB;
    double lengthC;

    public Triangle(double a, double b, double c) {
        lengthA = a;
        lengthB = b;
        lengthC = c;
    }

    double calcPerimeter() {
        double trianglePerimeter = lengthA + lengthB + lengthC;
        return trianglePerimeter;
    }

}
