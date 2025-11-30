package uninter;

public class Dolar extends Moeda {
	private static final double valorDolar = 5.3;
	
	public Dolar(double v) {
		super(v);
	}
	
	@Override
	public void info() {
		System.out.println("Valor em dólar: " + valor);		
	}
	
	@Override
    public double converter() {
        return valor * valorDolar;
    }
}
