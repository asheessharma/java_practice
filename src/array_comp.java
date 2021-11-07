import java.util.Arrays;
import java.util.Scanner;
public class array_comp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arrays1: ");
        int n=sc.nextInt();
        int [] arr1=new int[n];
        System.out.println("Enter first array :");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter size of array2: ");
        int m=sc.nextInt();
        int [] arr2=new int[m];
        System.out.println("Enter second array: ");
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }
        if(n==m){
            if(Arrays.equals(arr1,arr2)){
                System.out.println("both arrays are equal ");}
        }
        else{
            System.out.println("Both the arrays are not equal : ");
        }
    }
}
