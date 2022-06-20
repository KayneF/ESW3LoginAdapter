package model;

public class LoginBuilder {

    private Login login;
    private DoisFatores chaveConfirmacao;
    private Token token;

    public LoginBuilder() {
        this.login = new Login();
        this.token = new Token();
        this.chaveConfirmacao = new DoisFatores();
    }

    public static LoginBuilder builder() {
        return new LoginBuilder();
    }

    public LoginBuilder addLogin(String usuario, String senha) {
        this.login.setUsuario(usuario);
        this.login.setSenha(senha);
        return this;
    }

    public LoginBuilder addDoisFatores(int chave) {
        this.chaveConfirmacao.setChaveConfirmacao(chave);
        return this;
    }

    public LoginBuilder addToken(long token) {
        this.token.setToken(token);
        return this;
    }

    public Login get() {
        this.login.setUsuario(login.getUsuario());
        this.login.setSenha(login.getSenha());
        this.login.setChaveConfirmacao(chaveConfirmacao);
        this.login.setToken(token);
        return login;
    }
}
