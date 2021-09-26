import java.util.Locale;
import java.util.Scanner;
public class palin_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str,rev="";
        str= sc.next();
        for(int i=(str.length()-1);i>=0;--i){
            rev= rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("String is  palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }
    }
}
