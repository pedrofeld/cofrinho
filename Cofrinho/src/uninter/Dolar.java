package uninter;

public class Dolar extends Moeda {

	Dolar(double v) {
		super(v);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void info() {
		System.out.println("Valor em dólar: " + valor);
		
	}
}
