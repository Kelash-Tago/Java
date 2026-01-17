class SuperSubCatch{
		public static void main(String args[]){
			try{
				int a=0;
				int b=42/a;
			}
		catch(Exception e){
			System.out.println("generic exception catch");
					}
		catch(ArithmeticException e){
			System.out.println("this catch is not reached");
				}
			}
		}
						