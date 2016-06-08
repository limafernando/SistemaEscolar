package sistemaEscolar;

import javax.swing.JOptionPane;

public class Prof extends Funcionario{

protected String turmasDoProf[] = new String[10];
	
	private int aux1 = 0; //varíavel para auxiliar o Set de Turmas
	private String aux2 = ""; //varíavel para auxiliar o Get de Turmas
	private int aux3 = 0; // auxilia também o Get de Turmas
	
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
	public String getTurmasDoProf2(int i){
		return turmasDoProf[i];
	}	
	
        
        public void cadastrarProfessor(Prof prof){
            //Cadastrar dados de um professor
            
            prof.setNome(JOptionPane.showInputDialog(null, "Informe o nome: "));

            prof.setCpf(JOptionPane.showInputDialog(null, "Informe o CPF: "));
           
            /*
            prof.setRg(JOptionPane.showInputDialog(null, "Informe o RG: "));
            
            prof.setMatricula(JOptionPane.showInputDialog(null, "Informe a matricula: "));

            prof.setTelefone(JOptionPane.showInputDialog(null, "Informe o telefone: "));
            
            prof.setEmail(JOptionPane.showInputDialog(null, "Informe o email: "));
           
            prof.setTipoSanguineo(JOptionPane.showInputDialog(null, "Informe o tipo sanguineo: "));
            */
            
            prof.setTipoSanguineo(JOptionPane.showInputDialog(null, "Informe o tipo sanguineo: "));
            
            prof.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salario: ")));
            
            int provisorio = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas turmas tem esse professor?")); 
            for(int i = 0; i < provisorio; i++){
                prof.setTurmasDoProf(JOptionPane.showInputDialog(null, "\nInforme a ID da turma " + (i+1) + ": " ));
            }
            //contA++;    //NO MAIN
        }

	public void alterarDadosProfessor(Prof prof){
            //Alterar dados de um professor cadastrado 
            
            prof.setNome(JOptionPane.showInputDialog(null, "Informe o nome: "));

            prof.setCpf(JOptionPane.showInputDialog(null, "Informe o CPF: "));
           
            /*
            prof.setRg(JOptionPane.showInputDialog(null, "Informe o RG: "));
            
            prof.setMatricula(JOptionPane.showInputDialog(null, "Informe a matricula: "));

            prof.setTelefone(JOptionPane.showInputDialog(null, "Informe o telefone: "));
            
            prof.setEmail(JOptionPane.showInputDialog(null, "Informe o email: "));
           
            prof.setTipoSanguineo(JOptionPane.showInputDialog(null, "Informe o tipo sanguineo: "));
            */
            
            prof.setTipoSanguineo(JOptionPane.showInputDialog(null, "Informe o tipo sanguineo: "));
            
            prof.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salario: ")));
            
            int provisorio = Integer.parseInt("\nQuantas turmas tem esse professor?"); 
            for(int i = 0; i < provisorio; i++){
                prof.setTurmasDoProf(JOptionPane.showInputDialog(null, "\nInforme a ID da turma " + (i+1) + ": " ));
            }

            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
            
            //contA++;    //NO MAIN
        }

        public void removerProfessor(Prof professores[], int posicao){
            //Remover um professor cadastrado
							
            for(int j = posicao; j < professores.length; j++){								
									
                if(j == (professores.length - 1)){					
                    professores[j] = new Prof();
                }
		
                else{
                    professores[j] = professores[j+1];
                }
            }
            
            JOptionPane.showMessageDialog(null, "Professor removido com sucesso!");
        }

	public void consultarProfessor(Prof prof){
            //Consultar dados de um professor
            
            JOptionPane.showMessageDialog(null, prof);
        }

}
