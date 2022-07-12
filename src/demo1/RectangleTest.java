package demo1;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle);

        rectangle = new Rectangle("red", false, 5.0, 5.5);
        System.out.println(rectangle);
    }
}
