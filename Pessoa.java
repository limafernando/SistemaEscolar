package sistemaEscolar;
public class Pessoa{
	
	protected String nome;
	protected String cpf;
	protected String rg;
	protected String matricula;
	protected String telefone;
	protected String email;
	protected String tipoSanguineo;

	public Pessoa(){
		nome = "";
		cpf = "";
		rg = "";
		matricula = "";
		telefone = "";
		email = "";
		tipoSanguineo = "";
	}

	public String getNome(){
		return nome;
	} 

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public void setRg(String rg){
		this.rg = rg;
	}

	public void setMatricula(String matricula){
		this.matricula = matricula;
	}

	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setTipoSanguineo(String tipoSanguineo){
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getCpf(){
		return cpf;
	}

	public String getRg(){
		return rg;
	}

	public String getMatricula(){
		return matricula;
	}

	public String getTelefone(){
		return telefone;
	}
	public String getEmail(){
		return email;
	}
	public String getTipoSanguineo(){
		return tipoSanguineo;
	}

	public String toString(){
		return "\nNome: " + nome + "\nCPF: " + cpf + "\nRG: " + rg + "\nMatricula: " + matricula + 
			"\nTelefone: " + telefone + "\nEmail: " + email + "\nTipo sanguineo: " + tipoSanguineo;
	}
	
}
