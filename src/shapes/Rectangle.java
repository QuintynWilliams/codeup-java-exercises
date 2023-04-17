package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public void setDimensions(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }

    public int getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
    public int getArea() {
       return this.length * this.width;
    }

    public Rectangle() {}
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
