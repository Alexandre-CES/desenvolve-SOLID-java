package br.com.isp.padrao;

public class ContaUniversitaria implements Conta{

    @Override
    public void abrirConta() {
        System.out.println("Conta universitaria aberta");
    }

    @Override
    public String exibirConta() {
        return "Universitaria";
    }
}
