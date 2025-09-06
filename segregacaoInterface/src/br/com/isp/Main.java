package br.com.isp;

import br.com.isp.fabrica.AberturaConta;
import br.com.isp.fabrica.ContaCorrenteAbertura;
import br.com.isp.fabrica.ContaPoupancaAbertura;
import br.com.isp.fabrica.ContaUniversitariaAbertura;
import br.com.isp.padrao.ContaCorrente;
import br.com.isp.padrao.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AberturaConta cc = new ContaCorrenteAbertura();
        cc.iniciaAbertura();

        AberturaConta cp = new ContaPoupancaAbertura();
        cp.iniciaAbertura();

        AberturaConta cu = new ContaUniversitariaAbertura();
        cu.iniciaAbertura();

    }
}