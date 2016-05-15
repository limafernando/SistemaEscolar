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
		System.out.println(super.toString() + "\nCargo: " + cargo + "\nSalário: " + salario);
	}
}
