import java.util.Scanner;

public class Avrg {
    int roll_no,age;
    float height;
}
class avg1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Avrg [] student=new Avrg[3];
        for(int i=0;i< student.length;i++){
            student[i]=new Avrg();
        }
        float average=0;
        for (Avrg avrg : student) {
            avrg.roll_no = sc.nextInt();
            avrg.age = sc.nextInt();
            avrg.height = sc.nextInt();
            average += avrg.age;
        }
        System.out.println("Average of age : "+ (average)/ student.length);
    }
}
