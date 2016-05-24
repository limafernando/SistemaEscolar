public class Turma{

	protected String id;
	protected Aluno alunos[] = new Aluno[50];
	/*{
		for(int i = 0; i < alunos.length; i++){
			alunos[i] = new Aluno();
		}
	}*/

	protected Prof professores[] = new Prof[15];
	/*{
		for(int i = 0; i < professores.length; i++){
			professores[i] = new Prof();
		}
	}*/
	protected String disciplinas[] = new String[20];

	public Turma(){
		id = "";
		
		for(int i = 0; i < alunos.length; i++){
			alunos[i] = new Aluno();
		}
		
		for(int i = 0; i < professores.length; i++){
			professores[i] = new Prof();
		}
	}

	public void setId(String id){
		this.id = id;
	}

	public void setAlunos(Aluno a, int i){
		alunos[i] = a;
	}

	public void setProfessores(Prof prof, String p){
		prof.setTurmasDoProf(p);
	}

	public String getId(){
		return id;
	}

	public Aluno getAlunos(int i){
		return alunos[i];
	}

	public Prof getProfessores(int i){
		return professores[i];
	}

}
