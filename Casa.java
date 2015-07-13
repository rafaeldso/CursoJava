class Casa{
	String cor;
	//Porta porta1;
	//Porta porta2;
	//Porta porta3;
	Porta portas[];
	static int totalDePortas = 0;
	
	
	void pinta(String cor){
		this.cor = cor;
	}
	int quantasPortasEstaoAbertas(){
		int total = 0;
		for(int i = 0; i <= totalDePortas; i++)
			if(this.portas[i].estaAberta()){
			total++;
			}
		}
		
		return total;
	}
	
	void adicionaPortas(Porta p){
		this.portas[totalDePortas] = p;
		totalDePortas++;
	}
	
	int totalDePortas(){
		return totalDePortas
	}
	
	

}