public class search {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,9,24};
        int num=3;
        int startpoint=0;
        int endpoint=arr.length-1;
        while(startpoint<=endpoint) {
            int midpoint=(startpoint+endpoint)/2;
            if(arr[midpoint]==num){
                System.out.println("Number found at index"+midpoint);
                break;
            }
            if(num>arr[midpoint]){
                startpoint=midpoint+1;

            }
            else if(num<arr[midpoint])
            endpoint=midpoint-1;
            else {
            System.out.println("Number not found");
            break;
            }

            }
           
        }
    }

