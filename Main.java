import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String dataNasc = JOptionPane.showInputDialog("Digite a data de nascimento: ");
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		
		
	Pessoa dadosPessoa = new Pessoa(nome, dataNasc, altura);
	int idade = dadosPessoa.calcIdade(dataNasc);
		
	
	JOptionPane.showMessageDialog(null,"Ola " + nome+" sua idade e: " + idade + " e sua altura"+ altura ,"Alerta de nota" , JOptionPane.ERROR_MESSAGE);

	
	
	
	}

}
