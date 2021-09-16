class hs{
    int age;
    String name;
    hs(int age, String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return age + " " + name; 
    }
}
class lophoc{
    int malop;
    hs x;
    public lophoc(int malop, hs x){
        this.malop=malop;
        this.hs=hs;
    }
}
public class point
{
    public static void main(String [] args){
        hs a,b;
        hs c=new hs(10,"trung");
        a=c;
        b=c;
        b.age=5;
        System.out.println(a);
        System.out.println(b);
        // b=6;
        // // b++;
        // System.out.println(a);
        // System.out.println(b);      
    }

}
