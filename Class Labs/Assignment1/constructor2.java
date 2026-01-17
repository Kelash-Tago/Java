public class constructor2{
    
    public static void main(String args[]){
        
        forConstructor obj = new forConstructor();
        
    }
}

class forConstructor{
    
    String stringVariable;
    
    int integerVariable;
    
    char characterVariable;
    
    forConstructor(){
        
        System.out.println(stringVariable);
        System.out.println(integerVariable);
        System.out.println((int)characterVariable);
        
    }
} 