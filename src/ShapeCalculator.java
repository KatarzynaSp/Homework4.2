public class ShapeCalculator {

    double squareArea(Square square) {
        double p = square.length * square.length;
        return p;
    }

    double circleArea(Circle circle) {
        double p = 3.14 * circle.radiant * circle.radiant;
        return p;
    }

    double trianglePerimeter(Triangle triangle) {
        double l = triangle.lengthA + triangle.lengthB + triangle.lengthC;
        return l;
    }

    double rectPerimeter(Rectangle rectangle) {
        double l = rectangle.lengthA * 2 + rectangle.lengthB * 2;
        return l;
    }
}