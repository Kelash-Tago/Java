class Overload2 {
	public static void main(String args[]){
			OverloadDemo ob= new OverloadDemo();
			int i=88;
	
			ob.test();
			
			ob.test(10,20);
			ob.test(i);
			ob.test(123.2);
		}
	}
class OverloadDemo {
	void test(){
		System.out.println("NO parameters:");
		}
	
	void test(int a, int b){
		System.out.println("a  and b: " + a+ " " +b);
		}
	double test(double a){
		System.out.println("inside test double a : " + a);
		return a*a;
			}
	}
	//the code is same as previous code but here is slight changing such as //automatic type promotion , it happened because while calling funtions in //OverloadDemo we entered one with taking integer but there wasn't any methods //defined So it was automatically promoted to the function of double .*/