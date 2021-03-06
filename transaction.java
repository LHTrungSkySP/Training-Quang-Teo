
import java.util.Scanner;
class Client{
    Scanner sc= new Scanner(System.in);

    String name;
    int age;
    public Client(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(){
        System.out.print("Enter client's name: ");
        name=sc.nextLine();
    }
    public void setAge(){
        System.out.print("Enter client's age: ");
        age=sc.nextInt();
    }
    public String toString(){
        return name + " : " + age;
    }
}
class Transaction{
    Account client;
    int value;
    public Transaction(){}
    public Transaction(Account client,int value){
        this.client=client;
        this.value=value;
        this.client.balance+=value;

    }
    public int value(){
        return value;
    }
}
class listTransaction{
    Transaction[] x;
    int num=0;
    public listTransaction(){
        x=new Transaction[100];
    }
    public void add(Transaction bill){
        x[num]=bill;
        num++;
    } 
    public void display(){
        if(num!=0){
            for(int i=0;i<num;i++){
                System.out.println(x[i].value);
            }
        }
        else{
            System.out.println("Not found any transaction");
        }
    }
}
class Account{
    listTransaction list=new listTransaction();
    Client X ;
    int balance=0;
    public Account(){}
    public Account(Client X){
        this.X=X;
    }
    public boolean process(Transaction t){
        if(t==null){
            return false;
        }
        else{
            list.add(t);
            return true;
        }
    }
    public void displayall(){
        System.out.println("Name: "+ X.name);
        System.out.println("Age: "+ X.age);
        list.display();
    }
}
class FilteredAccount extends Account{ 
    int sum=0;
    public boolean process(Transaction t){
        if(t==null){
            return false;
        }
        else if( t.value()==0){
            sum++;
            return false;
        }
        else{
            list.add(t);
            sum++;
            return true;
        }
    }
    public double percentFiltered(){
        return (double)list.num/sum;
    }
}
public class transaction {
    public static void main(String [] args) {
        Client KH=new Client("trung",10);
        Account TK=new Account(KH);
        Transaction GD=new Transaction(TK, 2222);
        Transaction GD2=new Transaction(TK, 0);
        Transaction GD3=new Transaction(TK, -4444);
        FilteredAccount fillTK=new FilteredAccount();
        TK.process(GD);
        TK.process(GD2);
        TK.process(GD3);
        TK.displayall();
        fillTK.process(GD);
        fillTK.process(GD2);
        fillTK.process(GD3);
        System.out.println(fillTK.percentFiltered());       
        System.out.println(fillTK.balance);
    }
}
