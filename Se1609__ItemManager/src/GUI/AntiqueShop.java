package GUI;

import DTO.Item;
import DTO.Vase;
import DTO.Statue;
import DTO.Painting;

public class AntiqueShop {
    public static void main(String []args){
        System.out.println("Enter infofmation of Item:");
        Item s = new Item();
        s.input();
        s.output();
        System.out.println("Enter infofmation of Vase:");
        Vase s1 = new Vase();
        s1.inputVase();
        s1.outputVase();
        System.out.println("Enter infofmation of Statue:");
        Statue s2 = new Statue();
        s2.inputStatue();
        s2.outputStatue();
        System.out.println("Enter infofmation of Painting:");
        Painting s3 = new Painting();
        s3.inputPaining();
        s3.ouputPainting();
    }
}
