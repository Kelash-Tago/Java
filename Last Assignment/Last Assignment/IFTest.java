interface IntStack{
		void push(int item );
		int pop();
		}
class IFTest{
		public static void main(String args[]){
			FixedStack mystack1= new FixedStack(5);
			for(int i=0;i<5;i++)
				mystack1.push(i);
			for(int i=0;i<5;i++)
				System.out.println(mystack1.pop());
				}
		}
class FixedStack implements IntStack{
		private int stck[];
		private int tos;
		
		FixedStack(int size){
				stck= new int[size];
				tos=-1;
			}
		public void push(int item){
				if(tos==stck.length-1)
					System.out.println("stack is full");
				else
					stck[++tos]=item;
				}
		public int pop(){
			if(tos<0){
				System.out.println("stack underflow.");
				return 0;
						}
			else 
				return stck[tos--];
			}
		}