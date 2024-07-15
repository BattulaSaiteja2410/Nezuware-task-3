/* Designing a Temperature Converter
Build a Java console-based temperature converter that converts between
Celsius, Fahrenheit, and Kelvin scales. Users input a temperature value along
with the source and target temperature scales, and the converter displays the
converted temperature. Ensure the application handles invalid inputs and
provides accurate conversions between the scales.*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskThreeTemperatureConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number 1 for converting the Celsius to Fahrenheit");	
		System.out.println("Enter the number 2 for converting the Celsius to Kelvi");	
		System.out.println("Enter the number 3 for converting the Fahrenheit to Celsius");	
		System.out.println("Enter the number 4 for converting the Fahrenheit to Kelvi");	
		System.out.println("Enter the number 5 for converting the Kelvi to Fahrenheit");	
		System.out.println("Enter the number 6 for converting the Kelvi to Celsius");	
		System.out.print("Please enter the value :");
		int ops;
		while(true) {
			try {
				ops=sc.nextInt();
				if (ops==1) {
					System.out.print("Enter Temperature in Celsius to Convert into Fahrenheit:");
					double celsiusToFahrenheit=sc.nextDouble();
					double res1=celsiusToFahrenheit *9/5+32;
					System.out.println(celsiusToFahrenheit+"°C = "+res1+"°F");		
					
				}
				else if (ops==2) {
					System.out.print("Enter Temperature in Celsius to Convert into Kelvi:");
					double celsiusToKelvi=sc.nextDouble();
					double res2=celsiusToKelvi+274.15;
					System.out.println(celsiusToKelvi+"°C = "+res2+"°K");		
					
				}
				else if (ops==3) {
					System.out.print("Enter Temperature in Fahrenheit to convert into Celsius :");
					double fahrenheitToCelsius=sc.nextDouble();
					double res3=fahrenheitToCelsius*5/9 ;
					System.out.println(fahrenheitToCelsius+"°F = "+res3+"°C");			
					;
				}
				else if (ops==4) {
					System.out.print("Enter Temperature in Fahrenheit to convert into Kelvi:");
					double fahrenheitToKelvi=sc.nextDouble();
					double res4=fahrenheitToKelvi-32*5/9+273.15;
					System.out.println(fahrenheitToKelvi+"°F = "+res4+"°K");			

				}
				else if (ops==5) {
					System.out.print("Enter Temperature in Kelvi to convert into Celsius:");
					double kelviToCelsius=sc.nextDouble();
					double res5=kelviToCelsius-273.15;
					System.out.println(kelviToCelsius+"°K = "+res5+"°C");			
			
				}
				else if (ops==6) {
					System.out.print("Enter Temperature in :");
					double kelvinToFahrenheit=sc.nextDouble();
					double res6=kelvinToFahrenheit-273.15*9/5+32;
					System.out.println(kelvinToFahrenheit+"°K = "+res6+"°F");					
				}
				else {
					System.err.println("Entered value is invalied value");
					System.out.println("Enter the correct value again :");
				}
			}
			catch(InputMismatchException ime) {
				
				sc.next();
			}
		}
	}
}

