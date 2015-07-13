public class PessoaFisica{
	private String nome;
	private String cpf;
	
	boolean valida(String cpf){
		//Lógica para validar CPF
		return true;
	}
	public void setCPF(String cpf){
		this.cpf = cpf;
	}
	public String getCPF(){
		return this.cpf;
	}

}