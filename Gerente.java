class Gerente extends Funcionario implements Autenticavel{
	
	private int senha;
	
	public boolean autentica(int senha){
		// verifica aqui se a senha confere com a recebida como um par�metro
		// no caso do gerente verifica tamb�m se o departamento dele
		// tem acesso
		if(this.senha != senha){
			return false;
		}
		return true;
		
	}
}