package model.enums;

public enum TamanhoTosa {
    PEQUENO(30),
    MEDIO(40),
    GRANDE(50);

    private double preco;

    TamanhoTosa(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
