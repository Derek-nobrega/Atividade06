import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Pessoa {

	private String nome;
	private String dataNasc;
	private double altura;

	
    public Pessoa(String nome, String dataNasc, Double altura){
        setNome(nome);
        setDtnsc(dataNasc);
        setAltura(altura);
    }
	// Getter
	
	public String getNome() {
	    return this.nome;
	  }
	  
	  public String getDtnsc() {
		    return this.dataNasc;
		  }
	
	  public double getAltura() {
		  	return this.altura;
	  }

	  // Setter
	  public void setNome(String Nome) {
	    this.nome = Nome;
	  }
	  
	  public void setDtnsc(String Dtnsc) {
		    this.dataNasc = Dtnsc;
		  }
	  
	  public void setAltura(Double Altura) {
		  
		    this.altura = Altura;
	  }
		
	public int calcIdade(String data) {
	

	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");		

	Date dataAtual = new Date();
	Date data2 = null;
	try {
		data2 = formato.parse(data);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

	SimpleDateFormat ano = new SimpleDateFormat("yyyy");
	
	
	int ano1 = Integer.parseInt(ano.format(data2));
    int ano2 = Integer.parseInt(ano.format(dataAtual));
   int idade = ano2 - ano1;
     return idade;
	}

}

