package uninter;

public class Euro extends Moeda {

	Euro(double v) {
		super(v);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void info() {
		System.out.println("Valor em euro: " + valor);
		
	}
}
