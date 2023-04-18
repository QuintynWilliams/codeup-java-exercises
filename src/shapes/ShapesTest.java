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

        Quadrilateral myShape;
        myShape = new Rectangle(5, 9);
//      DNE in Measurable, instance defines variable .˙. not executable
//        System.out.println(myShape.getLength());
//        System.out.println(myShape.getWidth());
        System.out.println(myShape.getPerimeter());
//      28.0
        System.out.println(myShape.getArea());
//      45.0

        myShape = new Square(7);
//      DNE in Measurable, instance defines variable .˙. not executable
//        System.out.println(myShape2.getSide());
        System.out.println(myShape.getPerimeter());
//      28.0
        System.out.println(myShape.getArea());
//      49.0
    }




}
