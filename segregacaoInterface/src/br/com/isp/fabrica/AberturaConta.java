package br.com.isp.fabrica;

import br.com.isp.padrao.Conta;

public abstract class AberturaConta {
    public void iniciaAbertura(){
        Conta conta = criarConta();
        conta.abrirConta();
        System.out.println("Tipo da conta: "+ conta.exibirConta());
    }

    public abstract Conta criarConta();
}
