class Empresa{
	
	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private int posicao = 0;
	
	public Empresa(int tamanho){
		empregados = new Funcionario[tamanho];
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setCNPJ(String cnpj){
		this.cnpj = cnpj;
	}
	public String getCNPJ(){
		return this.cnpj;
	}
	public Funcionario getFuncionario(int posicao){
		return this.empregados[posicao];
	}
	void adiciona(Funcionario f){

		this.empregados[posicao++] = f;

	}

	void mostraEmpregados(){

/*
		for( Funcionario f : this.empregados) {

			if(f != null){
				f.mostra();
			}

		}
*/		
		for(int i = 0; i < this.posicao; i++){

			this.empregados[i].mostra();
		}

	}

	boolean contem(Funcionario f){

		for(int i = 0; i < this.posicao; i++){
			if(this.empregados[i] == f){
				System.out.println("Posiçao: "+i);
				return true;
				//System.out.println("Posiçao: "+i);
			}

		}
		return false;
	}
}