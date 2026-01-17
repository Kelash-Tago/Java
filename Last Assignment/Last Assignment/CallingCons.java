class A{
	
	A () {
		super();
		System.out.println("inside A consctructer  ");
		}
	}
class B extends A{
	
	B(){
		super();
		System.out.println("inside B consctructer  ");
		}
	}
class C extends B{
	
	C(){
		super();
		System.out.println("inside c consctructer  ");
		}
	}
class CallingCons{
		public static void main(String args[]){
					C c= new C();
			}
		}