class SimpleCalc {

    public static void main(String args[]) {

        int firstValue = 2; // creation of integer variable
        int secondValue = 4; // creation of integer variable
        String op = "+"; // sample operator for demonstration

        if(op.equals("+")) {
            System.out.println("Addition: " + (firstValue + secondValue));
        } else if(op.equals("-")) {
            System.out.println("Subtraction: " + (firstValue - secondValue));
        } else if(op.equals("*")) {
            System.out.println("Multiplication: " + (firstValue * secondValue));
        } else if(op.equals("/")) {
            System.out.println("Division: " + (firstValue / secondValue));
        }

    } // end main

} // end class SimpleCalc
