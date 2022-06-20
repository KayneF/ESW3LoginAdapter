package controller;

import model.Login;

public class LoginDoisFatoresAdapter implements IAutenticacao {

    LoginDoisFatores doisFatores;

    public LoginDoisFatoresAdapter(LoginDoisFatores doisFatores) {
        this.doisFatores = doisFatores;
    }

    @Override
    public void autenticacao(Login login) {
        doisFatores.fazerLogin(login.getUsuario(), login.getSenha());
        doisFatores.confirmaSegundaEtapa(login.getChaveConfirmacao().getChaveConfirmacao());
    }
}
