public class Book {
    private String name;
    private String author;
    private double price;
     private int qiStock;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public int getQiStock() {
        return qiStock;
    }
    Book(String n,String a,double p,int q){
        name=n;
        author=a;
        price=p;
        qiStock=q;
    }

    public static void main(String[] args) {
        Book book=new Book("hello","Nathuram",56.5,25);
        System.out.println(book.name+" "+book.author+" "+book.price+" "+book.qiStock);
    }
}
