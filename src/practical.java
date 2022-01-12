import java.util.Scanner;
public class practical {
    Scanner sc=new Scanner(System.in);
    String s= sc.next();
    public void name(){
        System.out.println("unknown");
    }
    public void name(String s){
        System.out.println("student name: "+s);
    }

    public static void main(String[] args) {
        practical p=new practical();
        p.name(p.s);
    }
}
