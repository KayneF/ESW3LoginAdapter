package model;

public class Token {

    private long token;

    public long getToken() {
        return token;
    }

    public void setToken(long token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Token{" +
                "token=" + token +
                '}';
    }
}
