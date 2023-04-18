package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle();
        box1.setDimensions(5, 4);
        System.out.println(box1.getPerimeter());
//      18
        System.out.println(box1.getArea());
//      20

        Square box2 = new Square(5);
        System.out.println(box2.getPerimeter());
//      20
        System.out.println(box2.getArea());
//      25

        Measurable myShape = new Rectangle(6, 5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        Measurable myShape2 = new Square(7);
        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getArea());
    }

}
