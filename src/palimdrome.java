//import java.util.Scanner;
public class palimdrome {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        int num=1111,rem=0,rev=0;
        int temp=num;
        //for(int i=0;i<4 ;i++)
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if (rev==num){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("NUmber is not palindrome");
        }
    }
}
