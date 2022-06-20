package controller;

public class LoginDoisFatores {

    public void fazerLogin(String usuario, String senha) {
        System.out.println("Login: " + usuario);
        System.out.println("Senha: " + senha);
        System.out.println("A chave de autenticação foi enviada.");
    }

    public void confirmaSegundaEtapa(int chaveConfirmacao) {
        System.out.println("\nChave de autenticação: " + chaveConfirmacao);
        System.out.println("Usuário logado com sucesso.");
    }
}
