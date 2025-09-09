package br.com.moveon.veiculo;

public class Drone implements IVeiculo, IVeiculoVoador {
    @Override
    public void exibirTipo() {
        System.out.println("Veículo escolhido: Drone");
    }

    @Override
    public void iniciaRota() {
        System.out.println("Drone em rota de entrega");
    }

    @Override
    public void voar() {
        System.out.println("Drone voando a 50km/h...");
    }
}
