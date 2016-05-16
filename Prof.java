public class Prof extends Funcionario{

	protected String matricula;
	protected String turmasDoProf[] = new String[10];
	
	private int aux1 = 0; //varíavel para auxiliar o Set de Turmas
	private String aux2 = ""; //varíavel para auxiliar o Get de Turmas
	
	// cargo vai ser iniciado como "professor"

	public Prof(){
		super("Professor");
		matricula = "";
		for(int i = 0; i < turmasDoProf.length; i++){
			turmasDoProf[i] = "";
		}
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	public String getMatricula(){
		return this.matricula;
	}
	
	public void setTurmasDoProf(String turma){
		turmasDoProf[aux1] = turma;
		aux1++;
	}
	public String getTurmasDoProf(){
		for(int i = 0; i < turmasDoProf.length; i++){
			aux2 += turmasdoProf[i] + "\n";
		}
		return aux2;
	}
	
	public String toString(){
		return super.toString() + "\nMatricula: " + matricula + "\nTurmas do Professor: " + getTurmasDoProf();
	}
}
