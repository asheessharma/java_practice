//import java.util.Scanner;
//default constructor
public class que_class1 {
    int roll_no;
    String name;

    que_class1(int i,String s){
        this.roll_no=i;
        this.name=s;
    }
    que_class1(que_class1 s){
        System.out.println("Copied values");
       roll_no=s.roll_no;
       name=s.name;
    }
    que_class1(){}
    void display(){
        System.out.println("Name "+name+" Roll no "+roll_no);
    }

    public static void main(String[] args) {
        que_class1 pc=new que_class1(18 , "ashish");
        que_class1 dc=new que_class1(pc);
        que_class1 q3=new que_class1();
        q3.roll_no=pc.roll_no;
        q3.name=pc.name;
        pc.display();
        dc.display();
        q3.display();


    }

}
