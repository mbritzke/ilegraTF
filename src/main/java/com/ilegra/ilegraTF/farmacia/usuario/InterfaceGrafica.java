package com.ilegra.ilegraTF.farmacia.usuario;

import com.ilegra.ilegraTF.farmacia.pojo.Cliente;
import com.ilegra.ilegraTF.farmacia.pojo.Medicamento;
import com.ilegra.ilegraTF.farmacia.pojo.MedicamentoQuimio;
import com.ilegra.ilegraTF.farmacia.util.CPF;
import com.ilegra.ilegraTF.farmacia.util.Cadastro;
import com.ilegra.ilegraTF.farmacia.util.Venda;

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
                "(4) Venda\n" +
                "(5) Sair\n");
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
                String statusVenda = interacaoVenda();
                break;
            case 4:
                //TODO
                break;
        }
        teclado.close();
    }

    private String interacaoCadastraUsuario(){
        System.out.println("1 - CADASTRAR CLIENTE: \n" +
                "Digite um nome:");
        String nome = teclado.next();
        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        System.out.println("Digite o CPF: ");
        String cpf = teclado.next();
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
                "(1) - Fitoterapico\n" +
                "(2) - Quimioterapico\n");
        int tipoMedicamento = teclado.nextInt();
        String fitoreatpico = "FITOTERAPICO";
        String quimioterapico = "QUIMIOTERAPICO";
        if(tipoMedicamento == 1)
            System.out.println("MEDICAMENTO " + fitoreatpico + "\n "+ "Digite o nome: ");
        else
            System.out.println("MEDICAMENTO: " + quimioterapico + "\n "+ "Digite o nome: ");
        String nome = teclado.next();
        System.out.println("Digite o fabricante: ");
        String fabricante = teclado.next();
        System.out.println("Digite o composto principal: ");
        String compostoPrincipal = teclado.next();
        System.out.println("Digite o preço: ");
        double preco = teclado.nextDouble();
        System.out.println("Medicamento precisa de descrição? \n" +
                "(1) - SIM\n" +
                "(2) - NÃO");
        int escolha = teclado.nextInt();
        String descricao = null;
        if(escolha == 1){
            System.out.println("Digite a descriçao: ");
            descricao = teclado.next();
        }
        boolean status = false;
        if(tipoMedicamento == 1){
            if(descricao.isEmpty()){
                Medicamento novoMedicamento = new Medicamento(nome, fabricante, compostoPrincipal, preco);
                status = cadastro.cadastraMedicamento(novoMedicamento);
            }else{
                Medicamento novoMedicamento = new Medicamento(nome, fabricante, compostoPrincipal, descricao ,preco);
                status = cadastro.cadastraMedicamento(novoMedicamento);
            }
        }
        else{
            boolean receita = false;
            System.out.println("Medicamento precisa de receita? "+
                    "(1) - SIM\n" +
                    "(2) - NÃO");
            int resposta = teclado.nextInt();
            if(resposta == 1){
                receita = true;
            }
            if(descricao.isEmpty()){
                Medicamento novoMedicamento = new MedicamentoQuimio(nome, fabricante, compostoPrincipal, receita, preco);
                status = cadastro.cadastraMedicamento(novoMedicamento);
            }else{
                Medicamento novoMedicamento = new MedicamentoQuimio(nome, fabricante, compostoPrincipal, descricao,receita, preco);
                status = cadastro.cadastraMedicamento(novoMedicamento);
            }
        }
        if(status == false)
            return "MEDICAMENTO JÁ CADASTRADO";
        return "MEDICAMENTO CADASTRADO";
    }

    private String interacaoVenda() {
        System.out.println("Digite o CPF do cliente: ");
        String cpf = teclado.next();
        CPF auxiliar = new CPF(cpf);
        String cpfLimpo = auxiliar.limpaCPF(cpf);
        Cliente comprador = cadastro.pesquisaRetornaCliente(new CPF(cpfLimpo));
        if(comprador.getNome() == null)
            return "CLIENTE NÃO CADASTRADO";
        Venda novaVenda = new Venda();
        boolean terminou == false;
        while(!terminou){
            System.out.println("Digite o medicamento: ");
            String medicamento = teclado.next();
            Medicamento produto = cadastro.pesquisaRetornaMedicamento(medicamento);
            if(produto.getNome() != null)
                novaVenda.listaCompras(produto);
            if(produto.getNome() == null)
                break;
            System.out.println("Deseja adicionar mais um produto?\n" +
                    "(1) - Sim\n" +
                    "(2) - Não\n");
           int escolha = teclado.nextInt();
           if(escolha == 1)
               terminou = true;
        }
        double total = novaVenda.calculaVenda();
        System.out.println("Total de produtos: " + total);
        //implementar os descontos de idoso
        if(comprador.getPontos() >= total){
            System.out.println("Cliente pode pagar com os pontos ");
        }
        //implementar as modificacoes nos pontos do cliente;
    }

    public static void main(String args[]){
        InterfaceGrafica i = new InterfaceGrafica();
        i.interacao();
    }
}

