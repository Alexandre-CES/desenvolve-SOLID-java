package br.com.moveon.fabrica;

import br.com.moveon.veiculo.Carro;
import br.com.moveon.veiculo.IVeiculo;

public class FabricaCarro extends FabricaVeiculo {

    @Override
    public IVeiculo criarVeiculo() {
        return new Carro();
    }
}
