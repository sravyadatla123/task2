package simplecompound;

public class Simplecompound {
	public double si(int p,double rate,double time)
	{
		return (p*time*rate)/100;
	}
	public double ci(int p,double r,int n)
	{
		return p*(Math.pow(1+(r*0.01),n));
	}
}
