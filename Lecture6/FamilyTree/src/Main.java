public class Main {
    public static void main ( String[] args ) {
        Person[] persons = new Person[5];

        persons[0] = new King("Arthur", 50);
        persons[1] = new Queen("Elizabeth", 48);
        persons[2] = new Prince("Davor", 25);
        persons[3] = new Person("Persona", 20);

        for (Person p: persons) {
            p.print();
        }
    }
}