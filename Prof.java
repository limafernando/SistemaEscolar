public class Prof extends Funcionario{

	protected String turmasDoProf[] = new String[10];
	protected String matricula;

	// cargo vai ser iniciado como "professor"

	public Prof(){
		super("Professor");
		matricula = "";
		for(int i = 0; i < turmasDoProf.length; i++){
			turmasDoProf[i] = "";
		}
	}
}