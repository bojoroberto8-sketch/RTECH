public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
    }

        public abstract double getArea();
        public abstract double getPerimeter();
        public abstract void resize(double factor) throws InvalidShapeException;

        @Override
        public String toString() {
            return "Color: " + color + ", Filled: " + filled;
        }

    }

