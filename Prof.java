public class Prof extends Funcionario{

	protected String turmasDoProf[] = new String[10];
	
	private int aux1 = 0; //varíavel para auxiliar o Set de Turmas
	private String aux2 = ""; //varíavel para auxiliar o Get de Turmas
	private int aux3 = 0;
	// cargo vai ser iniciado como "professor"

	public Prof(){
		super("Professor");
		matricula = "";
		for(int i = 0; i < turmasDoProf.length; i++){
			turmasDoProf[i] = "";
		}
	}
	
	public void setTurmasDoProf(String turma){
		turmasDoProf[aux1] = turma;
		aux1++;
	}
	public String getTurmasDoProf(){
		aux2 = turmasDoProf[aux3]; 
		aux3++;
		return aux2;
	}	
	
	public String toString(){
		return super.toString() + "\nTurmas do Professor: " + getTurmasDoProf();
	}
}
