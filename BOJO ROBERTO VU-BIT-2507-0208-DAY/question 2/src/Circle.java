public class Circle extends Shape {
    
    private double radius;

    public Circle(double radius, String color, boolean filled)
            throws InvalidShapeException {

                if (radius <= 0) {
                    throw new InvalidShapeException("Radius must be positive");
                }
                this.radius = radius;
                this.color = color;
                this.filled = filled;
            }

            @Override
            public double getArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }

            @Override
            public void resize(double factor)
                    throws InvalidShapeException {
                if (factor <= 0) {
                    throw new InvalidShapeException("Factor must be positive");
                }
                radius = radius * factor;
                    }
}
