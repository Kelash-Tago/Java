class User {
		private int password;
		
		public void setPassword(int password){
				this.password=encryptPassword(password);
			}
		public int getPassword(){
			return decryptPassword(password);
				}
		private int encryptPassword(int password){
				return password+2;
							}
		private int decryptPassword(int password){
				return password-2;
						}
		}
public class LoginTest{
		public static void main(String args[]){
			User obj= new User();
			obj.setPassword(2);
			}
		}