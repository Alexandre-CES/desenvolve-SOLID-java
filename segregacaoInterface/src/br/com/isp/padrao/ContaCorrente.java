package br.com.isp.padrao;

public class ContaCorrente implements Conta{


    @Override
    public void abrirConta() {
        System.out.println("Conta Corrente aberta");
    }

    @Override
    public String exibirConta() {
        return "Corrente";
    }
}
