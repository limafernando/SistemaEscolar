package sistemaEscolar;
import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{
	
	protected String cargo;
	protected double salario;

	public Funcionario(){
		super();
		cargo = "";
		salario = 0.0;
	}

	public Funcionario(String cargo){
		super();
		this.cargo = cargo;
		salario = 0.0;
	}
	
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public String getCargo(){
		return cargo;
	}
	
	public double getSalario(){
		return salario;
	}
	
	public String toString(){
		return super.toString() + "\nCargo: " + cargo + "\nSalário: " + salario;
	}
        
        public void cadastrarFuncionario(Funcionario funcionario){
            //Cadastrar dados de um funcionario
            
            funcionario.setNome(JOptionPane.showInputDialog(null, "Informe o nome: "));

            funcionario.setCpf(JOptionPane.showInputDialog(null, "Informe o CPF: "));
           
            /*
            funcionario.setRg(JOptionPane.showInputDialog(null, "Informe o RG: "));
            
            funcionario.setMatricula(JOptionPane.showInputDialog(null, "Informe a matricula: "));

            funcionario.setTelefone(JOptionPane.showInputDialog(null, "Informe o telefone: "));
            
            funcionario.setEmail(JOptionPane.showInputDialog(null, "Informe o email: "));
           
            funcionario.setTipoSanguineo(JOptionPane.showInputDialog(null, "Informe o tipo sanguineo: "));
            
            funcionario.setCargo(JOptionPane.showInputDialog(null, "Informe o cargo: "));
            
            funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salario: ")));
            
            */
							
            JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
        }
        
        public void alterarDadosFuncionario(Funcionario funcionario){
            //Alterar dados de um funcionario
            
            funcionario.setNome(JOptionPane.showInputDialog(null, "Informe o nome: "));

            funcionario.setCpf(JOptionPane.showInputDialog(null, "Informe o CPF: "));
           
            /*
            funcionario.setRg(JOptionPane.showInputDialog(null, "Informe o RG: "));
            
            funcionario.setMatricula(JOptionPane.showInputDialog(null, "Informe a matricula: "));

            funcionario.setTelefone(JOptionPane.showInputDialog(null, "Informe o telefone: "));
            
            funcionario.setEmail(JOptionPane.showInputDialog(null, "Informe o email: "));
           
            funcionario.setTipoSanguineo(JOptionPane.showInputDialog(null, "Informe o tipo sanguineo: "));
            
            funcionario.setCargo(JOptionPane.showInputDialog(null, "Informe o cargo: "));
            
            funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o salario: ")));
            
            */
							
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        }
        
        public void removerFuncionario(Funcionario funcionarios[], int posicao){
            //Remover um funcionario cadastrado
							
            for(int j = posicao; j < funcionarios.length; j++){								
									
                if(j == (funcionarios.length - 1)){					
                    funcionarios[j] = new Funcionario();
                }
		
                else{
                    funcionarios[j] = funcionarios[j+1];
                }
            }
            
            JOptionPane.showMessageDialog(null, "Funcionario removido com sucesso!");
        }
        
        public void consultarFuncionario(Funcionario funcionario){
            //Consultar dados de um funcionario
            
            JOptionPane.showMessageDialog(null, funcionario);
        }
        
}
