package DTO;

import java.util.Scanner;
public class Item {
    protected int value;
    protected String creator;
    
    public Item(){
        
    }
    
    public Item(int value, String creator){
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
    

    public void input(){
        Scanner it = new Scanner(System.in);
        System.out.println("input a value: ");
        do{
           value = it.nextInt(); 
        }while(value<=0);        
        System.out.println("input a creator: ");
        do{
            creator = it.nextLine();
        }while(creator.isEmpty());
    }
    
    public void output(){
        System.out.println("value= " + value);
        System.out.println("creator= " + creator);
    }
}    
