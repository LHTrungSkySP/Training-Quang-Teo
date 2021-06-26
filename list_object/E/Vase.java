package E;
import java.util.Scanner;

public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
        super();
        height = 0;
        material = "";
    }

    public Vase(int height, String material) {
        super();
        this.height = height;
        this.material = material;
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    @Override
    public void input() {
        super.input();      //call the input method version of the father class
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a height:");
        height = sc.nextInt();
        System.out.print("enter a material:");
        sc = new Scanner(System.in);
        material = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();   //call the output method version of the father class
        System.out.println("height:" + height);
        System.out.println("material:" + material);
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n";
        s += "Vase{" + "height=" + height + ", material=" + material + '}';
        return s;
    }

}