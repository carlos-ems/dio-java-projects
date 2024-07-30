package com.banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Carlos");
        Cliente cliente2 = new Cliente("Eduardo");

        Conta contaCorrente = new ContaCorrente(1, 1234, cliente1);
        Conta contaPoupanca = new ContaPoupanca(2, 5678, cliente2);

        Banco banco = new Banco("Banco X");
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(1000);
        contaCorrente.transferir(200, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        banco.listarContas();
    }
}
