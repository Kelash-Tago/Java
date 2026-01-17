class OuterClass{
	private static String staticOuterField= "hello from static field";
	
		static class StaticInnerClass{
			public void displayMessage(){
				System.out.println(staticOuterField);
				}
			}
		}
public class nested {
		public static void main (String [] args) throws Exception{
			OuterClass.StaticInnerClass inner= new OuterClass.StaticInnerClass();
			inner.displayMessage();
			}
		}