public class MainStart {

    public static void main(String[] args) {
        Triangle tringle1 = new Triangle(new Point(.0, .0), new Point(1, 2), new Point(3, .0));
        Triangle tringle2 = new Triangle(new Point(.0, .0), new Point(1, 0.), new Point(1, 3));
        Triangle tringle3 = new Triangle(new Point(.0, .0), new Point(1, 2), new Point(.0, 4));
        Triangle tringle4 = new Triangle(new Point(1, 3), new Point(2, 4), new Point(4, 4));
        Triangle[] triangles = {tringle1, tringle2, tringle3, tringle4};
        TriangleOperation operation = new TriangleOperation(triangles);
        operation.outCountDifferentType();
        operation.maxPerimeterInGroup();
        operation.minPerimeterInGroup();
        operation.maxSquareInGroup();
        operation.minSquareInGroup();

    }
}
