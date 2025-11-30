package uninter;

abstract public class Moeda {
	protected double valor;
	
	public Moeda(double v){
		valor=v;
	}
	
	abstract void info();
	
	abstract public double converter();
}
