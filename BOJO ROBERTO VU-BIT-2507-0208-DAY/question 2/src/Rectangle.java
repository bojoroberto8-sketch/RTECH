public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height,
        String color, boolean filled)
    throws InvalidShapeException {

    if (width <=0 || height <= 0) {
        throw new InvalidShapeException("Width and height must be positive");
    }

    this.width = width;
    this.height = height;
    this.color = color;
    this.filled = filled;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public void resize(double factor)
        throws InvalidShapeException {
            
    if (factor<= 0) {
        throw new InvalidShapeException("Factor must be positive");
    }
    width = width * factor;
    height = height * factor;
    }
}
