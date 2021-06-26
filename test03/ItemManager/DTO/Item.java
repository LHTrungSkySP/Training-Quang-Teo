package DTO;
import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;
    public void Item(){}
    public void Item(int value,String creator){
        this.value=value;
        this.creator=creator;
    }
    public void setter_value(int value){
        this.value=value;
    }
    public void setter_creator(String creator){
        this.creator=creator;
    }
    public int getter_value(){
        return value;
    }
    public String getter_creator(){
        return creator;
    }
    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value: ");
        value=sc.nextInt();
        System.out.print("Enter creator: ");
        creator=sc.next();
    }
    public void Output(){
        System.out.println("Value= "+ value);
        System.out.println("creator= "+ creator);
    }
}
