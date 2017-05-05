package com.ilegra.ilegraTF.farmacia.util;

import com.ilegra.ilegraTF.farmacia.Cliente;
import com.ilegra.ilegraTF.farmacia.Medicamento;

import java.util.Scanner;

public class InterfaceGrafica {

    Cadastro cadastro;
    Scanner teclado;

    public InterfaceGrafica(){
        cadastro  = new Cadastro();
        teclado = new Scanner(System.in);
    }

    public void interacao(){
        System.out.println("==== FARMACIA ==== \n" +
                " - Escolha uma abaixo:\n" +
                "(1) Cadastrar usuário\n" +
                "(2) Cadastrar medicamento\n" +
                "(3) Relatórios\n" +
                "(4) Venda");
        int escolha = teclado.nextInt();
        switch (escolha){
            case 1:
                String situacaoCliente = interacaoCadastraUsuario();
                System.out.println(situacaoCliente);
                break;
            case 2:
                String statusMedicamento = interacaoMedicamento();
                System.out.println(statusMedicamento);
                break;
            case 3:
                //TODO
                break;
            case 4:
                //TODO
                break;
        }
        teclado.close();
    }

    private String interacaoCadastraUsuario(){
        System.out.println("1 - CADASTRAR CLIENTE: \n" +
                "Digite um nome: \n");
        String nome = teclado.nextLine();
        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        System.out.println("Digite o CPF: ");
        String cpf = teclado.nextLine();
        CPF cpfNovoCliente = new CPF(cpf);
        Cliente novoCliente = new Cliente(nome, idade, cpfNovoCliente);
        boolean statusCLiente = cadastro.cadastroCliente(novoCliente);
        if(statusCLiente)
            return"CLIENTE CADASTRADO!";
        return "Cliente já está cadastrado.";
    }

    private String interacaoMedicamento(){
        System.out.println("2 - CADASTRAR UM NOVO MEDICAMENTO: \n" +
                "Selecione o tipo:\n" +
                "(A) - Quimioterapico\n" +
                "(B) - Fitoterapiocp\n");
        int tipoMedicamento = teclado.nextInt();
        if(tipoMedicamento == 'A' || tipoMedicamento == 'a')
            return medicamento(tipoMedicamento);
        if(tipoMedicamento == 'B' || tipoMedicamento == 'b')
            return medicamento(tipoMedicamento);
        return "Erro";
    }

    private String medicamento(int tipo) {
        System.out.println("MEDICAMENTO: \n" +
                "Digite o nome: \n");
        String nome = teclado.nextLine();
        System.out.println("Digite o fabricante: ");
        String fabricante = teclado.nextLine();
        System.out.println("Digite o composto principal: ");
        String compostoPrincipal = teclado.nextLine();
        System.out.println("Digite o preço: ");
        double preco = teclado.nextDouble();
        if(tipo == 1)
            return medicamentoFito(nome, fabricante, compostoPrincipal, preco);
        return medicamentoQuimio(nome, fabricante, compostoPrincipal, preco);
    }

    private String medicamentoFito(String nome, String fabricante, String compostoPrincipal, double preco) {
        String descricao = descricaoMedicamento();
        boolean statusMedicamento;
        if(descricao.equalsIgnoreCase("vazio")){
            Medicamento novoMedicamento = new Medicamento(nome, fabricante, compostoPrincipal, preco);
            statusMedicamento = cadastro.cadastraMedicamento(novoMedicamento);
        }
        else{
            Medicamento novoMedicamento = new Medicamento(nome, fabricante, compostoPrincipal, descricao, preco);
            statusMedicamento = cadastro.cadastraMedicamento(novoMedicamento);
        }
        if(statusMedicamento == true)
            return "MEDICAMENTO FITOTERAPICO JÁ CADASTRADO";
        return "MEDICAMENTO FITOTERAPICO CADASTRADO";
    }

    private String medicamentoQuimio(String nome, String fabricante, String compostoPrincipal, double preco) {
        //TODO
        return null;
    }

    private String descricaoMedicamento() {
        String descricao;
        System.out.println("Medicamento necessita de uma descrição?\n" +
                "(1) - SIM\n" +
                "(2) - NÃO");
        int escolha = teclado.nextInt();
        if(escolha == 1){
            System.out.println("Digite a descrição: ");
            descricao = teclado.nextLine();
        }
        else
            descricao = "vazio";
        return descricao;
    }
}

