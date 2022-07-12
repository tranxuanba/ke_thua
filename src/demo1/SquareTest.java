package demo1;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4);
        System.out.println(square);

        square = new Square("red", false, 5);
        System.out.println(square);
    }
}
