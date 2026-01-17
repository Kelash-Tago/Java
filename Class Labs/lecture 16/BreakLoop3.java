// Using break with nested loops.
class BreakLoop3 {
    public static void main(String args[]) {
        for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
            for(int j=0; j<5; j++) {
                  // terminate loop if j is 10
                System.out.print(j + " ");
                if(j == 3) break;
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
} 