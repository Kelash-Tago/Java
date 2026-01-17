public class TwoDimensional {
    public static void main(String[] args) {
             int jagged[][]=new int[3][];
       jagged[0]=new int[]{1,2,3,};
       jagged[1]=new int[]{5,6,};
       jagged[2]=new int[]{8};
       

        for (int[] row : jagged) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
