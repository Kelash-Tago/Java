interface InStack{
	void push(int item);
	int pop();
}

class FixedStack implements InStack {
private int stck[];
private  int tos;

FixedStack(int size){
   stck=new int[size];
   tos=-1;
}

public void push(int item){
    if(tos==stck.length-1)
    System.out.println("Stack is full");
    else 
    stck[++tos]=item;

}

public int pop(){
    if(tos<0){
    System.out.println("Stack under flow");
    return 0;
    }
    else 
    return stck[tos--];
   }
}

class IFTest{
    public static void main(String args[]){
      FixedStack mystack1=new fixedStack(5);
      FixedStack mystack2=new fixedStack(8);  
  
    }
}



