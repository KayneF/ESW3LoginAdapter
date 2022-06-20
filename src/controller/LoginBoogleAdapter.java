package controller;

import model.Login;

public class LoginBoogleAdapter implements IAutenticacao {

    LoginBoogle loginBoogle;

    public LoginBoogleAdapter(LoginBoogle login) {
        this.loginBoogle = login;
    }

    @Override
    public void autenticacao(Login login) {
        loginBoogle.fazerLogin(login.getUsuario(), login.getSenha());
    }
}
