package DTO;

import E.Item;
import E.Vase;
import E.Statue;
import E.Painting;
import java.util.Scanner;

public class AntiqueShop {

    public static void main(String[] args) {
        ItemList obj = new ItemList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("0. init a sample data");
            System.out.println("1. add a new vase");
            System.out.println("2. add a new statue");
            System.out.println("3. add a new painting");
            System.out.println("4. display all items");
            System.out.println("5. find the items by the creator ");
            System.out.println("6. update the item by its index");
            System.out.println("7. remove the item by its index");
            System.out.println("8. display the list of vase items ");
            System.out.println("9. sorts items in ascending order based on their values ");
            System.out.println("10. exit");
            System.out.print("input your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    obj.initSampleData();
                    break;
                case 1:
                    Item tmp = new Vase();
                    tmp.input();
                    if (obj.addItem(tmp)) {
                        System.out.println("An item is added into list items.");
                    } else {
                        System.out.println(" Cannot added items.");
                    }
                    break;
                case 2:
                    Item tmp2 = new Statue();
                    tmp2.input();
                    if (obj.addItem(tmp2)){
                        System.out.println("added");
                    }
                    break;
                case 3:
                    Item tmp3 = new Painting();
                    tmp3.input();
                    if (obj.addItem(tmp3)){
                        System.out.println("added");
                    }
                    break;
                case 4:
                    obj.displayAll();
                    break;
                case 5:
                    Item itemFound = obj.findItem("tien anh");
                    break;
                case 6:
                    System.out.println("K???ch b???n: t??m ki???m item theo creator");
                    System.out.println("N???u t??m th???y h???i ng?????i d??ng c?? mu???n update kh??ng");
                    System.out.println("N???u c?? th?? g???i h??m update");
                    Scanner sc6 = new Scanner(System.in);
                    String creator6 = sc6.nextLine();
                    int idx6 = obj.findItemIndex(creator6);
                    if (idx6 >= 0) {
                        System.out.println("H??? th???ng t??m th???y creator ??? v??? tr??: " + idx6);
                        System.out.println("B???n c?? mu???n update kh??ng? c/k");
                        sc6 = new Scanner(System.in);
                        System.out.println("Tr??? l???i: ");
                        if (sc6.nextLine().equalsIgnoreCase("c")){
                            if (obj.updateItem(idx6)){
                                System.out.println("update is sucess!");
                        } else { System.out.println("update is fail!");}
                    } else {System.out.println("H??? th???ng kh??ng t??m ???????c creator");}
                    }
                    break;
                case 7:
                    System.out.println("K???ch b???n: t??m ki???m item theo creator");
                    System.out.println("N???u t??m th???y h???i ng?????i d??ng c?? mu???n remove kh??ng");
                    System.out.println("N???u c?? th?? g???i h??m remove");
                    Scanner sc7 = new Scanner(System.in);
                    String creator7 = sc7.nextLine(); 
                    int idx7 = obj.findItemIndex(creator7);
                    if (idx7 >= 0) {
                        System.out.println("H??? th???ng t??m th???y creator ??? v??? tr??: " + idx7);
                        System.out.println("B???n c?? mu???n x??a item n??y kh??ng? c/k");
                        System.out.println("Tr??? l???i:");
                        if (sc7.nextLine().equalsIgnoreCase("c")){
                            if (obj.removeItem(idx7) == true)
                                System.out.println("Remove success!");
                            else 
                                System.out.println("Remove failed!");
                        } else 
                            System.out.println("H??? th???ng kh??ng t??m ???????c creator");
                    }
                    break;
                case 8:
                    String type = "Painting";
                    obj.displayItemsByType(type);
                    break;
                case 9:
                    obj.sortItems();
                    obj.displayAll();
                    break;
                case 10:
                    obj.lsItems();
            }
        } while (choice <= 10);
    }

}
