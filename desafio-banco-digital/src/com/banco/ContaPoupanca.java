package com.banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero, Cliente cliente) {
        super(agencia, numero, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("------ Extrato Conta Poupança ------");
        System.out.println("Agência: " + getAgencia() + ", Número: " + getNumero() + ", Saldo: " + getSaldo());
    }
}