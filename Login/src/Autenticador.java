
public class Autenticador {
	
	public Usuario logar(String login, String senha) throws LoginException{
		if(login.equals("matheus") && senha.equals("senhadomth")) {
			return new Usuario(login);
		};
		throw new LoginException("O usuario e a senha não batem!", login);
	};

}
