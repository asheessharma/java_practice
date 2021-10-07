import java.util.Scanner;
class triangle_pattern{
    public void pattern(int n){
        System.out.println("triangular pattern ");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * " ) ;
            }
            System.out.println();
        }
    }
}
class pyramid_pattern{
    public void pyra_pattern(int n){
        System.out.println("pyramid pattern :-");
        for(int i=0;i<n;i++){
            // for printing spaces
            for(int j=(n-i);j>1;j--){
                System.out.print(" ");
            }
            //for  printing stars
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
class triangle2{
    public void tri2(int n){
        System.out.println("triangle type2:-");
        for(int i=0;i<n;i++){
            for(int j=2*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
class inverse_tri{
    public void inv_tri( int n){
        System.out.println("Inverse  triangle is here ");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
      int n=sc.nextInt();
      triangle_pattern pattern1=new triangle_pattern();
      pyramid_pattern pattern2=new pyramid_pattern();
      triangle2 pattern3=new triangle2();
      inverse_tri pattern4= new inverse_tri();
      pattern1.pattern(n);
      pattern2.pyra_pattern(n);
      pattern3.tri2(n);
      pattern4.inv_tri(n);

    }
}
