public class PessoaFisica{
	/*
	Ver o link: http://www.guj.com.br/38836-validar-atributo-de-classe-fila-em-construtor
	Para compreender a tentativa de validação no construtor. Nesse caso eu não utilizei uma exceção.
	**/
	private String nome;
	private String cpf;
	
	public PessoaFisica(String cpf){
		if(!(this.valida(cpf))){
			System.out.println("CPF inválido!");
			System.exit(0);
		}
		this.setCPF(cpf);
	}
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