package bhargavak;
import krishna.Series;

public class Main {
	public static void main(String [] args) {

		for(int i=0; i<=10; i++)
		{
		System.out.println(Series.nSum(i));
		}
		System.out.println("Factorial :");
		for(int i=0; i<=10; i++)
		{
		System.out.println(Series.factorial(i));
		}
		System.out.println("Series :");	
		for(int i=0; i<=10; i++)
		{
		System.out.println(Series.fibonacci(i));
		}
	}
	
}