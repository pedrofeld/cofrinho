package uninter;

public class Euro extends Moeda {
	private static final double valorEuro = 6.20;

	public Euro(double v) {
		super(v);
	}
	
	@Override
	public void info() {
		System.out.println("Valor em euro: " + valor);
	}
	
	@Override
    public double converter() {
        return valor * valorEuro;
    }
}
