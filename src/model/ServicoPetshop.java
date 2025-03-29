package model;

import interfaces.ServicoPetshopIF;
import model.enums.TamanhoAnimal;
import java.time.LocalDate;
import java.util.Objects;

public abstract class ServicoPetshop implements ServicoPetshopIF {

    private LocalDate data;
    private int codigo;
    TamanhoAnimal tamAnimal;

    public ServicoPetshop(int codigo, TamanhoAnimal tamAnimal) {
        this.codigo = codigo;
        this.tamAnimal = tamAnimal;
    }

    public double calculaPreco() {
        System.out.println("Calcular preco");
        return 0;
    }

    public String Descricao() {
        return "Descrição";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ServicoPetshop that = (ServicoPetshop) o;
        return codigo == that.codigo && Objects.equals(data, that.data) && Objects.equals(tamAnimal, that.tamAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, codigo, tamAnimal);
    }

    @Override
    public String toString() {
        return "ServicoPetshop{" +
                "data=" + data +
                ", codigo=" + codigo +
                ", tamAnimal=" + tamAnimal +
                '}';
    }
}
