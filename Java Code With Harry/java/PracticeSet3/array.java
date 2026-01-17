public class array {
    public static void main(String[] args) {
        // float Myarray[]={20,30.3f,3};
        // System.out.println(Myarray[1]);
        // double a=20.5;
        // float b=(float)a;
        // System.out.println(b);
        // System.out.println("For each loop");
        // for(float i: Myar    ray){
        //     System.out.println(i);

        // }
        int arr [][];
        arr=new int[2][3];
        arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
