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
        this.VeiculoAtual = veiculo;
        System.out.println("Veiculo atual: "+veiculo.getMarca()+" registrado. adiquirido por "+ this.getNome());
    }

    public void removerVeiculo(Veiculo veiculo) {
            if (this.VeiculoAtual != null) {
                System.out.println("Veículo removido: " + this.VeiculoAtual.getMarca());
                this.VeiculoAtual = null;
            } else {
                System.out.println("Nenhum veículo atribuído");
            }

        if (veiculos.contains(veiculo)) {
            System.out.println("Veiculo de " + getNome() + " removido: " + veiculos + "retirado");
            veiculos.remove(veiculo);
        } else {
            System.out.println(" veiculo nao encontrado. ");
        }
    }
    public void dirigirVeiculo( Veiculo veiculos){
        if (VeiculoAtual != null){
            System.out.println( getNome() + " esta dirigindo o veiculo " + veiculos.getMarca() );
        }else{
            System.out.println(this.getNome() + " não tem veículo atribuído");
        }

    }

    public void exibirMotorista(){
        System.out.println(" o motorista "+ getNome() + " é portador do CNH " + getCnh());

    }

}
