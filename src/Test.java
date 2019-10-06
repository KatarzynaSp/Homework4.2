public class Test {
    public static void main(String[] args) {

        Square square = new Square(2);
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double p1 = shapeCalculator.squareArea(square);
        System.out.println(p1);

        Circle circle = new Circle(2);
        double p2 = shapeCalculator.circleArea(circle);
        System.out.println(p2);

        Triangle triangle = new Triangle(1, 2, 3);
        double l1 = shapeCalculator.trianglePerimeter(triangle);
        System.out.println(l1);

        Rectangle rectangle = new Rectangle(2, 2);
        double l2 = shapeCalculator.rectPerimeter(rectangle);
        System.out.println(l2);
    }

}
