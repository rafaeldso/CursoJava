class TestaCasa{
	
	public static void main(String [] args){
		
		Casa casa = new Casa();
		casa.pinta("Azul");
		casa.portas = new Porta[5];
		Porta p1 = new Porta();
		casa.adicionaPortas(p1);
		Porta p2 = new Porta();
		casa.adicionaPortas(p2);
		
		casa.portas[0].abre();
		casa.portas[1].fecha();
		casa.portas[1].abre();
		
		System.out.println(casa.quantasPortasEstaoAbertas());
		
	}

}