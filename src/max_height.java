import java.util.Scanner;
class student{
    String name;
    int age;
    double h;
}
public class max_height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please enter number of people :-");
        int n= sc.nextInt();
        student []arr=new student[n];
        for(int i=0;i< arr.length;i++) {
            arr[i]=new student();
            System.out.println("Enter name,age,height of student "+ (i+1));
            arr[i].name= sc.next();
            arr[i].age= sc.nextInt();
            arr[i].h=sc.nextInt();
        }
        double  max_h=arr[0].h;
        int max_age=arr[0].age;

        for (int i=1;i<arr.length;i++) {
            if (arr[i].h > max_h) {
                max_h = arr[i].h;
            }
            if (arr[i].age > max_age) {
                max_age = arr[i].age;
            }

        }

        for(int j =0;j< arr.length;j++) {
            if(arr[j].h==max_h){
                System.out.println("Maximum height is " + max_h + " of " + arr[j].name);

            }
            if (arr[j].age==max_age){
                 System.out.println("Maximum age is " + max_age + " of " + arr[j].name);
            }

        }

    }
}

