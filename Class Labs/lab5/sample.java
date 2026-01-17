public class sample {
    public static void main(String[] args) {
        String str="kelash kumar from Fazal";
        for (int i = 0; i < str.length; i++) {
            char[] myArray = args[i].toCharArray();

            for (int j = 0; j < myArray.length; j++) {
                // Only check and convert the first character
                if (j == 0 && myArray[j] >= 'a' && myArray[j] <= 'z') {
                    System.out.print((char)(myArray[j] - 32));
                } else {
                    System.out.print(myArray[j]);
                }
            }
            System.out.print(" ");
        }
    }
    
}
