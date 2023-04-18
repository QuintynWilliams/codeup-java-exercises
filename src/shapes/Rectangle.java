package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
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
