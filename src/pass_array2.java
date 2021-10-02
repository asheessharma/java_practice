public class pass_array2 {
   static void sum1(int ...arr1){
        int sum=0;
       System.out.println("no of argument passed:"+ arr1.length);
        for(int i:arr1)
            sum+=i;
                 System.out.print("Sum of your all arguments is: "+sum);
            System.out.println( );

       // System.out.println("Sum of your all arguments is:-"+sum);
    }
    public static void main(String[] args) {
        sum1(100);
        sum1(1,2,3,4,5);
        sum1(7,6,45,4);

    }
}
