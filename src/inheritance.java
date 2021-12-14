class ques1{
    void m1(){
        System.out.println("Answer1");
    }
}
class ques2 extends ques1{
    void m2(){
        System.out.println("Answer2");
    }
}
public class inheritance extends ques2{
    public static void main(String[] args) {
        inheritance obj1=new inheritance();
        obj1.m1();
        obj1.m2();
    }
}
