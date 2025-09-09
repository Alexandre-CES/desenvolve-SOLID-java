package br.com.moveon.fabrica;

import br.com.moveon.veiculo.Drone;
import br.com.moveon.veiculo.IVeiculo;

public class FabricaDrone extends  FabricaVeiculo{

    @Override
    public IVeiculo criarVeiculo() {
        return new Drone();
    }
}
