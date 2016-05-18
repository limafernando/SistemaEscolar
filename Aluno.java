public class Aluno extends Pessoa{

	protected String turmaDoAluno; //Antes tinhamos uma intancia da classe Turma, mas não faz sentido ter uma instancia da classe turma. Mesma coisa na classe Prof
	protected String nomeResponsavel;
	protected String telefoneResponsavel;
	protected double mensalidade;
	protected double notas[] = new double[30];
	private int i = 0; //variavel aux para o array notas

	public Aluno(){
		super();
		nomeResponsavel = "";
		telefoneResponsavel = "";
		mensalidade = 0.0;
		turmaDoAluno = "";
	}
	
	public String getTurmadoAluno(){
		return turmaDoAluno;
	}

	public void setTurmaDoAluno(String id){
		turmaDoAluno = id;
	}

	public void setNomeResponsavel(String nomeResponsavel){
		this.nomeResponsavel = nomeResponsavel;
	}

	public void setTelefoneResponsavel(String telefoneResponsavel){
		this.telefoneResponsavel = telefoneResponsavel;
	}

	public void setMensalidade(Double mensalidade){
		this.mensalidade = mensalidade;
	}

	public void setNotas(Double nota){
		notas[i] = nota;
		i++;
	}

	public String toString(){
		return super.toString() + "\nTurma: " + turmaDoAluno + "\nNome do responsavel: " + nomeResponsavel + 
			"\nTelefone do responsavel: " + telefoneResponsavel + "Mensalidade: " + mensalidade;
	}
}
