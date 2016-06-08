package sistemaEscolar;

import javax.swing.JOptionPane;


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
        
        
	public void cadastrarTurma(Turma turmas[],int cont){
    	
    	String buscarT = JOptionPane.showInputDialog(null, "Informe o id da turma: ");
    	boolean verifica = false;
		for(int j = 0; j < turmas.length; j++){
			if(buscarT.equals(turmas[j].getId())){
				verifica=true;
				JOptionPane.showMessageDialog(null, "Turma existente");
			}
		}
		if(!verifica){turmas[cont].setId(buscarT);
		JOptionPane.showMessageDialog(null, "Turma cadastrado com sucesso!");}
	}
	public void registrarAlunos(Aluno alunos[],Turma turmas[]){
    	String buscarT = JOptionPane.showInputDialog(null, "Informe o id da turma: ");
		boolean verifica = false;
		for(int j = 0; j < turmas.length; j++){
			if(buscarT.equals(turmas[j].getId())){
				verifica=true;
				for(int i = 0; i < alunos.length; i++){
					if(alunos[i].getTurmadoAluno().equals(turmas[j].getId())){
						turmas[j].setAlunos(alunos[i]);
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
		}
		if(!verifica){JOptionPane.showMessageDialog(null, "Turma inexistente");}
		else{JOptionPane.showMessageDialog(null, "Alunos cadastrados com sucesso!");}
	}
        
        
        
        public void registrarProfessor(Prof professores[], Turma turmas[]){
        	String buscarT = JOptionPane.showInputDialog(null, "Informe o id da turma: ");
    		boolean verifica = false;
    		for(int j = 0; j < turmas.length; j++){
    			if(buscarT.equals(turmas[j].getId())){
    				verifica=true;
    				for(int i = 0; i < professores.length; i++){
    					for(int k = 0; k < professores[i].turmasDoProf.length; k++){
    						if(professores[i].getTurmasDoProf2(k).equals(turmas[j].getId())){
    							turmas[j].setProfessores(professores[i]);
    						}
    					}
    				}
    			}
    		}
    		if(!verifica){JOptionPane.showMessageDialog(null, "Turma inexistente");}
    		else{JOptionPane.showMessageDialog(null, "Professores cadastrados com sucesso!");}
        }
        
        
        
        public void consultarTurma(Turma turmas[]){
        	String buscarT = JOptionPane.showInputDialog(null, "Informe o id da turma: ");
    		boolean verifica = false;
    		for(int j = 0; j < turmas.length; j++){
    			if(buscarT.equals(turmas[j].getId())){
    				verifica=true;
    				for(int i = 0; i < turmas[j].professores.length;i++){
    					if (turmas[j].professores[i].getNome() == null || 
    						turmas[j].professores[i].getNome().isEmpty()) {
    						break;
				}
				System.out.println(turmas[j].professores[i].getNome()/*getMateria?*/);
			}

			for(int i = 0; i < turmas[j].alunos.length;i++){
				if (turmas[j].alunos[i].getNome() == null || 
					turmas[j].alunos[i].getNome().isEmpty()) {
					break;
				}
				JOptionPane.showMessageDialog(null,"\n"+i+1+" "+" "+turmas[j].alunos[i].getNome()+" "+turmas[j].alunos[i].getMatricula());
			}
    		}
    		}
    		if(!verifica){JOptionPane.showMessageDialog(null, "Turma inexistente");}

        }
        
        /*metodo remover turma utilizara o mesmo esqueme de aluno e professor,
          mas tera de modificar a string turma de professor e aluno*/
}

