class TestaCasa{
	
	public static void main(String [] args){
		
		Casa casa = new Casa();
		casa.pinta("Azul");
		casa.porta1 = new Porta();
		casa.porta2 = new Porta();
		casa.porta3 = new Porta();
		
		casa.porta1.abre();
		casa.porta2.fecha();
		casa.porta3.abre();
		
		System.out.println(casa.quantasPortasEstaoAbertas());
		
	}

}