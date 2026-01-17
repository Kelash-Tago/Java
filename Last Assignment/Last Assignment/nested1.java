class Outer{
	private  String message= "hello from outer field";
	
		 class Inner{
			public void displayMessage(){
				System.out.println(message);
				}
			}
		}
public class nested1 {
		public static void main (String [] args) throws Exception{
			Outer outer=new Outer();
			Outer.Inner inner= outer.new Inner();
			inner.displayMessage();
			}
		}