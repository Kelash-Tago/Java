class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
   
    Box() {
        width = 0;
        height = 0;
        depth = 0;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box(2, 2, 2);
        System.out.println("Volume of box1: " + box1.volume());

        Box box2 = new Box();
        System.out.println("Volume of box2: " + box2.volume());
    }
} 