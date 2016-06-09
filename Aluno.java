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
	protected double notas[][] = new double[5][5];

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
        
        public String getNomeResponsavel(){
            return nomeResponsavel;
        }
        
        public String getTelefoneResponsavel(){
            return telefoneResponsavel;
        }
        
        public double getMensalidade(){
            return mensalidade;
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

	public void setNotas(Double nota, int i, int j){
		notas[i][j] = nota;
	}

	public String toString(){
		return super.toString() + "\nTurma: " + turmaDoAluno + "\nNome do responsavel: " + nomeResponsavel + 
			"\nTelefone do responsavel: " + telefoneResponsavel + "\nMensalidade: " + mensalidade;
	}
        
        public String mostraNotas(){

            return "                                                   "
                    + "PRIMEIRO BIMESTRE" + "             " 
                    + "SEGUNDO BIMESTRE" + "             "
                    + "TERCEIRO BIMESTRE"+ "             "
                    + "QUARTO BIMESTRE"+ "             "
                    + "MEDIAS FINAIS\n"
                    + "\nCIENCIAS NATURAIS: " + "                          " 
                    + notas[0][0] + "                                                "
                    + notas[0][1] + "                                              "
                    + notas[0][2] + "                                             "
                    + notas[0][3] + "                                         "
                    + notas[0][4]
                    + "\nCIENCIAS HUMANAS: " + "                          " 
                    + notas[1][0] + "                                                "
                    + notas[1][1] + "                                              "
                    + notas[1][2] + "                                             "
                    + notas[1][3] + "                                         "
                    + notas[1][4]
                    + "\nMATEMATICA: " + "                                       " 
                    + notas[2][0] + "                                                "
                    + notas[2][1] + "                                              "
                    + notas[2][2] + "                                             "
                    + notas[2][3] + "                                         "
                    + notas[2][4]
                    + "\nPORTUGUES: " + "                                        " 
                    + notas[3][0] + "                                                "
                    + notas[3][1]+ "                                               "
                    + notas[3][2]+ "                                             "
                    + notas[3][3]+ "                                        "
                    +notas[3][4]
                    + "\nINGLES: " + "                                                  " 
                    + notas[4][0] + "                                                " 
                    + notas[4][1]+ "                                               " 
                    + notas[4][2]+ "                                             "
                    + notas[4][3]+ "                                        " 
                    + notas[4][4];
        }
        
        public void cadastrarAluno(Aluno aluno){
            //Cadastrar dados de um aluno
            
            aluno.setNome(JOptionPane.showInputDialog(null, "Informe o nome: "));

            aluno.setCpf(JOptionPane.showInputDialog(null, "Informe o CPF: "));
           
            
            aluno.setRg(JOptionPane.showInputDialog(null, "Informe o RG: "));
            
            aluno.setMatricula(JOptionPane.showInputDialog(null, "Informe a matricula: "));
            

            aluno.setTelefone(JOptionPane.showInputDialog(null, "Informe o telefone: "));
            
            aluno.setEmail(JOptionPane.showInputDialog(null, "Informe o email: "));
           
            aluno.setTipoSanguineo(JOptionPane.showInputDialog(null, "Informe o tipo sanguineo: "));
            
            aluno.setTurmaDoAluno(JOptionPane.showInputDialog(null, "Informe a turma: "));
						
            
            aluno.setNomeResponsavel(JOptionPane.showInputDialog(null, "Informe o nome do responsavel: "));
							
            aluno.setTelefoneResponsavel(JOptionPane.showInputDialog(null, "Informe o telefone do responsavel: "));
            
            aluno.setMensalidade(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a mensalidade: ")));
            
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        }

	public void alterarDadosAluno(Aluno aluno){
            //Alterar dados de um aluno cadastrado 
            
            aluno.setNome(JOptionPane.showInputDialog(null, "Informe o nome: "));

            aluno.setCpf(JOptionPane.showInputDialog(null, "Informe o CPF: "));
            
            aluno.setRg(JOptionPane.showInputDialog(null, "Informe o RG: "));
            
            aluno.setMatricula(JOptionPane.showInputDialog(null, "Informe a matricula: "));

            aluno.setTelefone(JOptionPane.showInputDialog(null, "Informe o telefone: "));
            
            aluno.setEmail(JOptionPane.showInputDialog(null, "Informe o email: "));
           
            aluno.setTipoSanguineo(JOptionPane.showInputDialog(null, "Informe o tipo sanguineo: "));
            
            aluno.setTurmaDoAluno(JOptionPane.showInputDialog(null, "Informe a turma: "));
						
            aluno.setNomeResponsavel(JOptionPane.showInputDialog(null, "Informe o nome do responsavel: "));
							
            aluno.setTelefoneResponsavel(JOptionPane.showInputDialog(null, "Informe o telefone do responsavel: "));
						
            aluno.setMensalidade(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a mensalidade: ")));
            
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
            
            JOptionPane.showMessageDialog(null, aluno + "\n\n" +aluno.mostraNotas());
        }

	public void notas(Aluno aluno){
            int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da disciplina:\n"
	    		+ "1- Ciencias da natureza\n" + "2- Ciencias humanas\n" +
	    		"3- Matematica\n" + "4- Portugues\n" + "5- Ingles"));
	    
	    		
	    int j = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o bimestre da nota" +
	    		" (numero do bimestre ou 5 para final)"));
	    
	    double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota:"));
            
	    i--; //FEITO ISSO PARA QUE SEJA SETADO NA POSICAO CORRETA DO ARRAY
            j--; //ASSIM COMO AQUI
            
	    aluno.setNotas(nota, i, j);
        }
							
	public void declaracaoAluno(Aluno aluno){
            //Gerar um documento de comprovacao de matricula
            JOptionPane.showMessageDialog(null, "DECLARACAO DE VINCULO\n" +
                    "\tDeclaramos para os devidos fins que " + aluno.getNome() + 
                    " e' um aluno regularmente " +
                    "matriculado no ano letivo de " + aluno.getAno() + "." + 
                    "\n\n\nJoao Pessoa, " + aluno.getData() +
                    "\n\n\n__________________________________________\nSECRETARIA");
        }
        
        //OS METODOS ABAIXO SERVEM PARA UTILIZAR A DATA ATUAL
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
