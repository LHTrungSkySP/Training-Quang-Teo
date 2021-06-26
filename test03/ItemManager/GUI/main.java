package GUI;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the list of names:");
        String[] list = new String[10];
        for(int i = 0; i < 2; i++){
            list[i] = sc.nextLine();
            
        }System.out.println("list of names after uppercase:");
        for(int i = 0; i < 2; i++){
            list[i]=list[i].substring(0,1).toUpperCase() + list[i].substring(1).toLowerCase();
            System.out.println(list[i]);
        }
    }
}