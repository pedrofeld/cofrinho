package uninter;

// Classe abstrata, cada classe filha implementa sua própria versão
abstract public class Moeda {
	protected double valor; // somente acesso das classes filhas
	
	// Construtor
	public Moeda(double v){
		valor=v;
	}
	
	abstract public void info();
	
	abstract public double converter();
}
