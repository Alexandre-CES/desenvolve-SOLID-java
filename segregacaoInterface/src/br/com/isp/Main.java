package br.com.isp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Corrente corrente = new Corrente();
        Poupanca poupanca = new Poupanca();

        System.out.println("Realizando operações na conta corrente");
        corrente.depositar(1000);
        corrente.sacar(200);
        corrente.calculaJuros();

        System.out.println("Realizando operações na conta Poupança");
        poupanca.depositar(1000);
        poupanca.sacar(200);
        poupanca.calculaJuros();

    }
}