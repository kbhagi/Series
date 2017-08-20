package krishna;

 public class Series {

	private static int sum = 0;
	
	public static long nSum(int n){
		/*sum = n + sum;
		return sum;*/
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else {
		return ((n * (n+1))/2);
			 }
	}

	public static long factorial(int n)
	{
		//int fact = n;
	/*	if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
		return 1;
		}
		else 
		{
			return n * factorial(n-1);
		}*/
		if( n== 0) {
			return 0;
		}
		long fact = 1;
		for (int i=1; i <=n; i++) {
			fact *= i;
		}
		return fact;
		}

public static long fibonacci(int n){
/*	if(n==0)
	{
		return 0;
	}
	else if(n==1)
	{

		return 1;
	}
	else 
	{
		return fibonacci(n-1) + fibonacci(n-2);
	}*/
if(n == 0) {
	return 0;
} else if(n == 1) {
	return 1;
}
long nMinus1 = 1;
long nMinus2 = 0;
long fib = 0;
for(int i = 1; i<n; i++) {
    fib = (nMinus2 + nMinus1);
    nMinus2 = nMinus1;
    nMinus1 = fib;
}
return fib;
}
}




