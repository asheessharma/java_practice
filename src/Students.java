public class Students {
    String Name;
    public Students(String name){
        this.Name=name;
    }
    public Students(){
        Name="Unknown";
    }
    public void display(){
        System.out.println(Name);
    }

    public static void main(String[] args) {
        Students tokyo=new Students("ashish");
        tokyo.display();
    }

}
