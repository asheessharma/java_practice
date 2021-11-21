class vehicle{
    void run(){
        System.out.println("vehicle is running ");
    }
}
public class method_overriding extends vehicle {
    void run(){
        System.out.println("bike is running ");
    }
    public static void main(String[] args) {
        method_overriding obj= new method_overriding();
        vehicle obj1=new vehicle();
        obj1.run();
        obj.run();
    }

}
