import java.util.Scanner;
    public class array_2d {
        public static void main(String[] args) {
            int[][] arr = new int[3][3];
            Scanner sc =new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter roll no ,age and height for student"+(i+1));
                for (int j = 0; j < 3; j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            int max_age=0;
            int max_age_student=0;
            int max_height=0;
            int max_height_student=0;
            int j=1;
            int k=2;
            for (int i = 0; i < 3; i++) {
                if(arr[i][j]>max_age){
                    max_age=arr[i][j];
                    max_age_student=i+1;
                }
                if(arr[i][k]>max_height){
                    max_height=arr[i][k];
                    max_height_student=i+1;
                }
            }
            System.out.println(" student"+max_age_student+" is oldest with age "+max_age);
            System.out.println(" student"+max_height_student+" is tallest with height "+max_height);
        }
    }

