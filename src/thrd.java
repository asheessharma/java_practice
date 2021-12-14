class new1 implements Runnable{
        Thread t;
        new1(){
                t=new Thread(this,"demo thread");
                System.out.println("child thread "+t);
                t.start();
        }
        public void run(){
                try {
                        for(int i=0;i<10;i+=2){
                                System.out.println(" child thread "+i);
                                Thread.sleep(1000);
                        }
                }
                catch (InterruptedException e){
                        System.out.println("exception :"+e);
                }
                System.out.println(" exiting child thread ");
        }

        }
        public class thrd {
                public static void main(String[] args) {
                        new new1();
                        Thread t= Thread.currentThread();
                        System.out.println(" fuck thread "+t);
                        try {
                                for( int i=0;i<5;i++){
                                        System.out.println(" main thread : "+i);
                                        Thread.sleep(500);
                                }
                        }
                        catch (InterruptedException i){
                                System.out.println(" exception occured :"+i);
                        }
                        System.out.println("exiting main thread ");
                }

}
