package model;

public class DoisFatores {

    private int chaveConfirmacao;

    public int getChaveConfirmacao() {
        return chaveConfirmacao;
    }

    public void setChaveConfirmacao(int chaveConfirmacao) {
        this.chaveConfirmacao = chaveConfirmacao;
    }

    @Override
    public String toString() {
        return "DoisFatores{" +
                "chaveConfirmacao=" + chaveConfirmacao +
                '}';
    }
}
