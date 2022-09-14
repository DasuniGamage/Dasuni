public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    // constructor to obtain details
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // method to show details
    public void showDetails() {
        System.out.println("");
        System.out.println("Side 01 = " + side1);
        System.out.println("Side 02 = " + side2);
        System.out.println("Side 03 = " + side3);
    }

    // method to check tiangle type
    public void triangleType() {
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        // creation of 03 triangle objects
        Triangle triangle1 = new Triangle(10, 20, 15);
        Triangle triangle2 = new Triangle(10, 10, 10);
        Triangle triangle3 = new Triangle(10, 10, 15);

        // display detials and type of triangle 01
        System.out.println("Triangle one");
        triangle1.showDetails();
        triangle1.triangleType();

        // display detials and type of triangle 02
        System.out.println("Triangle Two");
        triangle2.showDetails();
        triangle2.triangleType();

        // display detials and type of triangle 03
        System.out.println("Triangle Three");
        triangle3.showDetails();
        triangle3.triangleType();
    }

}