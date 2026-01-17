public class example2{
		public static void printNumbers(int... numbers){
				for(int number: numbers)
						System.out.println(number);
							
					}
		public static void printNumbers(int [] numbers){
				System.out.println("i am the method of array");
					}
		public static void main(String args[]){
					int []numbers={1,2,3};
					printNumbers(numbers);
						}
					}

		