public class Question4 {
    public static void main(String[] args) {
        MyConstructor obj1 = new MyConstructor();
        MyConstructor obj2 = new MyConstructor("Macbeth","William Shakespear");
        obj1.printDetails();
        obj2.printDetails();
    }
}
class MyConstructor{
    String bookTitle;
    String author;
    MyConstructor(){
        bookTitle="Unknown";
        author="Unknown";
    
    }

    MyConstructor(String bookTitle,String author) {
        this.bookTitle=bookTitle;
        this.author=author;
    }

    void printDetails(){
        System.out.println("Title of Book : "+bookTitle);
        System.out.println("Author of book : "+author);
        System.out.println("___________________________________");
    }
}
