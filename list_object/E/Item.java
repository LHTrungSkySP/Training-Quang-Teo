package E;
import java.util.Scanner;
public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value:");
        value = sc.nextInt();
        System.out.print("enter a creator:");
        sc = new Scanner(System.in);
        creator = sc.nextLine();
    }

    public void output() {
        System.out.println("enter a value:" + value);
        System.out.println("enter a creator:" + creator);
    }

    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + '}';
    }

}
