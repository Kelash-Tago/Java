class cylinder{
    private int radius;
    private int height;
    public static int PI=3;
    public void setRadius(int radius){
        if(radius>0)
        this.radius=radius;
        else
        System.out.println("Enter positive number");
    }
    public void setHeight(int height){
        if(height>0)
        this.height=height;
        else
        System.out.println("Enter positive number for height");
    }
    public int getRadius(){
        return radius;
    }

    public int getHeight(){
        return height;
    }
    public int getVolume(){
        return 2*PI*radius*(height+radius);

    }

}
public class question1 {

    public static void main(String[] args) {
        cylinder obj=new cylinder();
        obj.setRadius(3);
        obj.setHeight(7);
       System.out.println( obj.getHeight());
        System.out.println(obj.getRadius());
        System.out.println(obj.getVolume());

    }
} 