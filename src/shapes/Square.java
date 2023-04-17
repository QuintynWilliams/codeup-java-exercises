package shapes;

class Square extends Rectangle{

    protected int side;


    public int getArea() {
        System.out.println("SubClass: ");
        return this.side * this.side;
    }
    public int getPerimeter() {
        System.out.println("SubClass: ");
        return this.side * 4;
    }

    public Square() {}
    public Square(int value) {
        this.side = value;
        setDimensions(value, value);
    }

}

