package model;

public class Login {

    private String usuario;
    private String senha;
    private DoisFatores chaveConfirmacao;
    private Token token;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public DoisFatores getChaveConfirmacao() {
        return chaveConfirmacao;
    }

    public void setChaveConfirmacao(DoisFatores chaveConfirmacao) {
        this.chaveConfirmacao = chaveConfirmacao;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Login{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", chaveConfirmacao=" + chaveConfirmacao +
                ", token=" + token +
                '}';
    }
}
