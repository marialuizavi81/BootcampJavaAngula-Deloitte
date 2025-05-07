package dia2.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String nomemotorista;
    private String cnh;
    private Veiculo VeiculoAtual;

    List<Veiculo> veiculos = new ArrayList<Veiculo>();

    public Motorista(String nomemotorista, String cnh) {
        this.nomemotorista = nomemotorista;
        this.cnh = cnh;
        VeiculoAtual = null;

    }

    public String getNome() {

        return nomemotorista;
    }

    public String getCnh() {
        return cnh;
    }


    public void setNome(String nome) {
        this.nomemotorista = nomemotorista;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void atribuirVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
        System.out.println("Veiculo atual: "+veiculo.getMarca()+" registrado. adiquirido por "+ this.getNome());

    }
    public void removerVeiculo(Veiculo veiculo, Motorista motorista) {

        System.out.println(" fdsdxcfdfdssf"+veiculos);

        if (veiculos.contains(veiculo)) {
            System.out.println("Veiculo de " + motorista.getNome() + " removido: " + veiculos + "retirado");
            veiculos.remove(veiculo);
        } else {
            System.out.println(" veiculo nao encontrado. ");
        }
    }
    public void dirigirVeiculo(Motorista motorista, Veiculo veiculos){
        System.out.println( motorista.getNome() + " esta dirigindo o veiculo " + veiculos.getMarca() );
    }

}
