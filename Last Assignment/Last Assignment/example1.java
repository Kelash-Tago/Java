public class example1{
		public static void printNumbers(String studentName,int...numbers){
			System.out.println("Numbers of "+studentName +"  are:");
			
			for(int number:numbers)
					System.out.println(number);


			}
	public static void main(String []args){
				int [] array={10,20,30};
				printNumbers("john",1,2,3);
				
				}
			}