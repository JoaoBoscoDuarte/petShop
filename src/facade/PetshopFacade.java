package facade;

import model.services.Banho;
import model.services.Hotel;
import model.RelatorioPetshop;
import model.InventarioPetshop;
import model.services.Tosa;
import model.enums.TamanhoAnimal;
import model.enums.TamanhoPelo;

public class PetshopFacade {
    private InventarioPetshop inventario;
    private RelatorioPetshop relatorioPetshop;

    public PetshopFacade() {
        this.inventario = new InventarioPetshop();
    }

    public void adicionaBanho(int codigo, TamanhoAnimal tamAnimal, TamanhoPelo tamPelo) {
        Banho banho = new Banho(codigo, tamAnimal, tamPelo);
        inventario.adicionaServico(banho);
    }

    public void adicionaHotel(int codigo, TamanhoAnimal tamAnimal, int qtdHoras) {
        Hotel hotel = new Hotel(codigo, tamAnimal, qtdHoras);
        inventario.adicionaServico(hotel);
    }

    public void adicionaTosa(int codigo, TamanhoAnimal tamAnimal) {
        Tosa tosa = new Tosa(codigo, tamAnimal);
        inventario.adicionaServico(tosa);
    }

    public double calculaServico() {
        return inventario.calculaValorServico();
    }

    public String listarServico() {
        return inventario.listaServicos();
    }

    public String gerarRelatorioString() {
        return gerarRelatorioString();
    }

    public void gerarRelatorioArquivoTxt() {
        relatorioPetshop.gerarRelatorioArquivoTxt();
    }

    public void lerRelatorioArquivoTxt() {
        relatorioPetshop.lerRelatorioArquivoTxt();
    }
}
