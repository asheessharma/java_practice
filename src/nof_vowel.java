import java.util.Scanner;
public class nof_vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your sentence :");
        String sen=sc.nextLine();
        sen.toLowerCase();
        int c=0;
        for(int i=0;i<sen.length();i++){
            if(sen.charAt(i)=='a'||sen.charAt(i)=='e'||sen.charAt(i)=='i'||sen.charAt(i)=='o'||sen.charAt(i)=='u'){
                c++;
            }
        }
        System.out.println("No of vowels present : "+c);
    }
}
