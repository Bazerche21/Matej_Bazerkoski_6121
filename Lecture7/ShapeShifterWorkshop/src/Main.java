public class Main {
    public static void main ( String[] args ) {
        Circle circle = new Circle(4.0);
        Square square = new Square(3.0);
        Cube cube = new Cube(5.0);

        System.out.println("The area of the circle is: " + circle.area());
        System.out.println("The perimeter of the circle is: " + circle.perimeter());

        System.out.println("The area of the square is: " + square.area());
        System.out.println("The perimeter of the square is: " + square.perimeter());

        System.out.println("The volume of the cube is: " + cube.volume());
    }
}