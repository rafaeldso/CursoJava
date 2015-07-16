public class FabricaDeCarros{
	
	private static FabricaDeCarros fabrica = null;
	
	private FabricaDeCarros(){
		
	}
	
	public static FabricaDeCarros getFabricaDeCarros(){
		
		if(fabrica == null){
			fabrica = new FabricaDeCarros();
		}
		return fabrica;
	}
}