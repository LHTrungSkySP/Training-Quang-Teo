package DTO;

import E.Item;
import E.Vase;
import E.Statue;
import E.Painting;
class ItemList {

    protected Item lstItems[];
    final int MAX = 1000;
    int numOfItems = 0;
// khai báo số lượng phần tử 
    public ItemList() {
        lstItems = new Item[MAX];
    }

    public ItemList(int No_Of_Items) {
        if (No_Of_Items < MAX) {
            lstItems = new Item[No_Of_Items];
        } else {
            System.out.println("System cannot allocate number of items over " + MAX + " items.");
            System.out.println("Please try again!");
        }
    }

    public boolean addItem(Item item) {
        if (item == null || numOfItems > MAX) {
            return false;
        } else {
            lstItems[numOfItems] = item;
            numOfItems++;
            return true;
        }
    }

    public void lsItems() {
        for (int i = 0; i < numOfItems; i++) {
            System.out.println(" Infor Item " + (i + 1));
            lstItems[i].output();
            System.out.println("===========================");
        }
        System.out.println("End of list Items infor.");
    }
    public void displayAll() {
        if (numOfItems == 0) {
            System.out.println("the list is empty");
        }
        for (int i = 0; i < numOfItems; i++) {
            System.out.println(lstItems[i]);
        }
    }
    public Item findItem(String creator) {
        for (int i = 0; i < numOfItems; i++) {
            if (lstItems[i].getCreator().equals(creator)) {
                return lstItems[i];
            }
        }
        return null;
    }
    public int findItemIndex(String creator) {
        for (int i = 0; i < numOfItems; i++) {
            if (lstItems[i].getCreator().equals(creator)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeItem(int index) {
        if (index < 0 || index > numOfItems){
            return false;
        } else {
            for (int i = index; i < numOfItems; i++){
                lstItems[i] = lstItems[i+1];
                lstItems[numOfItems] = null;
            }
                numOfItems --;
                return true;
        }
    }
    public boolean updateItem(int index) {
        if (index < 0 || index > numOfItems) {
            return false;
        } else {
            lstItems[index].input();
            return true;
        }
    }

    public void displayItemsByType(String type) {

        if (type.equals("Vase")) {
            for (int i = 0; i < numOfItems; i++) {
                if (lstItems[i] instanceof Vase) {
                    System.out.println(lstItems[i]);
                }
            }
        } else if (type.equals("Statue")) {
            for (int i = 0; i < numOfItems; i++) {
                if (lstItems[i] instanceof Statue) {
                    System.out.println(lstItems[i]);
                }
            }
        } else {
            for (int i = 0; i < numOfItems; i++) {
                if (lstItems[i] instanceof Painting) {
                    System.out.println(lstItems[i]);
                }
            }
        }
    }

    public void sortItems() {
        for (int i = 0; i < numOfItems; i++) {
            for (int j = numOfItems - 1; j > i; j--) {
                if (lstItems[i].getValue() < lstItems[j - 1].getValue()) {
                    Item tmp = lstItems[j];
                    lstItems[j] = lstItems[j - 1];
                    lstItems[j - 1] = tmp;
                }
            }
        }

    }  
    public void initSampleData(){
        Item i1 = new Vase(101, "tien anh", 165, "diamond");
        lstItems[numOfItems] = i1;
        numOfItems++;
        Item i2 = new Vase(102, "chinh", 150, "metal");
        lstItems[numOfItems] = i2;
        numOfItems++;
        Item i3 = new Statue(103, "chung", 280, "pink");
        lstItems[numOfItems] = i3;
        numOfItems++;
        Item i4 = new Painting(104, "linhnt", 168, 600, true, false);
        lstItems[numOfItems] = i4;
        numOfItems++;
        Item i5 = new Vase(105, "haont", 151, "wood");
        lstItems[numOfItems] = i5;
        numOfItems++;
    }
}