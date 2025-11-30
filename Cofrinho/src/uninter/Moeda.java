package uninter;

abstract public class Moeda {
	protected double valor;
	
	public Moeda(double v){
		valor=v;
	}
	
	abstract public void info();
	
	abstract public double converter();
}
