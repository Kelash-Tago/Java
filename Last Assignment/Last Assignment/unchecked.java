public class unchecked{
		public static void main(String args[]){
			int[] ab=new int[2];
			try{
				System.out.println(ab[3]);
				}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}