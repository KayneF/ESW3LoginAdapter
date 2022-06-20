package controller;

public class LoginBoogle {

    public void fazerLogin(String usuario, String senha) {
        System.out.println("Login: " + usuario);
        System.out.println("Senha: " + senha);
    }

    public void smartphone(boolean phone) {
        if(phone) {
            System.out.println("A chave de autenticação foi enviada via SMS.");
        } else {
            System.out.println("A chave de autenticação foi enviada por email.");
        }
    }

    public void confirmaSegundaEtapa(int chaveConfirmacao) {
        System.out.println("\nChave de autenticação: " + chaveConfirmacao);
        System.out.println("Usuário logado com sucesso.");
    }
}
