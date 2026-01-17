public class constructor{
    public static void main(String args[]){
        forConstructor obj = new forConstructor();
        
        System.out.println(obj.stringVariable);
        System.out.println(obj.integerVariable);
        System.out.println(obj.characterVariable);
        System.out.println((int)obj.characterVariable);
    }
}

class forConstructor{
    String stringVariable;
    int integerVariable;
    char characterVariable;
} 