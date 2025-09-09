import br.com.moveon.fabrica.FabricaCarro;
import br.com.moveon.fabrica.FabricaDrone;
import br.com.moveon.fabrica.FabricaMoto;
import br.com.moveon.fabrica.FabricaVeiculo;
import br.com.moveon.veiculo.IVeiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FabricaVeiculo fabricaCarro = new FabricaCarro();
        IVeiculo carro = fabricaCarro.criarVeiculo();
        carro.exibirTipo();
        carro.iniciaRota();

        FabricaVeiculo fabricaMoto = new FabricaMoto();
        IVeiculo moto = fabricaMoto.criarVeiculo();
        moto.exibirTipo();
        moto.iniciaRota();

        FabricaVeiculo fabricaDrone = new FabricaDrone();
        IVeiculo drone = fabricaDrone.criarVeiculo();

        drone.exibirTipo();
        drone.iniciaRota();
    }
}