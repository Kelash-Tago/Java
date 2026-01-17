public class methodOverloading1 {
		public static void main(String args[]){
			methodOverload obj=new methodOverload();
			byte a=1;
			obj.call(a);
			}
		
		}
class methodOverload {
		public void call (int i){
			System.out.println("here in int");
				}
		public void call(byte i){
			System.out.println("here in byte");
			}
		}