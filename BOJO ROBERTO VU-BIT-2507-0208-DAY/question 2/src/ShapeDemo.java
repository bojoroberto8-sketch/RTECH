public class ShapeDemo {

    public static void printAreas(Shape [] shapes) {

        for (Shape s : shapes) {
            System.out.println("Area = " + s.getArea());
        }
    }

    public static Shape largest(Shape[] shapes) {
        Shape largestShape = shapes[0];

        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].getArea() > largestShape.getArea()) {
                largestShape = shapes[i];
                
            }
        }

        return largestShape;
    }
    public static void main(String[] args) {
        try {
            Shape circle = new Circle(5, "Red", true);
            Shape rectangle = new Rectangle(4, 6, "Blue", false);
            Shape triangle = new Triangle(3, 4, 5, "Green", true);

            System.out.println("Circle Area = " + circle.getArea());
            System.out.println("Circle Perimeter = " + circle.getPerimeter());

            System.out.println("Rectangle Area = " + rectangle.getArea());
            System.out.println("Rectangle Perimeter = " + rectangle.getPerimeter());

            System.out.println("Triangle Area = " + triangle.getArea());
            System.out.println("Triangle Perimeter = " + triangle.getPerimeter());

            Shape[] shapes = {circle, rectangle, triangle};

            System.out.println("\nAreas of all shapes:");
            printAreas(shapes);

            Shape largestShape = largest(shapes);

            System.out.println("\nLargest Shape:");
            System.out.println(largestShape);
            System.out.println("Area = " + largestShape.getArea());

        } catch (InvalidShapeException e) {
            System.out.println(e.getMessage());
        }
    }
}
