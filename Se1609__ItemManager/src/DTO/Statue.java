package DTO;

import java.util.Scanner;

public class Statue extends Item{
    private int weight;
    private String colour;
    
    public Statue(){
        
    }
    
    public Statue(int v, String c, int w, String cl){
        super(v,c);
        weight = w;
        colour = cl;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void outputStatue(){
        output();
        System.out.println("weight: " + weight);
        System.out.println("colour: " + colour);
    }
    
    public void inputStatue(){
        input();
        Scanner st = new Scanner(System.in);
        System.out.println("input a weight: ");
        weight = st.nextInt();
        System.out.println("input a colour: ");
        colour = st.next();
    }
}