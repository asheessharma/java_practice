abstract class marks{
     public abstract float getp();
}
class A extends marks{
    int mark1,mark2,mark3;
    A(int m1,int m2,int m3){
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    public float getp(){
        float t4=(mark1+mark2+mark3)/(float)300*100;
        return t4;
    }
}
class b extends marks{
    int mark1,mark2,mark3,mark4;
    b(int m1,int m2,int m3,int m4){
        mark1=m1;
        mark2=m2;
        mark3=m3;
        mark4=m4;
    }
    public float getp(){
        float t=(mark1+mark2+mark3+mark4)/(float)400*100;
        return t;
    }
}
public class pq {
    public static void main(String[] args) {
        A a=new A(5,5,5);
        System.out.println(a.getp());
        b o=new b(2,3,4,5);
        System.out.println(o.getp());

    }
}
