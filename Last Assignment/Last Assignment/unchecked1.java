public class unchecked1{
		public static void main(String args[]){
			try{
				int a=Integer.parseInt("abc");
				}
			catch(Exception ex){
				ex.printStackTrace();
				}
		}
	}