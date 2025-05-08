package dia2.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Frota {

    private List<Veiculo> listaFrota;
    private List<Motorista> listaMotorista;

    public Frota() {
        listaFrota = new ArrayList<>();
        listaMotorista = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
    listaFrota.add(veiculo);
        System.out.println("Adicionando veículo: " + veiculo.marca + " "+ veiculo.modelo);
    }

    public void adicionarMotorista(Motorista motorista) {
        listaMotorista.add(motorista);
        System.out.println("Adicionando motorista: " + motorista.getNome() +" com CNH: "+ motorista.getCnh() );
    }


    public void mostrarTodosVeiculos() {
        if (listaFrota.isEmpty()) {
            System.out.println("Não há veículos nem motoristas na frota.");
            return;
        }
        System.out.println("=== Veículos na Frota ===");

        for (Veiculo veiculo : listaFrota) {
            veiculo.exibir_Iformacoes();
            System.out.println("---------------------");
        }

        System.out.println("=== Motoristas na Frota ====");

        for (Motorista motorista: listaMotorista){
            motorista.exibirMotorista();
            System.out.println("--------------------");
        }
        System.out.println(" FIM ");

    }

//
//    public void listarMotorista(Veiculo veiculoss, Motoristas motoristass) {
//        listafrotas.add(veiculoss,motoristass);
//
//        System.out.println("Adicionado a lista da frota" + veiculoss +" e quem o dirige é o "+ getNome_Motorista());
//
//    }

}
