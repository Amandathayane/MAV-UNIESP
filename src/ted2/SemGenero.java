package ted2;

public class SemGenero extends Pessoa{

	public SemGenero(){
		super();
	}
	
	public String getTipo() {
		return "Bem vindo "+getNome();
	}
}
