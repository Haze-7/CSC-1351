//Hayes Chiasson
//897578538
public class Fibonacci {
	/**
	 * implements a recursive Fibonacci number generator 
	 *  @param n : represents x / entered value to compute Fibonacci sequence 
	 *  
	 *  @return n : returns n / x value if n <= 1
	 *  @return recursiveFib(n - 1) + recursiveFib (n - 2): calclulates and returns recursive Fibonacci sequence
	 */
	public static long recursiveFib(int n)
	{
		if (n <= 1) // tests if n = 0 or 1
		{
			return n; // if n = 0 or 1, returns n value
		}
		else
		{
			return recursiveFib(n - 1) + recursiveFib (n - 2); // calculates Fibonacci sequence and returns long value
		}
	}
	/**
	 * implements an iterative Fibonacci number generator 
	 *  @param n : represents x / entered value to compute Fibonacci sequence 
	 *  @return n : returns n / x value if n <= 1
	 *  @return fib: returns the fibonacci sequence
	 */
	public static long iterativeFib(int n)
	{
		if (n <= 1) // tests if n = 0 or 1
		{
			return n; // if n = 0 or 1, returns n value
		}
		
		long fib = 1; // initialize fib value to store Fibonacci sequence
		long lastFib = 1; // initialize lastFib to store previous
		
		for (int i = 2; i < n; i++) // iterates from 2 until n-1 value
		{
			long temp = fib; //establishes temporary variable to compare fib and lastFib
			fib += lastFib; //adds the new fib to the lastFib and then equates itself to the new value of fib + lastFib
			lastFib = temp; //resets/ clears lastFib to reset for next iteration
		}
		return fib; // returns stored fibonacci sequence
		
			}
}
