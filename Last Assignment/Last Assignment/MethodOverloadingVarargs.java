public class MethodOverloadingVarargs{
		
		public static void printNumbers(int a, int b){
				System.out.println("Fixed method two integers: "+a+" , "+b);
				}
		public static void printNumbers(int... numbers){
				System.out.println("varible arguments with numbers; ");
				for(int num:numbers)
					System.out.print(num + "");
				}
			
	public static void main(String [] args){
			printNumbers(1,2);
		}
	}