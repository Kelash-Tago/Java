public class Question6 {

    public static void main(String[] args) {
       Book book1 = new Book("Macbeth", 300) ;
       Book book2 = new Book(book1) ;
       book1.printDetails();
       book2.printDetails();

        
    }
}
class Book{
    String title;
    double price;
    Book(String title,double price){
        this.title=title;
        this.price=price;
    }
    Book(Book b){
        title=b.title;
        price=b.price;
    }
    void printDetails(){
        System.out.println("Title : "+title);
        System.out.println("Price "+price );
    }
}