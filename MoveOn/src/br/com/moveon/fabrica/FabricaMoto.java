package br.com.moveon.fabrica;

import br.com.moveon.veiculo.IVeiculo;
import br.com.moveon.veiculo.Moto;

public class FabricaMoto extends FabricaVeiculo {
    @Override
    public IVeiculo criarVeiculo() {
        return new Moto();
    }
}
