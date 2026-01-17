// A program that uses the Box.class

class Box {
    double width;
    double height;
    double depth;
}

// this class declares two objects of type Box
class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        
        double volume;
        
        // assign values to myBox1's instance variables
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;
        
        // assign different values to myBox2's instance variables
        myBox2.width = 4;
        myBox2.height = 5;
        myBox2.depth = 9;
        
        // compute volume of myBox1
        volume = myBox1.width * myBox1.height * myBox1.depth;
        
        System.out.println("Volume is : " + volume);
        
        // compute volume of myBox2
        volume = myBox2.width * myBox2.height * myBox2.depth;
        
        System.out.println("Volume is : " + volume);
    }
} 