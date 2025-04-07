package main;

import facade.PetshopFacade;
import model.enums.TamanhoAnimal;
import model.enums.TamanhoPelo;
import java.util.Scanner;

public class Main {

    private Scanner sc;
    private PetshopFacade fachada;

    public Main() {
        this.sc = new Scanner(System.in);
        this.fachada = new PetshopFacade();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.executar();
    }

    public void executar() {
        int escolha = menu();

        switch (escolha) {
            case 1:
                cadastrarServico();
                break;

            case 2:
                calcularServico();
                break;

            case 3:
                listarServico();
                break;

            case 4:
                gerarRelatorio();
                break;

            case 5:
                return;
        }
    }

    public int menu() {
        final String MENU = """
                Seja bem vindo ao Super Mega Petshop Legal!
                Escolha uma das opções a seguir para prosseguir:\s
                [1] Cadastrar serviço\s
                [2] Calcular serviço\s
                [3] Listar serviços\s
                [4] Gerar relatório de serviços\s
                [0] Sair\s
                """;

        System.out.println(MENU);
        return sc.nextInt();
    }

    public void cadastrarServico() {
        final String SERVICOS = """
                Serviços do petshop:\s
                [1] Banho\s
                [2] Hotel\s
                [3] Tosa\s
                [4] Voltar\s
                """;

        boolean continuar = true;
        while (continuar) {
            System.out.println(SERVICOS);
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    cadastrarBanho();
                    break;

                case 2:
                    cadastrarHotel();
                    break;

                case 3:
                    cadastrarTosa();
                    break;

                case 4:
                    System.out.println("Voltar");
                    continuar = false;
                    break;
            }
        }

    }

    public void cadastrarBanho() {
        TamanhoAnimal tamanhoAnimal;
        TamanhoPelo tamanhoPelo;
        int codigo;

        System.out.println("Banho selecionado. Insira as informações: \n");

        codigo = pegarCodigoAnimal();
        tamanhoAnimal = pegarTamanhoAnimal();
        tamanhoPelo = pegarTamanhoPelo();

        fachada.adicionaBanho(codigo, tamanhoAnimal, tamanhoPelo);
        System.out.println("Banho cadastrado com sucesso!");
    }

    public void cadastrarHotel() {
        TamanhoAnimal tamanhoAnimal;
        int qtdHoras;
        int codigo;

        System.out.println("Hotelzinho selecionado. Insira as informações: \n");

        codigo = pegarCodigoAnimal();
        tamanhoAnimal = pegarTamanhoAnimal();
        qtdHoras = pegarQtdHoras();

        fachada.adicionaHotel(codigo, tamanhoAnimal, qtdHoras);
        System.out.println("Hotelzinho cadastrado com sucesso!");
    }

    public void cadastrarTosa() {
        TamanhoAnimal tamanhoAnimal;
        int codigo;

        System.out.println("Tosa selecionado. Insira as informações: \n");

        codigo = pegarCodigoAnimal();
        tamanhoAnimal = pegarTamanhoAnimal();

        fachada.adicionaTosa(codigo, tamanhoAnimal);
        System.out.println("Tosa cadastrada com sucesso!");
    }

    public void calcularServico() {
        System.out.println("Serviço calculado com sucesso: ");
        System.out.println(fachada.calculaServico());
    }

    public void listarServico() {
        System.out.println("Serviços: ");
        System.out.println(fachada.listarServico());
    }

    public void gerarRelatorio() {
        final String MENU_RELATORIO = """
                Gere relatório:
                [1] Gerar relatorio .txt\s
                [2] Gerar relatorio em tala\s
                [0] Sair""";

        System.out.println(MENU_RELATORIO);
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                fachada.gerarRelatorioArquivoTxt();

            case 2:
                fachada.gerarRelatorioString();
        }
    }

    public int pegarCodigoAnimal() {
        int codigo = 0;

        try {
            System.out.println("Código do animal: ");
            codigo = sc.nextInt();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return codigo;
    }

    public int pegarQtdHoras() {
        boolean repetir = true;
        int qtdHoras = 0;

        while (repetir) {
            try {
                System.out.println("Insira a quatidade de horas que o animal vai passar no hotelzinho: ");
                qtdHoras = sc.nextInt();
                repetir = false;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return qtdHoras;
    }

    public TamanhoAnimal pegarTamanhoAnimal() {
        sc.nextLine();
        TamanhoAnimal tamanhoAnimal = null;
        boolean repetir = true;

        while (repetir) {
            try {
                System.out.println("Tamanho do animal: (GRANDE/MEDIO/PEQUENO");
                String tamanho = sc.nextLine().toUpperCase();

                if (isValidAnimal(tamanho)) {
                    tamanhoAnimal = TamanhoAnimal.valueOf(tamanho);
                    repetir = false;

                } else {
                    System.out.println("Tamanho inválido, tente novamente");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return tamanhoAnimal;
    }

    public TamanhoPelo pegarTamanhoPelo() {
        boolean repetir = true;
        TamanhoPelo tamanhoPelo = null;

        while (repetir) {
            try {
                System.out.println("Tamanho do pelo do animal: (LONGO/MEDIO/CURTO)");
                String tamanho = sc.nextLine().toUpperCase();

                if (isValidPelo(tamanho)) {
                    tamanhoPelo = TamanhoPelo.valueOf(tamanho);
                    repetir = false;

                } else {
                    System.out.println("Tamanho do pelo inválido! Tente novamente.");
                }

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return tamanhoPelo;
    }

    public boolean isValidAnimal(String tamanho) {
        try {
            TamanhoAnimal.valueOf(tamanho);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public boolean isValidPelo(String tamanho) {
        try {
            TamanhoPelo.valueOf(tamanho);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}