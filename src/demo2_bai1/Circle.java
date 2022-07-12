package demo2_bai1;

public class Circle {
    private double raduis;
    private String color;

    public Circle() {
    }

    public Circle(double raduis, String color) {
        this.raduis = raduis;
        this.color = color;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.raduis * this.raduis * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.raduis * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "raduis=" + raduis +
                ", color='" + color + '\'' +
                '}';
    }
}
