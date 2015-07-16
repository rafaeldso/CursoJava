public class PessoaFisica{
	/*
	Ver o link: http://www.guj.com.br/38836-validar-atributo-de-classe-fila-em-construtor
	Para compreender a tentativa de valida��o no construtor. Nesse caso eu n�o utilizei uma exce��o.
	**/
	private String nome;
	private String cpf;
	
	public PessoaFisica(String cpf){
		if(!(this.valida(cpf))){
			System.out.println("CPF inv�lido!");
			System.exit(0);
		}
		this.setCPF(cpf);
	}
	boolean valida(String cpf){
		//L�gica para validar CPF
		return true;
	}
	public void setCPF(String cpf){
		this.cpf = cpf;
	}
	public String getCPF(){
		return this.cpf;
	}

}