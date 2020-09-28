package ted2;

public class Homem extends Pessoa{
	
	public Homem() {
		super();
	}
	
	public String getTipo() {
		return "Bem vindo Sr. "+getNome();
	}
}