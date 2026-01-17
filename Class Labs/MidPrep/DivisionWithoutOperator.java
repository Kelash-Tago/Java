public class DivisionWithoutOperator{
  public static void main( String args [] ){
	int dividend = Integer.parseInt(args[0]);
	int divisor = Integer.parseInt(args[1]);
	int quotient=0;
	while(dividend>divisor){
		dividend=dividend-divisor;
		quotient++;	
			}
	System.out.println("Result is : "+quotient);
		}
	}
