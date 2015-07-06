class Empresa{
	
	String nome;
	String cnpj;
	Funcionario[] empregados;
	int posicao = 0;

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