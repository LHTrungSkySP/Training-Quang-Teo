package E;
import java.util.Scanner;

public class Painting extends Item {

    private int height;
    private int width;
    public boolean isWatercolour;
    public boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a height: ");
        height = sc.nextInt();
        System.out.println("enter a width: ");
        width = sc.nextInt();
        System.out.println("enter a isWatercolour: ");
        isWatercolour = sc.hasNextBoolean();
        System.out.println("enter a isFramed: ");
        isFramed = sc.hasNextBoolean();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println("isWatercolour: " + isWatercolour);
        System.out.println("isFramed: " + isFramed);
    }

    @Override
    public String toString() {
        String s = super.toString() + "\n";
        s += "Painting{" + "height=" + height + ", width=" + width + ", isWatercolour=" + isWatercolour + ", isFramed=" + isFramed + '}';
        return s;
    }
    

    public void trimPainting() {
        width -= 1;
    }

    public void trimPainting(int amount) {
        width -= amount;
    }
}