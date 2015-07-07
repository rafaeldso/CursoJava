class TestaPorta{
	public static void main(String [] args){
		Porta porta = new Porta();
		porta.abre();
		porta.fecha();
		porta.abre();
		porta.pinta("Azul");
		porta.pinta("Amarelo");
		porta.pinta("Verde");
		porta.dimensaoX = 15;
		porta.dimensaoY = 10;
		porta.dimensaoZ = 3;
		
		System.out.println("A porta está aberta? "+porta.estaAberta());
		
	}
}