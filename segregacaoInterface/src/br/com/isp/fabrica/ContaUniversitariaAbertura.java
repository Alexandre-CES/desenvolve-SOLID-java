package br.com.isp.fabrica;

import br.com.isp.padrao.Conta;
import br.com.isp.padrao.ContaUniversitaria;

public class ContaUniversitariaAbertura extends AberturaConta{

    @Override
    public Conta criarConta() {
        return new ContaUniversitaria();
    }
}
