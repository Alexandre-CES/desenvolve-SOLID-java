package br.com.isp;

public class Poupanca implements Conta, CalculaJuros {
    @Override
    public void depositar(double valor) {
        System.out.println("Depositando um poupanca");
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Sacando um poupanca");
    }

    @Override
    public void transferir(double valor, Conta destino) {
        System.out.println("Transferrando um poupanca");
    }

    @Override
    public void calculaJuros() {
        System.out.println("calculando juros");
    }
}
