package sistemaEscolar;

public class Turma{

	protected String id;
	protected Aluno alunos[] = new Aluno[50];
	

	protected Prof professores[] = new Prof[15];
	
	protected String disciplinas[] = new String[20];
        
        private int auxA=0, auxP=0;

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

	public void setAlunos(Aluno a){
		this.alunos[auxA] = a;
                auxA++;
	}

	public void setProfessores(Prof prof){
		this.professores[auxP] = prof;
                auxP++;
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
        
        
        public void cadastrarTurma(Turma turmas){
            System.out.print("\nInforme o nome da turma: ");
            turmas.setId(entrada.next());
        }
        public void registrarAlunos(Aluno alunos[],Turma turmas){
            for(int i = 0; i < alunos.length; i++){
                if(alunos[i].getTurmadoAluno().equals(turmas.getId())){
		turmas.setAlunos(alunos[i]);
		}   
            }
            for(int i = 1; i < turmas[j].alunos.length;i++){
		Aluno chave = turmas[j].alunos[i];
		//System.out.println(chave);
		if (chave.getNome() == null || chave.getNome().isEmpty()) {
                    break;
		}
                int k = i-1;
		while(k >= 0 && turmas[j].alunos[k].getNome().compareToIgnoreCase(chave.getNome())>0){
		turmas[j].alunos[k+1] = turmas[j].alunos[k];
		k--;
		}
		turmas[j].alunos[k+1]=chave;
		}
        }
        public void registrarProfessor(){
            
        }
        public void consultarTurma(){
            
        }
}
