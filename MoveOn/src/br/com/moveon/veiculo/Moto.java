package br.com.moveon.veiculo;

public class Moto implements IVeiculo {
    @Override
    public void exibirTipo() {
        System.out.println("Transporte escolhido: Moto");
    }

    @Override
    public void iniciaRota() {
        System.out.println("Carga recolhida. Em rota de entrega");
    }
}
