public class Cube implements ThreeDimensionalShape{
    private double side;

    public Cube ( double side ) {
        this.side = side;
    }

    @Override
    public double volume () {
        return side*side*side;
    }
}
