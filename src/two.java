class r1 implements Runnable{
     public void run(){
         for(int i=0;i<=20;i+=2){
             System.out.println(i);
         }

    }
}
class r2 implements Runnable{
    public void run(){
        for (int i=1;i<=20;i+=2){
            System.out.println(i);
        }
    }
}
public class two {
    public static void main(String[] args) {
        Runnable t1=new r1();
        Thread t=new Thread(t1);
        t.start();
        Runnable t2=new r2();
        Thread th2=new Thread(t2);
        th2.start();

    }




}
