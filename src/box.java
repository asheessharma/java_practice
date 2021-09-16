
public class box {
    int width;
    int height;
    int depth;
    public box(int w, int h, int d){
        width=w;
        height=h;
        depth=d;
    }
    public void volume(){
        int v;
        v=width*height*depth;
        System.out.println("volume of box is"+v);
    }

    public static void main(String[] args) {
        box myBox=new box(4,5,6);
        myBox.volume();


    }

}