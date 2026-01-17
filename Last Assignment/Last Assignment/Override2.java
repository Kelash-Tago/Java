class A {
	int i,j;
	A(int a,int b){
		i=a;
		j=b;
			}
	void show(){
		System.out.println("i and j: "+ i+ " "+j);
		}
	}
class B extends A {
		int k;
		B(int a , int b, int c){
			super(a,b);
			k=c;
		}
		void show(String message){
			
			System.out.println(message +k);
			}
		}
class Override2 {
		public static void main(String args[]){
			B subOb= new B(1,2,3);
			subOb.show("the value of k in child clas :  ");
			subOb.show();
			}
		}