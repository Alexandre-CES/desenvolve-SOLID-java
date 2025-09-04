package br.com.isp;

public class Corrente implements Conta {

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando um valor de " + valor);
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Saque de " + valor);
    }

    @Override
    public void transferir(double valor, Conta destino) {
    System.out.println("Transferir um valor de " + valor);
    }

    @Override
    public void calculaJuros() {
        System.out.println("Não há cálculo de juros na conta corrente");
    }
}
