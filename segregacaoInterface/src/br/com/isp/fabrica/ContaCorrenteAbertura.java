package br.com.isp.fabrica;

import br.com.isp.padrao.Conta;
import br.com.isp.padrao.ContaCorrente;

public class ContaCorrenteAbertura extends AberturaConta{

    @Override
    public Conta criarConta() {
        return new ContaCorrente();
    }
}
