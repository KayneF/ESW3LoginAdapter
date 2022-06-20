package controller;

import model.Login;

public class LoginTokenAdapter implements IAutenticacao {

    LoginToken token;

    public LoginTokenAdapter(LoginToken token) {
        this.token = token;
    }

    @Override
    public void autenticacao(Login login) {
        token.enviarToken(login.getToken().getToken());
    }
}
