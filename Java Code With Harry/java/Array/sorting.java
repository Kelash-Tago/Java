public class sorting {

    public static void main(String[] args) {
        // int arr[];
       int arr[]=new int[]{2,3,4,5,1};
       for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j<arr.length-1; j++) {
            if(arr[j]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
       
       }
       for (int i = 0; i <arr.length; i++) {
        System.out.println(arr[i]);
    }
    }
}