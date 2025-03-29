package model.enums;

public enum TamanhoPelo {
    CURTO(0),
    MEDIO(15),
    LONGO(25);

    private double preco;

    TamanhoPelo(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
