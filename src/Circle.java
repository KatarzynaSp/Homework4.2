public class Circle {
    double radiant;

    public Circle(double r) {
        radiant = r;
    }

    public double calcArea() {
        double circleArea = 3.14 * radiant * radiant;
        return circleArea;
    }
}
