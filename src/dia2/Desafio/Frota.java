package dia2.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Frota {

    List<Veiculo> listafrotas = new ArrayList<Veiculo>();

    public Frota() {}

    public void adicionarVeiculo(Veiculo veiculo) {
        System.out.println("Adicionando veículo: " + veiculo);
    }

    public void adicionarMotorista(Motorista motorista) {
        System.out.println("Adicionando motorista: " + motorista);
    }

    public void listarfrota() {
        System.out.println("Listando veículo");
    }

//
//    public void listarMotorista(Veiculo veiculoss, Motoristas motoristass) {
//        listafrotas.add(veiculoss,motoristass);
//
//        System.out.println("Adicionado a lista da frota" + veiculoss +" e quem o dirige é o "+ getNome_Motorista());
//
//    }

}
