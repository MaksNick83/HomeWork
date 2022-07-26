public class TriangleOperation {
    private Triangle[] triangles;

    public TriangleOperation(Triangle[] triangles) {
        this.triangles = triangles;
    }

    public TriangleOperation() {
        this.triangles = new Triangle[]{};
    }

    void maxSquareInGroup() {
        int[] difGroup = getCountDifGroup();
        for (int i = 0; i < difGroup.length; i++) {
            if (difGroup[i] > 0) {
                Triangle maxSquareTriangle = getTriangleMaxForGroup(i);
                System.out.println("Type " + getTextTypeTriangle(i) + " max square " + maxSquareTriangle.getSquare());
            }
        }
    }

    private Triangle getTriangleMaxForGroup(int i) {
        boolean setValue = false;
        Triangle maxSquareTriangle = new Triangle();
        for (Triangle triangle : triangles) {
            if (triangle.getType() == i) {
                if (!setValue) {
                    maxSquareTriangle = triangle;
                    setValue = true;
                }
                if (triangle.getSquare() > maxSquareTriangle.getSquare()) {
                    maxSquareTriangle = triangle;
                }
            }
        }
        return maxSquareTriangle;
    }

    void maxPerimeterInGroup() {
        int[] difGroup = getCountDifGroup();
        for (int i = 0; i < difGroup.length; i++) {
            if (difGroup[i] > 0) {
                Triangle maxPerimeterTriangle = getMaxPerimeter(i);
                System.out.println("Type " + getTextTypeTriangle(i) + " max perimeter " + maxPerimeterTriangle.getPerimeter());
            }
        }
    }

    private Triangle getMaxPerimeter(int i) {
        boolean setValue = false;
        Triangle maxPerimetrTriangle = new Triangle();
        for (Triangle triangle : triangles) {
            if ((triangle.getType() == i)) {
                if (!setValue) {
                    maxPerimetrTriangle = triangle;
                    setValue = true;
                }
                if ((triangle.getPerimeter() > maxPerimetrTriangle.getPerimeter())) {
                    maxPerimetrTriangle = triangle;
                }
            }
        }
        return maxPerimetrTriangle;
    }

    void minPerimeterInGroup() {
        int[] difGroup = getCountDifGroup();
        for (int i = 0; i < difGroup.length; i++) {
            if (difGroup[i] > 0) {
                Triangle minPerimeterTriangle = getMinPerimeter(i);
                System.out.println("Type " + getTextTypeTriangle(i) + " min perimeter " + minPerimeterTriangle.getPerimeter());
            }
        }
    }

    private Triangle getMinPerimeter(int i) {
        boolean setValue = false;
        Triangle minPerimetrTriangle = new Triangle();
        for (Triangle triangle : triangles) {
            if ((triangle.getType() == i)) {
                if (!setValue) {
                    minPerimetrTriangle = triangle;
                    setValue = true;
                }
                if (triangle.getPerimeter() < minPerimetrTriangle.getPerimeter()) {
                    minPerimetrTriangle = triangle;
                }
            }
        }
        return minPerimetrTriangle;
    }

    void minSquareInGroup() {
        int[] difGroup = getCountDifGroup();
        for (int i = 0; i < difGroup.length; i++) {
            if (difGroup[i] > 0) {
                Triangle minSquareTriangle = getTriangleMinForGroup(i);
                System.out.println("Type " + getTextTypeTriangle(i) + " min square " + minSquareTriangle.getSquare());
            }
        }
    }

    private Triangle getTriangleMinForGroup(int i) {
        boolean setValue = false;
        Triangle minSquareTriangle = new Triangle();
        for (Triangle triangle : triangles) {
            if (triangle.getType() == i) {
                if (!setValue) {
                    minSquareTriangle = triangle;
                    setValue = true;
                }
                if (triangle.getSquare() < minSquareTriangle.getSquare()) {
                    minSquareTriangle = triangle;
                }
            }
        }
        return minSquareTriangle;
    }

    void outCountDifferentType() {
        int[] difGroup = getCountDifGroup();

        for (int i = 0; i < difGroup.length; i++) {
            if (difGroup[i] != 0) {
                System.out.println("type " + getTextTypeTriangle(i) + " count " + difGroup[i]);
            }

        }
    }

    private int[] getCountDifGroup() {
        int[] group = new int[10];

        for (Triangle triangle : triangles) {
            if (triangle.getType() != 0) {
                group[triangle.getType()] = group[triangle.getType()] + 1;
            }
        }
        return group;
    }

    public String getTextTypeTriangle(int type) {
        String typeTriangle;
        if (type == 1) {
            typeTriangle = "equilateral";
        } else if (type == 2) {
            typeTriangle = "isosceles";
        } else if (type == 3) {
            typeTriangle = "rectangular";
        } else {
            typeTriangle = "arbitrary";
        }
        return typeTriangle;
    }

}
