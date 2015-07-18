public class Diretor extends Funcionario implements Autenticavel{
	
	private int senha;
	
	public boolean autentica(int senha){
		// verifica aqui se a senha confere com a recebida como parâmetro
		if(this.senha != senha){
			return false;
		}
		return true;
		
		
	}
}