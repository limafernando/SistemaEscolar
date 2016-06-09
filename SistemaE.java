package sistemaEscolar;
import javax.swing.JOptionPane;

public class SistemaE{

	public static void main(String args[]){

		boolean aluno = false; //aux para verificar se o aluno informado existe no sistema
		boolean professor = false; //aux para verificar se o professor informado existe no sistema
		boolean funcionario = false; //auxo para verificar se o funcionario informado existe no sistema
		boolean turma = false;
                
		String matriculaB = ""; //aux para busca de aluno/professor/funcionario
	
		String opcao = "";

		Aluno alunos[] = new Aluno[2000];
		int contA = 0; //contador para o array alunos
		String buscarA = ""; //String aux para fazer busca de alunos

		Prof professores[] = new Prof[200];
		int contP = 0; //contador para o array alunos
		String buscarP = ""; //String aux para fazer busca de professores

		Turma turmas[] = new Turma[50];
		int contT = 0; //contador para o array alunos
		String buscarT = ""; //String aux para fazer busca de turmas
		
		Funcionario funcionarios[] = new Funcionario[500];
		int contF = 0;
		String buscarF = "";

		//Instanciacao dos objetos dos arrays alunos, professores, turmas e funcionarios
		for(int i = 0; i < alunos.length; i++){
			alunos[i] = new Aluno();
		}
		
		for(int i = 0; i < professores.length; i++){
			professores[i] = new Prof();
		}

		for(int i = 0; i < turmas.length; i++){
			turmas[i] = new Turma();
		}
		
		for(int i = 0; i < funcionarios.length; i++){
			funcionarios[i] = new Funcionario();
		}
		//Fim da instanciao

		while(true){
		
			opcao = JOptionPane.showInputDialog(null, "1 - Alunos \n2 - Professor \n3 - Turmas \n4 - Funcionarios \nInforme a opcao desejada: ", "SISTEMA ESCOLAR", JOptionPane.CLOSED_OPTION);
                        
                        if(opcao == null){
                            break; //CASO SEJA APERTADO OS BOATOES CANCEL OU CLOSE, OPCAO N RECEBERA NENHUMA VALOR, OU SEJA, NULL
                            //CASO ISSO OCORRA, ENTRA NO IF E DARA BREAK NOS WHILE/SWITCH
                        }
                        
			switch (opcao){
				case "1": //Alunos
                                        opcao = JOptionPane.showInputDialog(null, "1 - Cadastrar aluno \n2 - Alterar dados do aluno \n3 - Remover aluno "
                                                + "\n4 - Consultar aluno \n5 - Registrar notas do aluno \n6 - Gerar declaracao de vinculo "
                                                + "\nInforme a opcao desejada: ");
                                        
                                        if(opcao == null){
                                            break;
                                        }
                                        
					switch (opcao){

						case "1": //Cadastrar aluno
							alunos[contA].cadastrarAluno(alunos[contA]);

							contA++;

							break;

						case "2": //Alterar dados de um aluno cadastrado
                                                    
                                                    matriculaB = "";
                                                    matriculaB = JOptionPane.showInputDialog(null, "Informe a matricula do aluno: ");
                                                    
                                                    if(matriculaB == null){
							break;
                                                    }
                                                    else if(matriculaB.isEmpty()){
                                                        JOptionPane.showMessageDialog(null, "Nenhuma dado informado!");
                                                        break;
                                                    }

							aluno = false;
							//Busca
							for(int i = 0; i < alunos.length; i++){
								if(matriculaB.equals(alunos[i].getMatricula())){

									aluno = true;
									
                                                                        alunos[i].alterarDadosAluno(alunos[i]);
                                                                }
							}

							if(!aluno){
								JOptionPane.showMessageDialog(null, "Aluno nao existente!");
							}

							break;

						case "3": //Remover um aluno cadastrado
                                                        
                                                        matriculaB = "";
							matriculaB = JOptionPane.showInputDialog(null, "Informe a matricula do aluno: ");
                                                    
                                                        if(matriculaB == null){
                                                            break;
                                                        }
                                                        
                                                        else if(matriculaB.isEmpty()){
                                                            JOptionPane.showMessageDialog(null, "Nenhuma dado informado!");
                                                            break;
                                                        }

							aluno = false;
							//Busca
							for(int i = 0; i < alunos.length; i++){
								if(matriculaB.equals(alunos[i].getMatricula())){
									aluno = true;
									
									//Caso o aluno desejado seja encontrado, cada elemento do array alunos, a partir do elemento
									//que se encontra do aluno desejado, vai receber o conteÃºdo do elemento a frente, exceto se
									//o elemento for o ultimo do array, neste caso, ele vai ser instanciado novamente

									alunos[i].removerAluno(alunos, i);

									if(contA != 0){//Contador de alunos vai ser decrementado
                                                                            contA--;
                                                                        }
								}
							}

							if(!aluno){
								JOptionPane.showMessageDialog(null, "Aluno nao existente!");
							}

							break;

						case "4": //Consultar dados de um aluno
							                                                        
                                                        matriculaB = "";
							matriculaB = JOptionPane.showInputDialog(null, "Informe a matricula do aluno: ");
                                                        
                                                        if(matriculaB == null){
                                                            break;
                                                        }
                                                        else if(matriculaB.isEmpty()){
                                                            JOptionPane.showMessageDialog(null, "Nenhuma dado informado!");
                                                            break;
                                                        }

							aluno = false;
							//Busca
							for(int i = 0; i < alunos.length; i++){
								if(matriculaB.equals(alunos[i].getMatricula())){
									aluno = true;

									alunos[i].consultarAluno(alunos[i]);
								}
							}

							if(!aluno){
								JOptionPane.showMessageDialog(null, "Aluno nao existente!");
							}
                                                        
                                                        break;

						case "5": //notas
                                                        matriculaB = "";
							matriculaB = JOptionPane.showInputDialog(null, "Informe a matricula do aluno: ");
                                                        
                                                        if(matriculaB == null){
                                                            break;
                                                        }
                                                        else if(matriculaB.isEmpty()){
                                                            JOptionPane.showMessageDialog(null, "Nenhuma dado informado!");
                                                            break;
                                                        }

							aluno = false;
							//Busca
							for(int i = 0; i < alunos.length; i++){
								if(matriculaB.equals(alunos[i].getMatricula())){
									aluno = true;

									alunos[i].notas(alunos[i]);
								}
							}

							if(!aluno){
								JOptionPane.showMessageDialog(null, "Aluno nao existente!");
							}
                                                        
							break;
							
						case "6": //Gerar um documento de comprovacaoo de matricula
                                                        matriculaB = "";
							matriculaB = JOptionPane.showInputDialog(null, "Informe a matricula do aluno: ");
                                                        
                                                        if(matriculaB == null){
                                                            break;
                                                        }
                                                        else if(matriculaB.isEmpty()){
                                                            JOptionPane.showMessageDialog(null, "Nenhuma dado informado!");
                                                            break;
                                                        }

							aluno = false;
							//Busca
							for(int i = 0; i < alunos.length; i++){
								if(matriculaB.equals(alunos[i].getMatricula())){
									aluno = true;

									alunos[i].declaracaoAluno(alunos[i]);
								}
							}

							if(!aluno){
								JOptionPane.showMessageDialog(null, "Aluno nao existente!");
							}
                                                    
                                                        break;

						default:
							JOptionPane.showMessageDialog(null,"Opcao invalida!");
							break;
					}

					break;
					
					
				case "2":   //professores
                                        opcao = JOptionPane.showInputDialog(null, "1 - Cadastrar Professor \n2 - Alterar dados do professor \n3 - Remover professor "
                                                + "\n4 - Consultar professor \nInforme a opcao desejada: ");
                                        
                                        if(opcao == null){
                                            break;
                                        }
                                        
					switch (opcao){

						case "1": //Cadastrar professor
							professores[contP].cadastrarProfessor(professores[contP]);

							contP++;

							break;

						case "2": //Alterar dados de um professor cadastrado
                                                    
                                                    matriculaB = "";
                                                    matriculaB = JOptionPane.showInputDialog(null, "Informe a matricula do professor: ");
                                                    
                                                    if(matriculaB == null){
                                                        break;
                                                    }
                                                    else if(matriculaB.isEmpty()){
                                                        JOptionPane.showMessageDialog(null, "Nenhuma dado informado!");
                                                        break;
                                                    }

							professor = false;
							//Busca
							for(int i = 0; i < professores.length; i++){
								if(matriculaB.equals(professores[i].getMatricula())){

									professor = true;
									
                                                                        professores[i].alterarDadosProfessor(professores[i]);
                                                                }
							}

							if(!professor){
								JOptionPane.showMessageDialog(null, "Professor nao existente!");
							}

							break;

						case "3": //Remover um professor cadastrado
                                                        
                                                        matriculaB = "";
							matriculaB = JOptionPane.showInputDialog(null, "Informe a matricula do professor: ");
                                                        
                                                        if(matriculaB == null){
                                                            break;
                                                        }
                                                        else if(matriculaB.isEmpty()){
                                                            JOptionPane.showMessageDialog(null, "Nenhuma dado informado!");
                                                            break;
                                                        }

							professor = false;
							//Busca
							for(int i = 0; i < professores.length; i++){
								if(matriculaB.equals(professores[i].getMatricula())){
									professor = true;
									
									//Caso o professor desejado seja encontrado, cada elemento do array alunos, a partir do elemento
									//que se encontra do aluno desejado, vai receber o conteÃºdo do elemento a frente, exceto se
									//o elemento for ultimo do array, neste caso, ele vai ser instanciado

									professores[i].removerProfessor(professores, i);

									//Contador de professor vai ser decrementado
                                                                        if(contP != 0){
                                                                            contP--;
                                                                        }
								}
							}

							if(!professor){
								JOptionPane.showMessageDialog(null, "Professor nao existente!");
							}

							break;

						case "4": //Consultar dados de um professor
							                                                        
                                                        matriculaB = "";
							matriculaB = JOptionPane.showInputDialog(null, "Informe a matricula do professor: ");
                                                        
                                                        if(matriculaB == null){
                                                            break;
                                                        }
                                                        else if(matriculaB.isEmpty()){
                                                            JOptionPane.showMessageDialog(null, "Nenhuma dado informado!");
                                                            break;
                                                        }

							professor = false;
							//Busca
							for(int i = 0; i < professores.length; i++){
								if(matriculaB.equals(professores[i].getMatricula())){
									professor = true;

									professores[i].consultarProfessor(professores[i]);
								}
							}

							if(!professor){
								JOptionPane.showMessageDialog(null, "Professor nao existente!");
							}
                                                        
                                                        break;
							
						default:
							JOptionPane.showMessageDialog(null,"Opcao invalida!");
							break;
					}
					
					break;

				
					case "3"://Turma
					opcao = JOptionPane.showInputDialog(null, "1 - Cadastrar Turma \n2 - Inserir Alunos na turma \n3 - Inserir Professores na turma "
                            + "\n4 - Consultar  turma	\n5 - Alterar Turma  \n0 - Voltar ao menu anterior \nInforme a opcao desejada: ");
					
					switch (opcao){
					case "1":
						turmas[contT].cadastrarTurma(turmas,contT);
						contT++;
						break;
						
					case "2":
						turmas[contT].registrarAlunos(alunos,turmas);
						break;
						
					case "3":
						turmas[contT].registrarProfessor(professores, turmas);
						break;
							
					case "4":
						turmas[contT].consultarTurma(turmas);
							break;
					case "5":
						turmas[contT].alterarTurma(turmas,professores,alunos);
						break;
							
						
					default:
						JOptionPane.showMessageDialog(null,"Opcao invalida!");
						break;
				}		
		
				break;
				
				
				case "4": //Funcionarios
                                        opcao = JOptionPane.showInputDialog(null, "1 - Cadastrar Funcionario \n2 - Alterar dados do funcionario \n3 - Remover funcionario "
                                                + "\n4 - Consultar funcionario \nInforme a opcao desejada: ");
                                        
                                        if(opcao == null){
                                            break;
                                        }
					
                                        switch (opcao){

						case "1": //Cadastrar funcionario
							funcionarios[contF].cadastrarFuncionario(funcionarios[contF]);

							contF++;

							break;

						case "2": //Alterar dados de um funcionario cadastrado
                                                    
                                                    matriculaB = "";
                                                    matriculaB = JOptionPane.showInputDialog(null, "Informe a matricula do funcionario: ");
                                                    
                                                    if(matriculaB == null){
                                                            break;
                                                        }
                                                    else if(matriculaB.isEmpty()){
                                                        JOptionPane.showMessageDialog(null, "Nenhuma dado informado!");
                                                        break;
                                                    }

							funcionario = false;
							//Busca
							for(int i = 0; i < funcionarios.length; i++){
								if(matriculaB.equals(funcionarios[i].getMatricula())){

									funcionario = true;
									
                                                                        funcionarios[i].alterarDadosFuncionario(funcionarios[i]);
                                                                }
							}

							if(!funcionario){
								JOptionPane.showMessageDialog(null, "Funcionario nao existente!");
							}

							break;

						case "3": //Remover um funcionario cadastrado
                                                        
                                                        matriculaB = "";
							matriculaB = JOptionPane.showInputDialog(null, "Informe a matricula do funcionario: ");
                                                        
                                                        if(matriculaB == null){
                                                            break;
                                                        }
                                                        else if(matriculaB.isEmpty()){
                                                            JOptionPane.showMessageDialog(null, "Nenhuma dado informado!");
                                                            break;
                                                        }

							funcionario = false;
							//Busca
							for(int i = 0; i < funcionarios.length; i++){
								if(matriculaB.equals(funcionarios[i].getMatricula())){
									funcionario = true;
									
									//Caso o funcionario desejado seja encontrado, cada elemento do array alunos, a partir do elemento
									//que se encontra do aluno desejado, vai receber o conteÃºdo do elemento a frente, exceto se
									//o elemento for ultimo do array, neste caso, ele vai ser instanciado

									funcionarios[i].removerFuncionario(funcionarios, i);

									//Contador de alunos vai ser decrementado
                                                                        if(contF != 0){
                                                                            contF--;
                                                                        }
								}
							}

							if(!funcionario){
								JOptionPane.showMessageDialog(null, "Funcionario nao existente!");
							}

							break;

						case "4": //Consultar dados de um funcionario
							                                                        
                                                        matriculaB = "";
							matriculaB = JOptionPane.showInputDialog(null, "Informe a matricula do funcionario: ");
                                                        
                                                        if(matriculaB == null){
                                                            break;
                                                        }
                                                        else if(matriculaB.isEmpty()){
                                                            JOptionPane.showMessageDialog(null, "Nenhuma dado informado!");
                                                            break;
                                                        }

							funcionario = false;
							//Busca
							for(int i = 0; i < funcionarios.length; i++){
								if(matriculaB.equals(funcionarios[i].getMatricula())){
									funcionario = true;

									funcionarios[i].consultarFuncionario(funcionarios[i]);
								}
							}

							if(!funcionario){
								JOptionPane.showMessageDialog(null, "Funcionarios nao existente!");
							}
                                                        
                                                        break;
							
						default:
							JOptionPane.showMessageDialog(null,"Opcao invalida!");
							break;
					}
					
					break;
                                    
                                default:
                                    JOptionPane.showMessageDialog(null, "Opcao invalida!");
                                    break;
                        }//fecha switch principal
		}//fecha o while
	}//fecha o main
}//fecha a classe
