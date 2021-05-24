package DTO;

import java.util.Scanner;

public class Vase extends Item{
    private int height;
    private String material;
    public Vase(){
        
    }
    
    public Vase(int v, String c, int h, String m){
        super(v,c);
        height = h;
        material = m;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void inputVase(){
        input();
        Scanner sc = new Scanner(System.in);//sanner gọi một lần là được
        System.out.println("input a height: ");
        /* int*/ height = sc.nextInt();  //mỗi biến khai báo một lần thôi
        System.out.println("input a material: ");
        material = sc.next();
    }
    
    public void outputVase(){
        output();
        System.out.println("height: " + height);
        System.out.println("material: " + material);
    }

    // @Override
    // public String toString() {
    //     return "value: " + getValue() + "creator: " + getCreator() + "height: " + getHeight() + "material: " + getMaterial();
    // }
    
}
