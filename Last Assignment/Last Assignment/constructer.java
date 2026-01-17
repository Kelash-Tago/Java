public class constructer {
		public static void main(String args[]){
				Box obj= new Box();
			}
		}
	class Box {
		Box(){
			this("A");
				}
		Box(String message){
				this(message,"B");
					}
		Box(String message1, String message2){
					System.out.println(message1 +"--"+ message2);
				}
		}