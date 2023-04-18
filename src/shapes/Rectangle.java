package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    protected double length;
    protected double width;

    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return (this.width * 2) + (this.length * 2);
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    public Rectangle() {}
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

}
