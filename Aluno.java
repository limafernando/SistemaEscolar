package sistemaEscolar;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Aluno extends Pessoa{
            
	protected String turmaDoAluno; //Antes tinhamos uma intancia da classe Turma, mas não faz sentido ter uma instancia da classe turma. Mesma coisa na classe Prof
	protected String nomeResponsavel;
	protected String telefoneResponsavel;
	protected double mensalidade;
	protected double notas[] = new double[30];

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
        
        public void cadastrarAluno(Aluno aluno){
            //Cadastrar dados de um aluno
            
            aluno.setNome(JOptionPane.showInputDialog(null, "Informe o nome: "));

            aluno.setCpf(JOptionPane.showInputDialog(null, "Informe o CPF: "));
           
            /*
            aluno.setRg(JOptionPane.showInputDialog(null, "Informe o RG: "));*/
            
            aluno.setMatricula(JOptionPane.showInputDialog(null, "Informe a matricula: "));/*

            aluno.setTelefone(JOptionPane.showInputDialog(null, "Informe o telefone: "));
            
            aluno.setEmail(JOptionPane.showInputDialog(null, "Informe o email: "));
           
            aluno.setTipoSanguineo(JOptionPane.showInputDialog(null, "Informe o tipo sanguineo: "));
            */
            aluno.setTurmaDoAluno(JOptionPane.showInputDialog(null, "Informe a turma: "));
						
            /*
            aluno.setNomeResponsavel(JOptionPane.showInputDialog(null, "Informe o nome do responsavel: "));
							
            aluno.setTelefone do responsavel(JOptionPane.showInputDialog(null, "Informe o telefone do responsavel: "));
						
            aluno.setMensalidade(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a mensalidade: ")));			
							
            //criar e utilizar um metodo de ordenacao no array alunos
            */
							
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");

        }

	public void alterarDadosAluno(Aluno aluno){
            //Alterar dados de um aluno cadastrado 
            
            aluno.setNome(JOptionPane.showInputDialog(null, "Informe o nome: "));

            aluno.setCpf(JOptionPane.showInputDialog(null, "Informe o CPF: "));
           
            /*
            aluno.setRg(JOptionPane.showInputDialog(null, "Informe o RG: "));*/
            
            aluno.setMatricula(JOptionPane.showInputDialog(null, "Informe a matricula: "));/*0

            aluno.setTelefone(JOptionPane.showInputDialog(null, "Informe o telefone: "));
            
            aluno.setEmail(JOptionPane.showInputDialog(null, "Informe o email: "));
           
            aluno.setTipoSanguineo(JOptionPane.showInputDialog(null, "Informe o tipo sanguineo: "));
            */
            aluno.setTurmaDoAluno(JOptionPane.showInputDialog(null, "Informe a turma: "));
						
            /*
            aluno.setNomeResponsavel(JOptionPane.showInputDialog(null, "Informe o nome do responsavel: "));
							
            aluno.setTelefone do responsavel(JOptionPane.showInputDialog(null, "Informe o telefone do responsavel: "));
						
            aluno.setMensalidade(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a mensalidade: ")));			
							
            */
							
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        }

        public void removerAluno(Aluno alunos[], int posicao){
            //Remover um aluno cadastrado
							
            for(int j = posicao; j < alunos.length; j++){								
									
                if(j == (alunos.length - 1)){					
                    alunos[j] = new Aluno();
                }
		
                else{
                    alunos[j] = alunos[j+1];
                }
            }
            
            JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
        }

	public void consultarAluno(Aluno aluno){
            //Consultar dados de um aluno
            
            JOptionPane.showMessageDialog(null, aluno);
        }

	public void notas(){

        }
							
	public void declaracaoAluno(Aluno aluno){
            //Gerar um "documento" de comprovacao de matricula
            JOptionPane.showMessageDialog(null, "\t\t\tDECLARACAO DE VINCULO\n" +
                    "\tDeclaramos para os devidos fins que " + aluno.getNome() + 
                    "e' um aluno regularmente " +
                    "matriculado no ano letivo de " + aluno.getAno() + "." + 
                    "\n\n\nJoao Pessoa, " + aluno.getData() +
                    "\n\n\n__________________________________________\nSECRETARIA");
        }
        
        private String getData() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}

	private String getAno() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy");
		Date year = new Date();
		return dateFormat.format(year);
	}
}
