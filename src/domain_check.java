import java.util.Scanner;
public class domain_check {
    void email_check(String str){
        int l=str.length();
        char[] chr=str.toCharArray();
        if(chr[l-1]=='n'&& chr[l-2]=='i'&& chr[l-4]=='c'&&chr[l-5]=='a'){
            System.out.println("Its a valid email.");
        }
        else{
            System.out.println("Its an invalid email.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your email : ");
        String email= sc.nextLine();
        domain_check mail=new domain_check();
        mail.email_check(email);
    }
}
