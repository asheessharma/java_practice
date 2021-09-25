import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        float sum=0;
        System.out.println("enter "+n+" numbers:-");
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }

       for(int num:arr){
            sum+=num;
        }
        System.out.println("Average of entered numbers is: "+ sum/n);
    }

}
