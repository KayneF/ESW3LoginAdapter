package view;

import controller.*;
import model.Login;
import model.LoginBuilder;

public class Principal {

    public static void main(String[] args) {

        IAutenticacao autenticacao;

        Login login = LoginBuilder.builder()
                .addLogin("usuarioTeste", "123456")
                .addDoisFatores(375582)
                .addToken(651875432)
                .addPhone(true)
                .get();

        LoginDoisFatores ldf = new LoginDoisFatores();
        LoginToken lt = new LoginToken();
        LoginBoogle lb = new LoginBoogle();

//        autenticacao = new LoginDoisFatoresAdapter(ldf);

//        autenticacao = new LoginTokenAdapter(lt);

        autenticacao = new LoginBoogleAdapter(lb);

        autenticacao.autenticacao(login);

    }
}
