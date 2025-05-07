package dia2;

public class Frota extends Veiculo {

    public Frota(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        System.out.println("Adicionando veículo: " + veiculo);
    }

    public void adicionarMotorista(Motorista motorista) {
        System.out.println("Adicionando motorista: " + motorista);
    }

    public void listarVeiculo() {
        System.out.println("Listando veículo");
    }
}
