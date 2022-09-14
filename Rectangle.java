public class Rectangle {
    private int width;
    private int height;

    // constructor with two paramters
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle01 = new Rectangle(10, 20);
        System.out.println(rectangle01.area());
        System.out.println(rectangle01.perimeter());
    }
}