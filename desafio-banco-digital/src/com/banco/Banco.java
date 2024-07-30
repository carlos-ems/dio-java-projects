package com.banco;

import java.util.List;
import java.util.ArrayList;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Cliente: " + conta.getCliente().getNome() + ", Agência: " + conta.getAgencia() + ", Número: " + conta.getNumero() + ", Saldo: " + conta.getSaldo());
        }
    }
}