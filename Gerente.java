class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	
	public boolean autentica(int senha){
		// verifica aqui se a senha confere com a recebida como um parâmetro
		// no caso do gerente verifica também se o departamento dele
		// tem acesso
		if(this.senha != senha){
			return false;
		}
		return true;
		
	}
}