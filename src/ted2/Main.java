package ted2;

import javax.swing.*;

public class Main {
	public static void main (String[] args) {

		String nome = JOptionPane.showInputDialog("Digite o Nome: ");
		String tipo = JOptionPane.showInputDialog("Digite seu g�nero (F/M): \n PS: Se n�o ficar confort�vel com as op��es, apenas clique em enter");
		
		Pessoa pessoa1 = FactoryShape.getTipo(tipo);
		pessoa1.setNome(nome);
		System.out.println(pessoa1.getTipo());
	}
	
}

