package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }
    public void setLength(Double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }

    public Quadrilateral() {}
    public Quadrilateral(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

}
