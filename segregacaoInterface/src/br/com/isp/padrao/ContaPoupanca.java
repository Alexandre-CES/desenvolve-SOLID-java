package br.com.isp.padrao;

public class ContaPoupanca implements Conta, CalculaJuros {

    @Override
    public void calculaJuros() {

    }

    @Override
    public void abrirConta() {
        System.out.println("Conta Poupança aberta");
    }

    @Override
    public String exibirConta() {
        return "Poupanca";
    }
}
