
public class Funcionario extends Pessoa {
	private double salario;
	public Funcionario(String cpf,String nome,double salario){
		super(cpf,nome);
		this.salario=salario;
	}
	public double getSalario(){
		return this.salario;
	}
	public void setSalario(double salario){
		this.salario=salario;
	}
}
