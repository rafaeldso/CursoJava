class Casa{
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;
	
	void pinta(String cor){
		this.cor = cor;
	}
	int quantasPortasEstaoAbertas(){
		int total = 0;
		if(this.porta1.estaAberta()){
			total++;
		}
		if(this.porta2.estaAberta()){
			total++;
		}
		if(this.porta3.estaAberta()){
			total++;
		}
		return total;
	}

}