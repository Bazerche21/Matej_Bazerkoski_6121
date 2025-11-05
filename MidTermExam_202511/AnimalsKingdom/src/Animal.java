public class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void makeSound(){
        System.out.println("The "+ species + " makes a generic sound.");
    }

    public void displayInfo(){
        System.out.println("Animal: " + name + ", Species: " + species + ".");
    }
}
