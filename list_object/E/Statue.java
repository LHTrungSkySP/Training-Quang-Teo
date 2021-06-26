package E;
public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int weight, String colour) {
        super();
        this.weight = weight;
        this.colour = colour;
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public void displayPrice() {
        if (weight < 100) {
            System.out.println("The price is " + 2000 + "$");
        } else {
            System.out.println("The price is " + 3000 + "$");
        }
    }
}