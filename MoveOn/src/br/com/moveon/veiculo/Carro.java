package br.com.moveon.veiculo;

public class Carro implements IVeiculo{
    @Override
    public void exibirTipo() {
        System.out.println("Transporte escolhido: Carro");
    }

    @Override
    public void iniciaRota() {
        System.out.println("Passageiros embarcados. Iniciando deslocamento");
    }
}
