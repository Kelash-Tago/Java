import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of books : ");
        int num=sc.nextInt();
        sc.nextLine();
        Book[] books=new Book[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter details for book "+(i+1)+" : ");
            System.out.print("Enter book title : ");
       String bookTitle=sc.nextLine();
        System.out.print("Enter Author : ");
        String author=sc.nextLine();
        System.out.print("Enter Price : ");
       double price =sc.nextDouble();
        sc.nextLine();
         books[i] =new Book(bookTitle,author,price);
        }

        for(int i=0;i<num;i++){
            System.out.println("Details of Book "+(i+1)+" :");
            books[i].printDetails();

        }
        sc.close();
    }

    
}

class Book{
    String bookTitle;
    String author;
    double price;
    Book(String bookTitle, String author, double price){
       this.bookTitle= bookTitle;
        this.author=author;
        this.price=price;
        

    }

    void printDetails(){
        System.out.println("__________________________________________");

        System.out.println("Book Title : "+bookTitle);
        System.out.println("Book Author : "+author);
        System.out.println("Price : "+price);
        System.out.println("__________________________________________");


        
    }
}