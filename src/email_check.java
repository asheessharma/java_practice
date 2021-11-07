import java.util.Scanner;
public class email_check {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your email.");

        String email=sc.nextLine();
        int l=email.length();
        if((email.indexOf(".in",email.indexOf('@'))!=l-3)&&(email.indexOf(".ac",email.indexOf('@'))!=l-6)){
            System.out.println("This is not a valid email.");
        }
        else{
            System.out.println("your Email is valid.");
        }
    }
}
