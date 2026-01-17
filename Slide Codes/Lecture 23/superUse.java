class Box {
    protected double width;
    protected double height;
    protected double depth;
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;
    BoxWeight(double w, double h, double d, double m) {
        super.width = w;
        super.height = h;
        super.depth = d;
        weight = m;
        System.out.println(super.volume());
    }
}

public class superUse {
    public static void main(String args[]) {
        BoxWeight ob = new BoxWeight(10, 20, 15, 34.3);
    }
} 