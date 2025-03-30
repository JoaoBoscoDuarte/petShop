package model.enums;

public enum TempoHotel {
    PEQUENO(12),
    MEDIO(18),
    GRANDE(25);

    private final double preco;

    TempoHotel(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
