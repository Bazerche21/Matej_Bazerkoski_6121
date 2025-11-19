public class Square implements TwoDimensionalShape{

    private double a;

    public Square ( double a ) {
        this.a = a;
    }

    @Override
    public double area () {
        return a*a;
    }

    @Override
    public double perimeter () {
        return 4*a;
    }
}
