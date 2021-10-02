import java.util.Arrays;
import java.util.Scanner;
public class array_comp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arrays: ");
        int n=sc.nextInt();
        int [] arr1=new int[n];
        int [] arr2=new int[n];
        System.out.println("Enter first array :");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter second array: ");
        for(int j=0;j<n;j++){
            arr2[j]=sc.nextInt();
        }
        if(Arrays.equals(arr1,arr2)){
            System.out.println("both arrays are equal ");
        }
        else{
            System.out.println("Both the arrays are not equal : ");
        }
    }
}
