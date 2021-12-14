public class excep {
    public static void main(String[] args) {
        Thread t= Thread.currentThread();
        System.out.println("current thread "+t);
        t.setName(" my thread ");
        System.out.println(" new name "+t);
        try{
            for( int i=0;i<5;i++){
                System.out.println(i);
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e){
            System.out.println(" Exception :"+e);
            }
        }
    }

