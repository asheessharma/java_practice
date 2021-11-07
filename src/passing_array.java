import java.util.Scanner;
public class passing_array {
    void method1(int [] arr1,int m,int val1){
        arr1[m]=val1;
        System.out.println("New array is :-");
       for (int i=0;i<arr1.length;i++){
           System.out.print(arr1[i]+" ");
       }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println(" Enter "+n+" values of your choice:-");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j,val;
        System.out.println("Enter index number:-");
        j=sc.nextInt();
        System.out.println(" Enter  value of index:-");
        val=sc.nextInt();
        System.out.println("initially your array is:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println( );
         passing_array pass=new passing_array();
        pass.method1(arr,j,val);

    }
}
