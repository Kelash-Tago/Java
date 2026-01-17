interface IntStack{
	void push(int item);
	int pop();
}

class FixedStack implements IntStack {
    private int stck[];
    private int tos;
    
    // Constructor to initialize stack
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    
    // Push an item onto the stack
    public void push(int item) {
        if(tos == stck.length-1)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }
    
    // Pop an item from the stack
    public int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class IfTest{
	public static void main(String[] args) {
		FixedStack  mystack1 =new FixedStack(5);
		for(int i=0; i<5; i++) {
			mystack1.push(i);
		}
	}
}