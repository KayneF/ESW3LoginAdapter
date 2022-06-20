package model;

public class Smartphone {

    private boolean smartphone;

    public boolean isSmartphone() {
        return smartphone;
    }

    public void setSmartphone(boolean smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String toString() {
        return "Boogle{" +
                "smartphone=" + smartphone +
                '}';
    }
}
