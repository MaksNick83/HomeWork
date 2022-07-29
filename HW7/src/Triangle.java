
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private int type;
    private double perimeter;
    private double square;
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle() {
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
        this.type = 0;
        this.perimeter = 0;
        this.square = 0;
        this.lengthA = 0;
        this.lengthB = 0;
        this.lengthC = 0;
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.lengthA = lengthSide(a, b);
        this.lengthB = lengthSide(b, c);
        this.lengthC = lengthSide(a, c);
        this.type = typeTriangle();
        this.perimeter = perimeter();
        this.square = square();

    }

    private double square() {
        double poluPerimetr = (lengthA + lengthB + lengthC) / 2;
        return Math.pow((poluPerimetr * (poluPerimetr - lengthA) * (poluPerimetr - lengthB) * (poluPerimetr - lengthC)), 0.5);
    }

    private double perimeter() {
        return lengthA + lengthB + lengthC;
    }

    private int typeTriangle() {

        if (lengthA == lengthB && lengthB == lengthC && lengthA == lengthC) {
            return 1;
        } else if (lengthA == lengthB || lengthB == lengthC || lengthA == lengthC) {
            return 2;
        } else if (lengthC == (lengthA * lengthA) + (lengthB * lengthB)) {
            return 3;
        } else {
            return 4;
        }
    }

    public int getType() {
        return type;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    private double lengthSide(Point a, Point b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) +
                Math.pow((a.getY() - b.getY()), 2));
    }

}
