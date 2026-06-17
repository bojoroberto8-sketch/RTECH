public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3,
                    String color, boolean filled)
                throws InvalidShapeException {
            
            if (side1 <= 0 || side2 <= 0 || side3<= 0) {
                throw new InvalidShapeException("Sides must be positive");
            }

            if (side1 + side2 <= side3 ||
                side1 + side3 <= side2 ||
                side2 + side3 <= side1 ) {
                throw new InvalidShapeException("Invalid Triangle");   
            }

            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.color = color;
            this.filled = filled;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s- side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void resize(double factor)
            throws InvalidShapeException {
        
        if (factor <= 0) {
            throw new InvalidShapeException("Factor must be positive");
        }

        side1 = side1 * factor;
        side2 = side2 * factor;
        side3 = side3 * factor;
            }
     
}
