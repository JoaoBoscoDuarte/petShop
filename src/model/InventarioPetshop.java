package model;

import interfaces.ServicoPetshopIF;

import java.util.ArrayList;
import java.util.List;

public class InventarioPetshop {

    private List<ServicoPetshopIF> servicos;

    public InventarioPetshop(List<ServicoPetshopIF> servicos) {
        servicos = new ArrayList<>();
    }

    public void adicionaServico(ServicoPetshop servico) {
        servicos.add(servico);
    }

    public double calculaValorServico() {
        double calculo = 0;

        for (int i = 0; i < servicos.size(); i++) {
            calculo += servicos.get(i).calculaPreco();
        }

        return calculo;
    }

    public String listaServicos() {
        String exibir = "";

        for (int i = 0; i < servicos.size(); i++) {
            exibir += "Serviço " + i + " : " + servicos.get(i).descricao() + " | ";
        }

        return exibir;
    }
}
