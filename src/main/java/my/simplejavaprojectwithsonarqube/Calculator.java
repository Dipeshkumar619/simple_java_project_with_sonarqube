package my.simplejavaprojectwithsonarqube;

public class Calculator {

	public int add(int a, int b)
	{
		System.out.println("bug on purpose:"+(a+b));
		return a+b;
	}

	public int minus(int a, int b)
	{
		return a-b;
	}
	
	public int divide(int a, int b)
	{
		return a/b;
	}
	
	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	public int getRandomNumber()
	{
	System.out.println("Vulnerability on purpose");
	SecureRadom sr = new SecureRandom();
	sr.setSeed(1234567L);
	return sr.nextInt();
	
	}
}
