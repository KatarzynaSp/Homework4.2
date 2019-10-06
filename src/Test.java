public class Test {
    public static void main(String[] args) {

        Square square = new Square(2);
        double squareArea = square.calcArea();
        System.out.println(squareArea);

        Circle circle = new Circle(2);
        double circleArea = circle.calcArea();
        System.out.println(circleArea);

        Triangle triangle = new Triangle(1, 2, 3);
        double trianglePerimeter = triangle.calcPerimeter();
        System.out.println(trianglePerimeter);

        Rectangle rectangle = new Rectangle(2, 2);
        double rectPerimeter = rectangle.calcPerimeter();
        System.out.println(rectPerimeter);
    }
}