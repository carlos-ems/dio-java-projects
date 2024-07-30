package com.banco;

public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero, Cliente cliente) {
        super(agencia, numero, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("------ Extrato Conta Corrente ------");
        System.out.println("Agência: " + getAgencia() + ", Número: " + getNumero() + ", Saldo: " + getSaldo());
    }
}