public class prac_ques {
    int rollno;
    String name;
    static String coll="GLA";
    prac_ques(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println("My name is "+name +" and roll no "+rollno+" in "+coll);
    }

    public static void main(String[] args) {
        prac_ques q1=new prac_ques(8,"ashish");
        prac_ques q2=new prac_ques(11,"sharma");
        q1.display();
        q2.display();
    }


}
