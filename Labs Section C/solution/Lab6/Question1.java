import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();

        System.out.print("Enter temperature : ");
        double temperature=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter choice to convert into c for celicius f for fahrenheit : ");
        char choice=scanner.next().charAt(0);
        if(Character.toLowerCase(choice)=='c')
        System.out.println("Temperature in celcius : "+converter.convertToCelicus(temperature));
        else if (Character.toLowerCase(choice)=='f')
        System.out.println("Temperature in fahrenheit : "+converter.convertToFahrenheit(temperature));
        else 
        System.out.println("You enterd wrong character!");




        scanner.close();
    }
    
}

class TemperatureConverter{
    double convertToCelicus(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }

    double convertToFahrenheit(double celicius){
        return (celicius*9/5)+32;
    }
}