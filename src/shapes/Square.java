package shapes;

class Square extends Quadrilateral implements Measurable {

    protected double side;

    @Override
    public double getPerimeter() {
        return (this.side * 4);
    }

    @Override
    public double getArea() {
        return (Math.pow(this.side, 2));
    }

    public Square() {}
    public Square(double value) {
        this.side = value;
    }

}

