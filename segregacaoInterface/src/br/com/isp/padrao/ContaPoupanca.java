package br.com.isp.padrao;

public class ContaPoupanca implements Conta, CalculaJuros {

    @Override
    public void calculaJuros() {

    }

    @Override
    public void abrirConta() {

    }

    @Override
    public String exibirConta() {
        return "Poupanca";
    }
}
