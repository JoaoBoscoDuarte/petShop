package model;

import model.enums.TamanhoAnimal;

public class Tosa extends ServicoPetshop {

    public Tosa(int codigo, TamanhoAnimal tamAnimal) {
        super(codigo, tamAnimal);
    }

    @Override
    public double calculaPreco() {
        return super.calculaPreco();
    }

    @Override
    public String descricao() {
        return super.descricao();
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