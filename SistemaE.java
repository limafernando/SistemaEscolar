import java.util.Scanner;

public class SistemaE{

	public static void main(String args[]){

		Scanner entrada = new Scanner(System.in);

		boolean done = false; //aux para o while
		boolean aluno = false; //aux para verificar se o aluno informado existe no sistema
		boolean professor = false; //aux para verificar se o professor informado existe no sistema
	
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

		//Instanciação dos objetos dos arrays alunos, professores e turmas
		for(int i = 0; i < alunos.length; i++){
			alunos[i] = new Aluno();
		}
		
		for(int i = 0; i < professores.length; i++){
			professores[i] = new Prof();
		}

		for(int i = 0; i < turmas.length; i++){
			turmas[i] = new Turma();
		}
		//Fim da instanciação

		while(!done){
		
			System.out.println("\n1 - Alunos");
			System.out.println("2 - Professores");
			System.out.println("3 - Turmas");
			System.out.println("4 - Funcionarios");
			System.out.println("0 - Encerrar programa");

			System.out.print("\nInforme a opcao desejada: ");
			opcao = entrada.next();

			switch (opcao){
				case "1":
					System.out.println("\n1 - Cadastrar aluno");
					System.out.println("2 - Alterar dados do aluno"); //buscar pelo nome
					System.out.println("3 - Remover aluno"); //buscar pelo nome
					System.out.println("4 - Consultar aluno"); //boletim / buscar pelo nome
					System.out.println("5 - Registrar notas do aluno"); //buscar pelo nome

					System.out.print("\nInforme a opcao desejada: ");
					opcao = entrada.next();

					switch (opcao){

						case "1":
							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
							
							System.out.print("\nInforme o nome: ");
							alunos[contA].setNome(entrada.nextLine());

							System.out.print("\nInforme o cpf: ");
							alunos[contA].setCpf(entrada.next());

							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM

							System.out.print("\nInforme o rg: ");
							alunos[contA].setRg(entrada.next());

							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
							
							System.out.print("\nInforme o matricula: ") ;
							alunos[contA].setMatricula(entrada.next());

							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
							
							/*System.out.print("\nInforme o telefone: ");
							alunos[contA].setTelefone(entrada.next());

							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
							
							System.out.print("\nInforme o email: ");
							alunos[contA].setEmail(entrada.next());

							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
							
							System.out.print("\nInforme o tipo sanguineo: ");
							alunos[contA].setTipoSanguineo(entrada.next());

							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
							
							System.out.print("\nInforme a turma: ");
							alunos[contA].setTurmaDoAluno(entrada.next());

							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM

							System.out.print("\nInforme o nome do responsavel: ");
							alunos[contA].setNomeResponsavel(entrada.next());

							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
							
							System.out.print("\nInforme o telefone do responsavel: ");
							alunos[contA].setTelefoneResponsavel(entrada.next());

							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
							
							System.out.print("\nInforme a mensalidade: ");
							alunos[contA].setMensalidade(entrada.nextDouble());

							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM

							//criar e utilizar um metodo de ordenação no array alunos*/

							System.out.println("\nAluno cadastrado com sucesso!");

							contA++;

							break;

						case "2":
							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM

							System.out.print("\nInforme o nome do aluno: ");
							buscarA = entrada.nextLine();

							aluno = false;
							for(int i = 0; i < alunos.length; i++){
								if(buscarA.equals(alunos[i].getNome())){

									aluno = true;
							
									System.out.print("\nInforme o nome: ");
									alunos[i].setNome(entrada.nextLine());

									System.out.print("\nInforme o cpf: ");
									alunos[i].setCpf(entrada.next());

									entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM

									System.out.print("\nInforme o rg: ");
									alunos[i].setRg(entrada.next());

									entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
									
									System.out.print("\nInforme o matricula: ") ;
									alunos[i].setMatricula(entrada.next());

									entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
									
									/*System.out.print("\nInforme o telefone: ");
									alunos[i].setTelefone(entrada.next());

									entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
									
									System.out.print("\nInforme o email: ");
									alunos[i].setEmail(entrada.next());

									entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
									
									System.out.print("\nInforme o tipo sanguineo: ");
									alunos[i].setTipoSanguineo(entrada.next());

									entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
									
									System.out.print("\nInforme a turma: ");
									alunos[i].setTurmaDoAluno(entrada.next());

									entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM

									System.out.print("\nInforme o nome do responsavel: ");
									alunos[i].setNomeResponsavel(entrada.next());

									entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
									
									System.out.print("\nInforme o telefone do responsavel: ");
									alunos[i].setTelefoneResponsavel(entrada.next());

									entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
									
									System.out.print("\nInforme a mensalidade: ");
									alunos[i].setMensalidade(entrada.nextDouble());

									entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM*/

									System.out.println("\nDados alterados com sucesso!");
								}
							}

							if(!aluno){
								System.out.println("\nAluno nao existente!");
							}

							break;

						case "3":
							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM

							System.out.print("\nInforme o nome do aluno: ");
							buscarA = entrada.nextLine();

							//utilizar o metodo de busca
							//remover o elemento desejado do array alunos
							//reordenar

							break;

						case "4":
							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM
							
							System.out.print("\nInforme o nome do aluno: ");
							buscarA = entrada.nextLine();

							aluno = false;
							for(int i = 0; i < alunos.length; i++){
								if(buscarA.equals(alunos[i].getNome())){
									aluno = true;
									System.out.print(alunos[i]);
								}
							}

							if(!aluno){
								System.out.println("\nAluno nao existente!");
							}

							break;

						case "5":
							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM

							break;

						default:
							break;
					}

					break;
					
					
				case "2":   //professores
				
					System.out.println("\n1 - Cadastrar professor");
					System.out.println("2 - Alterar dados do professor");
					System.out.println("3 - Remover professor");
					System.out.println("4 - Consultar professor");
					System.out.println("0 - Voltar ao menu anterior");

					System.out.print("\nInforme a opção desejada: ");
					opcao = entrada.next();
					
					switch (opcao){
						
						case "1":
						
							entrada.nextLine(); // Limpando o Buffer
							
							System.out.print("\n Informe o nome: ");
							professores[contP].setNome(entrada.nextLine);
							
							entrada.nextLine(); // Limpando o Buffer
							
							System.out.print("\nInforme o cpf: ");
							professores[contP].setCpf(entrada.nextLine());
							
							entrada.nextLine(); // Limpando o Buffer
							
							System.out.print("\nInforme o rg: ");
							professores[contP].setRg(entrada.nextLine());
							
							entrada.nextLine(); // Limpando o Buffer
							
							System.out.print("\nInforme a matrícula: ") ;
							professores[contP].setMatricula(entrada.nextLine());
							
							entrada.nextLine(); // Limpando o Buffer
							
							System.out.print("\nInforme o telefone: ");
							professores[contP].setTelefone(entrada.nextLine());
							
							entrada.nextLine(); // Limpando o Buffer
							
							System.out.print("\nInforme o email: ");
							professores[contP].setEmail(entrada.nextLine());
							
							entrada.nextLine(); // Limpando o Buffer
							
							System.out.print("\nInforme o tipo sanguíneo: ");
							professores[contP].setTipoSanguineo(entrada.nextLine());
							
							entrada.nextDouble(); // Limpando o Buffer
							
							System.out.print("\nInforme o salário: ");
							professores[contP].setSalario(entrada.nextDouble());
							
							entrada.nextInt(); // Limpando o Buffer
							
							System.out.print("\nQuantas turmas tem esse professor?")
							for(int i = 0; i < entrada.nextInt(); i++);{
								entrada.nextLine(); //Limpando o Buffer
								System.out.print("Informe a ID da turma " + (i+1) + ": ");
								professores[contP].setTurmasDoProf(entrada.nextLine()); 
							}
							
							contP++;
							
							break;
							
						case "2":
							entrada.nextLine(); // Limpando o Buffer
							
							System.out.print("\nInforme o nome do professor que deseja alterar: ");
							buscarP = entrada.nextLine();
							
							professor = false;
							for(int i = 0 < professores.length; i++){
								if(buscaP.equals(professores[i].getNome())){
									aluno = true;
									
									entrada.nextLine(); // Limpando o Buffer
							
								System.out.print("\n Informe o nome: ");
								professores[contP].setNome(entrada.nextLine);
							
								entrada.nextLine(); // Limpando o Buffer
							
								System.out.print("\nInforme o cpf: ");
								professores[contP].setCpf(entrada.nextLine());
							
								entrada.nextLine(); // Limpando o Buffer
							
								System.out.print("\nInforme o rg: ");
								professores[contP].setRg(entrada.nextLine());
							
								entrada.nextLine(); // Limpando o Buffer
							
								System.out.print("\nInforme a matrícula: ") ;
								professores[contP].setMatricula(entrada.nextLine());
							
								entrada.nextLine(); // Limpando o Buffer
							
								System.out.print("\nInforme o telefone: ");
								professores[contP].setTelefone(entrada.nextLine());
							
								entrada.nextLine(); // Limpando o Buffer
							
								System.out.print("\nInforme o email: ");
								professores[contP].setEmail(entrada.nextLine());
							
								entrada.nextLine(); // Limpando o Buffer
							
								System.out.print("\nInforme o tipo sanguíneo: ");
								professores[contP].setTipoSanguineo(entrada.nextLine());
							
								entrada.nextDouble(); // Limpando o Buffer
							
								System.out.print("\nInforme o salário: ");
								professores[contP].setSalario(entrada.nextDouble());
							
								entrada.nextInt(); // Limpando o Buffer
							
								System.out.print("\nQuantas turmas tem esse professor?")
								for(int i = 0; i < entrada.nextInt(); i++);{
									entrada.nextLine(); //Limpando o Buffer
									System.out.print("Informe a ID da turma " + (i+1) + ": ");
									professores[contP].setTurmasDoProf(entrada.nextLine()); 
								}
									
									
									System.out.println("\n Dados alterados com sucesso.");
								}
							}
							
							if(!professor){
								System.out.println("\n Professor informado não existente");
							}
							
							break;
							
						case "3":
							
							break;
							
						case "4":
							
							break;
							
						case "0":
							break;
							
						default:
							System.out.print("\nOpcao invalida!");
							break;
					}
					
					break;

				/*
				case "3":
					turmas
					break;

				case "4":
					funcionarios
					break;
				*/

				case "0":
					done = true;
					break;

				default:
					System.out.println("Opcao invalida!");
					break;
			}
		}//fecha o while
	}//fecha o main
}//fecha a classe
