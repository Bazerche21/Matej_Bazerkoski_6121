public class Lion extends Animal {

    public Lion ( String name ) {
        super(name);
    }

    @Override
    public void onomatopeia () {
        System.out.println(name + "Roar, roar");
    }
}
