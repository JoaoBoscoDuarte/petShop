package model;

import model.enums.TamanhoAnimal;
import model.enums.TamanhoPelo;

public class Hotel extends ServicoPetshop {

    private TamanhoPelo tamPelo;

    public Hotel(int codigo, TamanhoAnimal tamAnimal) {
        super(codigo, tamAnimal);
    }

    @Override
    public double calculaPreco() {
        return super.calculaPreco();
    }

    @Override
    public String descricao() {
        return "";
    }

    @Override
    public String Descricao() {
        return super.Descricao();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
