package br.com.isp.fabrica;

import br.com.isp.padrao.Conta;
import br.com.isp.padrao.ContaPoupanca;

public class ContaPoupancaAbertura extends AberturaConta{
    @Override
    public Conta criarConta() {
        return new ContaPoupanca();
    }
}
