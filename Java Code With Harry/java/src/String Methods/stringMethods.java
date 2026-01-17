public class stringMethods {
    public static void main(String[] args) {
        String str="Kelash";
        String str2="    Kumar ";
        System.out.println(str.substring(2));
        System.out.println(str2.trim());
        System.out.println(str.substring(1,6));
        // for character replacement
        System.out.println(str.replace('a','e'));
        // for string freplacement
        System.out.println(str.replace("e","ai"));// output : Kailash
        // startsWith("string") it is case sensitibe
        System.out.println(str.startsWith("Ke"));//true
        System.out.println(str.endsWith("sh"));//true
        // charAt(index);
        System.out.println(str.charAt(3));// output:l
        //indexOf(string)
        System.out.println(str.indexOf("s"));//output:4
        String str3="Hello world world";
        System.out.println(str3.indexOf("world"));//output:6
        System.out.println(str3.indexOf("world",7));//output:12
        // if substring is not in string then it will return -1

            // equals method 
            System.out.println(str.equals("Kelash"));//output:true//case sensitive
            // removing case sensitivity
            System.out.println(str.equalsIgnoreCase("kelash"));//output:true
            System.out.println("Kelash Kumar s\\o Tago");// one \ will be printed
            System.out.println("Kelash Kumar s//o Tago");// two // will be printed
          //  System.out.println("Kelash Kumar s\o Tago");// if we write one backslash in string it will show error










    }
    
}