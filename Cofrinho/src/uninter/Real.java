package uninter;

public class Real extends Moeda {
	// Construtor
	public Real(double v) {
		super(v);
	}

	@Override
	public void info() {
		System.out.println("Valor em reais: " + valor);
	}
	
	@Override
    public double converter() {
        return valor; // retorna ele mesmo pq já está em BRL
    }
}
