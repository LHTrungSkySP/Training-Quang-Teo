package DTO;

import java.util.Scanner;

public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWaterclolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int v, String c, int h, int w, boolean wc, boolean f) {
        super(v,c);
        height = h;
        width = w;
        isWaterclolour = wc;
        isFramed = f;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWaterclolour() {
        return isWaterclolour;
    }

    public void setIsWaterclolour(boolean isWaterclolour) {
        this.isWaterclolour = isWaterclolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public void ouputPainting(){
        output();
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println("Is water clolour: " + isWaterclolour);
        System.out.println("Is water framed" + isFramed);       
    }
    public void inputPaining(){
        input();
        Scanner pt = new Scanner(System.in);
        System.out.println("input a height: ");
        height = pt.nextInt();
        System.out.println("input a width: ");
        width = pt.nextInt();
        System.out.println("input Is water clolour:");       
        isWaterclolour =Boolean.parseBoolean(pt.next());
        System.out.println("input Is Frame: ");  
        isFramed =Boolean.parseBoolean(pt.next());
    }
}
