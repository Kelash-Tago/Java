
class Car{
    String make;
    String model;
    int year;
    String color;
    void setMake(String make){
        this.make=make;
    }
    void setModel(String model){
        this.model=model;
    
    }
    void setYear(int year){
        this.year=year;
    }
    void setColor(String color){
        this.color=color;
    }
    String getMake(){
        return make;
    }
    String getModel(){
        return model;
    }
    int getYear(){
        return year;
    }
    String getColor(){
        return color;
    }

}
public class Question9 {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.setMake("Toyota");
        myCar.setModel("Corolla");
        myCar.setYear(2025);
        myCar.setColor("Red");
        System.out.println("Print Details.");
        System.out.println("Make : "+myCar.getMake());        
        System.out.println("Model : "+myCar.getModel());
        System.out.println("Year : "+myCar.getYear());
        System.out.println("Color : "+myCar.getColor());        
        
        


        
    }
}
