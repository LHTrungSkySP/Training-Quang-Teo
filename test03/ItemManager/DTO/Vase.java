package DTO;
import java.util.Scanner;

class Vase extends Item{
    private int height;
    private String material;
    public Vase(){}
    public Vase(int heght, String material ){
        this.height=heght;
        this.material=material;
    }
    public void set_height(int height){
        this.height=height;
    }
    public void set_material(String material){
        this.material=material;
    }
    public int get_height(){
        return height;
    }
    public String get_material(){
        return material;
    }
    public void Input(){
        Input();
    }
}
