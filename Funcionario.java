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
}