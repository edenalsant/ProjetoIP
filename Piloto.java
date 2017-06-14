
public class Piloto extends Funcionario{
	private Aeroporto localizacao;
	public Piloto(String cpf,String nome,double salario,Aeroporto localizacao){
		super(cpf,nome,salario);
		this.localizacao=localizacao;
	}
	public Aeroporto getLocalizacao(){
		return this.localizacao;
	}
	public void setLocalizacao(Aeroporto localizacao){
		this.localizacao= localizacao;
	}
}
