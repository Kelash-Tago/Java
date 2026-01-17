public class Question2 {
    public static void main(String[] args) {
        Product product1 = new Product("Phone",23000);
        Product product2 = new Product ("Laptop",50000);
        if(product2.comparePrice(product1))
        System.out.println(product2.name+" is expensive then "+product1.name);
        else 
        System.out.println(product1.name+" is expensive then "+product2.name);

    }
}
class Product{
    String name;
    double price;
    Product(String name,double price){
        this.name=name;
        this.price=price;

    }
    boolean comparePrice(Product p){
        return price>p.price;
    }

}
