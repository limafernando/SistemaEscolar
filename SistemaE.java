import java.util.Scanner;

public class SistemaE{

	public static void main(String args[]){

		Scanner entrada = new Scanner(System.in);

		String opcao = "";

		Aluno alunos[] = new Aluno[20];
		int contA = 0; //contador para o array alunos
		String buscarA = ""; //String aux para fazer busca de alunos

		Prof professores[] = new Prof[2];
		int contP = 0; //contador para o array alunos
		String buscarP = ""; //String aux para fazer busca de professores

		Turma turmas[] = new Turma[1];
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

		//while(true){
		
			System.out.println("\n1 - Alunos");
			System.out.println("2 - Professores");
			System.out.println("3 - Turmas");
			System.out.println("4 - Funcionarios");
			//System.out.println("0 - Encerrar programa");

			System.out.print("\nInforme a opcao desejada: ");
			opcao = entrada.next();

			switch (opcao){
				case "1":
					System.out.println("\n1 - Cadastrar aluno");
					System.out.println("2 - ALterar dados do aluno"); //buscar pelo nome
					System.out.println("3 - Remover aluno"); //buscar pelo nome
					System.out.println("4 - Consultar aluno"); //boletim / buscar pelo nome
					System.out.println("5 - Registra nota do aluno"); //buscar pelo nome

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
							
							System.out.print("\nInforme o telefone: ");
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

							//criar e utilizar um metodo de ordenação no array alunos

							contA++;

							break;

						case "2":
							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM

							System.out.print("\nInforme o nome do aluno: ");
							buscarA = entrada.nextLine();

							//criar um metodo com algoritmo de busca

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

							//utilizar o metodo de busca

							//System.out.print(/*retono do metodo de busca*/);

							break;

						case "5":
							entrada.nextLine(); //LIMPAR BUFFER DX SACANNER CHAMADO ENTRADA, MORAL, SE N DA RUIM

							break;

						default:
							break;
					}

					break;


				/*case "2":
					//funcao professor
					break;

				case "3":
					System.out.println("\n1 - Cadastrar turma");
					System.out.println("2 - Registrar aluno na turma"); //buscar pelo nome
					System.out.println("3 - Remover turma"); //buscar pelo nome
					System.out.println("4 - Consultar aluno"); //boletim / buscar pelo nome
					System.out.println("5 - Registrar professor na turma"); //buscar pelo nome

					System.out.print("\nInforme a opcao desejada: ");
					opcao = entrada.next();

					switch (opcao){
						case "1":
							System.out.print("\nInforme o nome da turma: ");
							turma.setId(entrada.next());

							entrada.nextLine9();

							while(true){
								System.out.println("\n1 - Registrar aluno na turma");
								System.out.println("2 - Registrar professor na turma");
								System.out.println("3 - Sair");

								System.out.print("\nInforme a opcao desejada: ");
								opcao = entrada.next();

							}

							break;
					break;

				case "4":
					//funcao funcionario
					break;*/

				case "0":
					break;

				default:
					break;
			}
		//}//fecha o while
	}//fecha o main
}//fecha a classe