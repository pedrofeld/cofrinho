package uninter;

abstract public class Moeda {
	double valor;
	
	Moeda(double v){
		valor=v;
	}
	
	abstract void info();
}
