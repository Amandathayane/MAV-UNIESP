package ted2;

public class FactoryShape extends Pessoa {
	
	public FactoryShape() {
		super();	
	}
	
	public static Pessoa getTipo(String tipo) {
		if (tipo.equals("F"))
			return new Mulher();
		else if (tipo.equals("M"))
			return new Homem();
		else if (tipo.equals(""))
			return new SemGenero();
		else return null;
	}
}